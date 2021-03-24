
public class sensorVO {
private String id;
private float value;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public float getValue() {
	return value;
}
public void setValue(float value) {
	this.value = value;
}
public sensorVO(String id, float value) {
	super();
	this.id = id;
	this.value = value;
}
@Override
public String toString() {
	return "sensorPercentage [id=" + id + ", value=" + value + "]";
}




}
