package com.cssl.builder;
//指挥者
public class PersonController {
	 PersonBuilder builder;    //指挥者拥有指挥别人的权力

	public PersonBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(PersonBuilder builder) {
		this.builder = builder;
	}
	//产品构建和组装的方法
	public Person construct() {
		builder.buildHead();   //头
		builder.buildBody();   //身体
		return builder.getResult();
	}
}
