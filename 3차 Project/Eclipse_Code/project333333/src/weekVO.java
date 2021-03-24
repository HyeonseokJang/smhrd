
public class weekVO {
	
	private float total;
	float  use;
	public float getTotal() {
		return total;
	}
	public float getUse() {
		return use;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public void setUse(float use) {
		this.use = use;
	}
	public weekVO(float total, float use) {
		super();
		this.total = total;
		this.use = use;
	}
	public weekVO(float use) {
		super();
		this.use = use;
	}
	
	
	
	
	
}
