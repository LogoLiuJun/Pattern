package com.cssl.builder;

//抽象的建造类
public abstract class PersonBuilder {
	

	// 建造头的方法
	public abstract void buildHead();

	// 建造身体的方法
	public abstract void buildBody();

	// 返回完整的
	public abstract Person getResult();
}
