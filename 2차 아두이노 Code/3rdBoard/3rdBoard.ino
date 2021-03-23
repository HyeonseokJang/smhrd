#include "pitches.h"
#include <Servo.h>
#include <SoftwareSerial.h>
Servo myservo;
SoftwareSerial s(4,5);    // 4:RX 5:TX
//시리얼통신 보드연결

int Yin = A1;
int keyIn = 2;

int BUZZER = 8;

int melody[] = {
  NOTE_C4, NOTE_C5, NOTE_A3, NOTE_A4, NOTE_AS3, NOTE_AS4, 0, 0,
  NOTE_C4, NOTE_C5, NOTE_A3, NOTE_A4, NOTE_AS3, NOTE_AS4, 0, 0,
  NOTE_F3, NOTE_F4, NOTE_D3, NOTE_D4, NOTE_DS3, NOTE_DS4, 0, 0,
  NOTE_F3, NOTE_F4, NOTE_D3, NOTE_D4, NOTE_DS3, NOTE_DS4, 0,
  0, NOTE_DS4, NOTE_CS4, NOTE_D4,
  NOTE_CS4, NOTE_DS4, NOTE_DS4, NOTE_GS3, NOTE_G3, NOTE_CS4,
  NOTE_C4, NOTE_FS4, NOTE_F4, NOTE_E3, NOTE_AS4, NOTE_A4,
  NOTE_GS4, NOTE_DS4, NOTE_B3,  NOTE_AS3, NOTE_A3, NOTE_GS3, 0, 0, 0
};

int noteDurations[] = {
  12, 12, 12, 12, 12, 12, 6, 3,
  12, 12, 12, 12, 12, 12, 6, 3,
  12, 12, 12, 12, 12, 12, 6,
  3, 12, 12, 12, 12,
  12, 12, 6, 6, 18, 18, 18,
  6, 6, 6, 6, 6, 6,
  18, 18, 18, 18, 18, 18, 10, 10, 10,
  10, 10, 10, 3, 3, 3
};
void setup() {
 Serial.begin(9600);
  s.begin(9600);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  
  myservo.attach(9);


  pinMode(keyIn, INPUT_PULLUP);

}
String result = "";
char data;
void loop() {

if(s.available()){
   data = s.read();
    Serial.println(data);   
  }
  if(data == 'w'){
    for(int i = 0 ; i < 20 ; i++){  
    digitalWrite(10,1);
    digitalWrite(12,1);
    digitalWrite(11,0);
    digitalWrite(13,0);
    delay(300);
    digitalWrite(11,1);
    digitalWrite(13,1);
    digitalWrite(10,0);
    digitalWrite(12,0);
    delay(300);
    }
    data = 'z';
    digitalWrite(10,0);
    digitalWrite(11,0);
    digitalWrite(12,0);
    digitalWrite(13,0);    
    
  }else if(data== 'b'){
    digitalWrite(6,1);
  }else if(data=='c'){
    digitalWrite(6,0);
  }else if(data=='d'){
    digitalWrite(7,1);
  }else if(data=='e'){
    digitalWrite(7,0);
  }
  

  


  int Xvalue, Yvalue, ButtonVal;
  Yvalue = analogRead(Yin);
  ButtonVal = digitalRead(keyIn);


 
  myservo.write(map(Yvalue, 0, 700, 70, 110));





  //조이스틱 버튼 눌렀을 때, 피에조 작동

  if (ButtonVal == 0) {
    for (int thisNote = 0; thisNote < (sizeof(melody) / sizeof(int)); thisNote++) {

      int noteDuration = 1000 / noteDurations[thisNote];
      tone(BUZZER, melody[thisNote], noteDuration);

      int pauseBetweenNotes = noteDuration * 1.80;
      delay(pauseBetweenNotes);
      noTone(BUZZER);
    }

  }

  //  result = "";

//서보모터 연결 완료 (360)

}
