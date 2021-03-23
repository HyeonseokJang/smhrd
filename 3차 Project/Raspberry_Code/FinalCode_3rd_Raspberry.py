import requests
import serial
from multiprocessing import Process
import time
import json
import pyfirmata
import RPi.GPIO as GPIO
time_12=[0,0]
time_13=[0,0]
cal_12 =[]
cal_13 =[]

GPIO.setmode(GPIO.BCM)
GPIO.setup(17,GPIO.OUT)
GPIO.setup(18,GPIO.OUT)
GPIO.setup(19,GPIO.OUT)



#DB확인
def checkDB():
    url = "http://172.30.1.38:8080/project2/Json"
    response = requests.get(url)
    webData = response.json()
    return webData

# LED 제어
def LEDControll(port,Status):
#     print(Status)
        
    if len(Status) == 2:
        GPIO.output(port,True)
        
#         print("{} ON".format(port))
        

    elif len(Status) == 3:
       GPIO.output(port,False)
#        print("{} OFF".format(port))
#         sendSec(calculateSec)

# 파라메타 값으로 sensing data 전송하는 메소드
def sendMessage(product,status):
    url_1 = "http://172.30.1.38:8080/project2/OnOff"
    response = requests.get(url_1,params={"product":"{}".format(product),"status":"{}".format(status)})
    print("전송완료")
    print ("name:{}".format(product)+","+"status:{}".format(status))

def sendEdata(product,mW,time):
    url = "http://172.30.1.38:8080/project2/InsertElectirc"
    response = requests.get(url,params={"product":"{}".format(product),"mW":"{}".format(mW),"time":"{}".format(time)})

#12번핀 함수
def Check12(data_12) :
    global cal_12
    global time_12
    if data_12 != 0 :
        cal_12.append(data_12)
        print(cal_12)
        if time_12[0] == time_12[1]:
                time_12[0] = time.time()
        
    else :
        senddata = 0
        if len(cal_12)!=0:
            print ("평균전력계산")
            #data 값 계산
            senddata =  sum(cal_12)/len(cal_12)*335
            cal_12 = []
        if time_12[0] != time_12[1]:
            time_12[1] = time.time()
            calTime_12 = time_12[1]-time_12[0]
            time_12[0] = 0
            time_12[1] = 0
            print(senddata)
            print(calTime_12)
            sendEdata("sr1",senddata,calTime_12)
            
def Check13(data_13) :
    global cal_13
    global time_13
    if data_13 != 0 :
        cal_13.append(data_13)
        print(cal_13)
        if time_13[0] == time_13[1]:
                time_13[0] = time.time()
    else :
        
        if len(cal_13)!=0:
            print ("평균전력계산")
            senddata =  sum(cal_13)/len(cal_13)*17
            cal_13 = []
            
        if time_13[0] != time_13[1]:
            time_13[1] = time.time()
            calTime_13 = time_13[1]-time_13[0]
            time_13[0] = 0
            time_13[1] = 0
            print(calTime_13)
            sendEdata("sr2",senddata,calTime_13)


#==== 코드 시작 =====#
url = "http://172.30.1.38:8080/project2/Json"
response = requests.get(url)
webString = response.json()

print(webString)

# pro1 = Process(target=Check12, args=(1,100))
# pro2 = Process(target=Check13, args=(1,100))
try :
    while True :
        #===== 반복 시작 ======
        for i in webString:
#             Check_Data = webString[i]
#             print (i) # 딕q셔너리 key값
#             print(Check_Data) # 딕셔너리 value값
            if i == 'sr1':
                LEDControll(17,webString[i])
            elif i == 'sr2':
                LEDControll(18,webString[i])
            elif i == 'sr3':
                LEDControll(19,webString[i])
#             Check_Result = CheckPower(webString[i],i)
            webString = checkDB()
        print (webString)
        #시리얼통신 전류값 받아오기!!    
        ser = serial.Serial('/dev/ttyACM1',9600) #아두이노 포트값 확인 
        ser.flushInput()
        result = ser.readline()
#         print(result)
        re =result.decode("utf-8")
#         print(re)
        json_dict=json.loads(re)
        print(json_dict)
        data_12 = int(json_dict["a"])
        data_13 = int(json_dict["b"])

    #     print(json_dict["a"]) #jsonType a값
    #     print(json_dict["b"]) # json type B값
        Check12(data_12) # 시간 체크
        Check13(data_13)
        #=====여기까지 전류 값 측정 및 시간 체크 ======
        
        
except KeyboardInterrupt:
        GPIO.cleanup()
