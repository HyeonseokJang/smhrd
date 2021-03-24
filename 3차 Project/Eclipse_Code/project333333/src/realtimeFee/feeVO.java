package realtimeFee;

public class feeVO {
 private double fee;
private String roomid;
public double getFee() {
	return fee;
}

public void setFee(double fee) {
	this.fee = fee;
}

@Override
public String toString() {
	return "feeVO [fee=" + fee + "]";
}

public feeVO(double fee) {
	super();
	this.fee = fee;
}

public String getRoomid() {
	return roomid;
}

public void setRoomid(String roomid) {
	this.roomid = roomid;
}

public feeVO(double fee, String roomid) {
	super();
	this.fee = fee;
	this.roomid = roomid;
}
 
 
 
}
