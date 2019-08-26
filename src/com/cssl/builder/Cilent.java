package com.cssl.builder;

public class Cilent {

	public static void main(String[] args) {
		//指挥者
		PersonController pc=new PersonController();
		//指挥的人(具体的建造类)
		PersonBuilder pb=new AngelBuilder();
        //指挥干活
		pc.setBuilder(pb);
		//指挥者拿到最终结果
	   Person p=  pc.construct();
	   System.out.println(p.getBody());
	   System.out.println(p.getHead());
	}

}
