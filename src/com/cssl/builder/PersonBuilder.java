package com.cssl.builder;

//����Ľ�����
public abstract class PersonBuilder {
	

	// ����ͷ�ķ���
	public abstract void buildHead();

	// ��������ķ���
	public abstract void buildBody();

	// ����������
	public abstract Person getResult();
}
