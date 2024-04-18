package Cleanning;

import java.util.*;

public class Cleanning {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		
		for(int i = 0; i < num; i++) {
			int num2 =sc.nextInt();
			sum = num2/25;
			num2 = num2%25;
			sum2 = num2/10;
			num2 = num2%10;
			sum3 = num2/5;
			num2 = num2%5;
			sum4 = num2/1;
			System.out.println(sum +" " + sum2 + " " + sum3 + " " + sum4);
		}
	}
}