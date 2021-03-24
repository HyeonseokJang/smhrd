

public class SESVO {

	private float wh;
	private float W;
	private float hour;
	private String product;

	public SESVO() {
	}

	public SESVO(String product, float w, float hour, float wh) {
		super();
		this.product = product;
		this.wh = wh;
		W = w;
		this.hour = hour;
	}

	public float getWh() {
		return wh;
	}

	public void setWh(float wh) {
		this.wh = wh;
	}

	public float getW() {
		return W;
	}

	public void setW(float w) {
		W = w;
	}

	public float getHour() {
		return hour;
	}

	public void setHour(float hour) {
		this.hour = hour;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

}
