package day1.basics;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		// a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of a= " +a+" and b= "+b+" is "+c);
		
	}

}