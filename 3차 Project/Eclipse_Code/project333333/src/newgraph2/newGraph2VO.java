package newgraph2;

public class newGraph2VO {
private double Value;
private double Value2;
private double Value3;
private double Value4;

public double getValue() {
	return Value;
}

public void setValue(double value) {
	Value = value;
}

public newGraph2VO(double value) {
	super();
	Value = value;
}
public newGraph2VO(double value,double value2 ) {
	super();
	
	
	Value = value;
	Value2=value2;
}

public newGraph2VO(int value, int value2, int value3, int value4) {
	super();
	Value = value;
	Value2 = value2;
	Value3 = value3;
	Value4 = value4;
}


}
