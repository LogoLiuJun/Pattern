package com.cssl.builder;

public class Cilent {

	public static void main(String[] args) {
		//ָ����
		PersonController pc=new PersonController();
		//ָ�ӵ���(����Ľ�����)
		PersonBuilder pb=new AngelBuilder();
        //ָ�Ӹɻ�
		pc.setBuilder(pb);
		//ָ�����õ����ս��
	   Person p=  pc.construct();
	   System.out.println(p.getBody());
	   System.out.println(p.getHead());
	}

}
