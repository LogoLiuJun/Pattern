package com.cssl.builder;
//被构建的复杂对象类
//复杂对象是指那些包含多个成员属性的对象,这些成员属性也可以认为部件或零件

public class Person {
     //人有头和身体
	 private String head;
	 private String body;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
