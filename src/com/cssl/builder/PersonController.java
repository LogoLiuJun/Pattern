package com.cssl.builder;
//ָ����
public class PersonController {
	 PersonBuilder builder;    //ָ����ӵ��ָ�ӱ��˵�Ȩ��

	public PersonBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(PersonBuilder builder) {
		this.builder = builder;
	}
	//��Ʒ��������װ�ķ���
	public Person construct() {
		builder.buildHead();   //ͷ
		builder.buildBody();   //����
		return builder.getResult();
	}
}
