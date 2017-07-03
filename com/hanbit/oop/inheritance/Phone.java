package com.hanbit.oop.inheritance;

public class Phone {
	private String name, phoneNo,brand;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBradn(){
		return brand;
	}
	
	public String toString(){
		return "길동이에게 02-123-4567번호로"
				+"삼성전화기를 사용해서 안녕이라고 통화했다.";
	}
}
