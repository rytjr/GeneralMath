package CenterMove;

import java.util.*;

public class CenterMove {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double sum =3;
		int count = 0;
		
		if(num == 1) {
			sum = 3;
		}
		else {
			for(int i = 2; i < num+1; i++) {
				++count;
				sum = sum + Math.pow(2,count);
			}
		}
		int i = (int)Math.round(sum);
		
		System.out.print(i*i);
	}
}