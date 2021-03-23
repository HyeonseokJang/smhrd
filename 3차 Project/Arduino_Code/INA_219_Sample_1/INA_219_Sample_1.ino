#include <Adafruit_INA219.h>
#include <Wire.h>
Adafruit_INA219 ina219_A;
Adafruit_INA219 ina219_B(0x41);
void setup(void) {
  Serial.begin(9600);
  uint32_t currentFrequency;
ina219_A.begin();
ina219_B.begin();

}

void loop(void) {

  float shuntvoltage = 0;
  float busvoltage = 0;
  float current_mA = 0;
  float loadvoltage = 0;
  int power_mW = 0;
  int bpower_mW = 0;
//  shuntvoltage = ina219.getShuntVoltage_mV();       // 션트저항에 걸리는 전압 측정 (션트 전압으로 인해 드롭된 전압)
//  busvoltage = ina219.getBusVoltage_V();            // 버스전압 - 션트전압
//  current_mA = ina219.getCurrent_mA();              // 사용 전류
  power_mW = ina219_A.getPower_mW();                  // 사용 전력
//  loadvoltage = busvoltage + (shuntvoltage / 1000); // 공급 전압
  bpower_mW = ina219_B.getPower_mW();
  String Data = "{\"a\":\"";
  Data += power_mW;
  Data += "\",\"b\":\"";
  Data += bpower_mW;
  Data += "\"}";
//  Serial.print(power_mW);
  Serial.println(Data);
  
    
    
    


  delay(2000);
}
