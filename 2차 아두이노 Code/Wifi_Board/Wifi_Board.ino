#include <ArduinoJson.h>
#include <SoftwareSerial.h>

// 모바일 HostSpot의 ID와 패스워드 (변경할 부분)
const String SSID = "chu";
const String PASSWORD = "12345678";
// 서버주소와 포트 (변경할 부분)
const String SERVER_IP = "192.168.137.1";
const String SERVER_PORT = "8081";

// AT 명령 저장
String cmd = "";
// 전송 데이터 저장
String sendData = "";
// WiFi 접속 실패 여부
boolean FAIL_8266 = false;

// TX, RX
SoftwareSerial esp(3, 2);
SoftwareSerial s(4, 5);

void setup() {
  Serial.println("Start module connection");
  do {

    Serial.begin(9600);
    s.begin(9600);
    esp.begin(9600);
    // ESP8266 모듈 재시작
    esp.println("AT+RST");
    delay(1000);
    // 만약 재시작되었다면
    if (esp.find("ready")) {
      Serial.println("Module ready");
      // ESP8266 모듈의 모드를 듀얼모드로 설정 (클라이언트)
      esp.println("AT+CWMODE=1");
      delay(1000);
      // AP에 접속되면
      if (cwJoinAP()) {
        Serial.println("AP successful");
        FAIL_8266 = false;
        delay(5000);
        Serial.println("Start buffer initialization");
        if (esp.available() > 0) {
          char a = esp.read();
          Serial.write(a);
        }
        Serial.println();
        Serial.println("Buffer initialization terminated");
      } else {
        Serial.println("AP connection failure");
        delay(500);
        FAIL_8266 = true;
      }
    } else {
      Serial.println("Module connection failure");
      delay(500);
      FAIL_8266 = true;
    }
  } while (FAIL_8266);
  Serial.println("Module connection complete"); //와이파이 연결 성공
}
boolean a = true;
String message = "";
String result = "";
String url = "";
int time = 0;
float voltageValue, dbValue;

void loop() {


  time ++;
  Serial.println(time);
  voltageValue = analogRead(A0) / 1024.0 * 5.0;
  dbValue = voltageValue * 50.0 - 30;
  Serial.print(dbValue, 1);
  Serial.println(" dBA");
  String db = (String)dbValue;

  if (dbValue >= 85) {
    message = "B1&slboard_decibel=" + db; // 가로등명칭 전달 / 데시벨
    url = "GET /project2/SlBoardInsert.do?sllamp_name=";
    url += message;
    s.write('w');
    sendDataToServer(message);

  }
  message = "";



  if (time == 500) {
    result = "";
    url = "GET /project2/Check";
    sendDataToServer(message); //URL요청
    Serial.println(result);
    DynamicJsonBuffer jsonBuffer;
    JsonObject& root = jsonBuffer.parseObject(result);

    String A1 = root["A1"];
    String A2 = root["B1"];
    String A3 = root["C1"];

    if (A1 == "on") {
      s.write('b');
      delay(300);
    } else if (A1 == "off") {
      s.write('c');
      delay(300);
    }

    if (A3 == "on") {
      s.write('d');
      delay(300);
    } else if (A3 == "off") {
      s.write('e');
      delay(300);
    }


  }


  if (time == 501) {
    time = 0;
  }





} // loop 문 종료


void sendDataToServer(String data) {
  Serial.println("Start the data transfer part");
  cmd = "AT+CIPSTART=\"TCP\",\"" + SERVER_IP + "\"," + SERVER_PORT + "\r\n";
  Serial.println("Attempt to connect to server");
  esp.println(cmd);
  // 웹 서버에 접속되면
  if (esp.find("OK")) {
    Serial.println("Server connection successful");
  } else {
    Serial.println("Server connection failed");
  }

  // 서버로 GET 메시지 전송
  cmd = url;
  cmd += data;
  cmd += "\r\nConnection: close\r\n\r\n";

  Serial.println(cmd);
  esp.print("AT+CIPSEND=");
  esp.println(cmd.length());
  if (esp.find("OK")) {
    Serial.println("Ready to send to server");
  } else {
    Serial.println("Failed to prepare to send to server");
  }
  esp.println(cmd);

  //데이터 전송이 완료되면
  if (esp.find("OK")) {
    Serial.println("Data transfer successful");
    Serial.println();
    delay(5000);
    Serial.println("Attempt to receive data");
    boolean check = false;
    while (esp.available()) {
      char c = esp.read();
      Serial.write(c);
      if (c == '/') {
        check = !check;
      }
      else if (check == true) {
        result += c;
      }
    }
    Serial.println();
    Serial.println("End Receiving Data");
  } else {
    Serial.println("Data transfer failed");
    sendDataToServer(data);
  }
  delay(100);
}

boolean cwJoinAP() {

  String cmd = "AT+CWJAP=\"" + SSID + "\",\"" + PASSWORD + "\"";
  esp.println(cmd);
  if (esp.find("OK")) {
    return true;
  } else {
    return false;
  }
}
