
public class graph1VO {
private int month;
private int mon_per;
public graph1VO(int month, int mon_per) {
	super();
	this.month = month;
	this.mon_per = mon_per;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getMon_per() {
	return mon_per;
}
public void setMon_per(int mon_per) {
	this.mon_per = mon_per;
}
@Override
public String toString() {
	return "graph1VO [month=" + month + ", mon_per=" + mon_per + "]";
}



}
