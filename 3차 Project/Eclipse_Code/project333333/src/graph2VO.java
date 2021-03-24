public class graph2VO {
private int value_num;
private int value_time;

public int getValue_num() {
	return value_num;
}
public int getValue_time() {
	return value_time;
}

public void setValue_num(int value_num) {
	this.value_num = value_num;
}
public void setValue_time(int value_time) {
	this.value_time = value_time;
}
public graph2VO(int value_num, int value_time) {
	super();
	
	this.value_num = value_num;
	this.value_time = value_time;
}

}
