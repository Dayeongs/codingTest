package practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요: ");
			int a = in.nextInt();
			
			if (a == 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;	
			} else {
				System.out.println(a + "는 소수일까요? " + primeNum(a));
				break;
			}
		}
		
		in.close();
		
	}
	
	// 1. 2부터 n-1까지 약수가 있는지 확인한다.
	// 2. 있으면 false 반환하고 없으면 true를 반환한다.
	public static boolean primeNum(int n) {
		
		boolean result = true;
		for (int i = 2; i <= (n-1); i++) {
			if (n%i == 0) {
				result = false;
			}
		}
		return result;
		
	}
	
}
