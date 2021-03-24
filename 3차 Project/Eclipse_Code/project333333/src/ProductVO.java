

import java.util.ArrayList;

public class ProductVO {

private String ses_roomid;
private String ses_product;
private String ses_status;


public ProductVO(String ses_roomid, String ses_product, String ses_status) {
	this.ses_roomid = ses_roomid;
	this.ses_product = ses_product;
	this.ses_status = ses_status;
}


public ProductVO(String ses_product, String ses_status) {
	super();
	this.ses_product = ses_product;
	this.ses_status = ses_status;
}


public String getSes_roomid() {
	return ses_roomid;
}


public void setSes_roomid(String ses_roomid) {
	this.ses_roomid = ses_roomid;
}


public String getSes_product() {
	return ses_product;
}


public void setSes_product(String ses_product) {
	this.ses_product = ses_product;
}


public String getSes_status() {
	return ses_status;
}


public void setSes_status(String ses_status) {
	this.ses_status = ses_status;
}





	
}
