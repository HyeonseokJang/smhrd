
public class chogiVO {
private String sr4;

private int howMany;
public String getSr4() {
	return sr4;
}
public void setSr4(String sr4) {
	this.sr4 = sr4;
}

public int getHowMany() {
	return howMany;
}
public void setHowMany(int howMany) {
	this.howMany = howMany;
}
public chogiVO(String sr4, int howMany) {
	super();
	this.sr4 = sr4;
	
	this.howMany = howMany;
}
@Override
public String toString() {
	return "chogiVO [sr4=" + sr4 + ", howMany=" + howMany + "]";
}





}
