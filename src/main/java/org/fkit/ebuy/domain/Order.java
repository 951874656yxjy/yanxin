package org.fkit.ebuy.domain;

public class Order {
	
	private int id;
	private String oid;
	private String username;
	private String address;
	private String phone;
	private String status;
	private String totalprice;
	private String good_name;
	private String good_id;
	private String good_picture;
//
//	public Order(int id,String oid, String username, String address, String phone, String totalprice, String status,
//			String good_name, String good_id,String good_picture) {
//			 this.id=id;
//		this.oid=oid;
//			 this.username = username;
//			 this.address = address;
//			 this.phone = phone;
//			 this.totalprice = totalprice;
//			 this.address = address;
//			 this.status = status;
//			 this.good_name = good_name;
//			 this.good_id=good_id;
//			 this.good_picture = good_picture;
//		
//	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ",oid=" + oid + ", username=" + username + ",address="
				+ address + ", phone=" + phone + ",totalprice=" + totalprice + ",status=" + status +", good_name=" + good_name + ", good_id=" + good_id + ", good_picture=" + good_picture + "]";
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getGood_picture() {
		return good_picture;
	}
	public void setGood_picture(String good_picture) {
		this.good_picture = good_picture;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getGood_id() {
		return good_id;
	}
	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}



}
