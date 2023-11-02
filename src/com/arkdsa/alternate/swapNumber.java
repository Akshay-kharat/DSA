package com.arkdsa.alternate;

public class swapNumber {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(" before swap value of a "+a+"\n value of b "+b);
		//a ^=b; // here swaping of nuber is done by using xor operata
		//b ^=a;
		//a ^=b;
		a=a*b; // a=200 
		b=a/b; // b=20
		a =a/b; //a 
		System.out.println(" after swap value of a "+a+"\n value of b "+b);
	}

}
