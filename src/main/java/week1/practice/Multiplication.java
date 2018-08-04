package week1.practice;

import java.util.Scanner; 

public class Multiplication {

	public static void main(String[] args) {
		int tname=0;
		int mul=0;
		String output=null;

       System.out.println("enter which table u want to print");
		Scanner sc=new Scanner(System.in);
		System.out.println("upto");
		System.out.println(System.in);
		tname=sc.nextInt();
		mul=sc.nextInt();
		for(int i=1;i<=mul;i++)
		{
			output=i+"*"+mul+"="+i*mul;
		
			System.out.println(output);
		

	}

}
}