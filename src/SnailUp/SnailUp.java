package SnailUp;

import java.util.Scanner;


public class SnailUp{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a,b,v;
		int i=1;
		a=sc.nextInt();
		b=sc.nextInt();
		v=sc.nextInt();
		if((v-a)%(a-b)!=0) {
			System.out.println((v-a)/(a-b)+2);
		}
		else if((v-a)%(a-b)==0)  {
			System.out.println((v-a)/(a-b)+1);
		}
		
		

}
}