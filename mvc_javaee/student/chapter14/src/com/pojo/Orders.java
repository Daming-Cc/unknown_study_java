package com.pojo;
/*
 * 订单的pojo
 */
public class Orders {
	private Integer ordersid;	//订单id
	private User user;	//用户的pojo
	public Integer getOrdersid() {
		return ordersid;
	}
	public void setOrdersid(Integer ordersid) {
		this.ordersid = ordersid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
