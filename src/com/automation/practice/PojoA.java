package com.automation.practice;

public class PojoA 
{
	public static void main(String[] args) 
	{
		Pojo p = new Pojo();
		p.setA(20);
		int a = p.getA();
		System.out.println(a);
	}
}
