package com.SpringApp1.service;

public class MathService implements MathInterface {
	public int add(int a,int b){
		return a+b;
	}
	public int power(int a,int b){
		int x= (int)Math.pow(a, b);
		return x;
		
	}


}
