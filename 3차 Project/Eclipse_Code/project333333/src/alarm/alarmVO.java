package alarm;

public class alarmVO {
	private String ses_wh;

public alarmVO(String ses_wh) {
	   this.ses_wh = ses_wh;
}
public alarmVO() {}
   
public String getSes_wh() {
   return ses_wh;
}
public void setElec(String ses_wh) {
   this.ses_wh = ses_wh;
}
@Override
public String toString() {
   return "Sensor [ses_wh=" + ses_wh + "]";
}

}
