package jump2java;

import java.util.Scanner;

public class S0416_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 ");
		int num = sc.nextInt();
		
		System.out.printf("%d 의 약수 \n", num);
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.printf("%d\n",i);
			}
		}
	}
}
