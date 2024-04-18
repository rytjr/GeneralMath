package BinaryChange2;

import java.util.*;

public class BinaryChange2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num2 = sc.nextInt();
		
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 36) {
			String str = Integer.toString(num2, num);
			System.out.print(str.toUpperCase());
		}
				
	}
}