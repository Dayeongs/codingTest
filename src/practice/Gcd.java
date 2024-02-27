package practice;

import java.util.Scanner;

public class Gcd {
	
	// 기본해결
	// 1. 2부터 min까지 모든 정수로 나누기
	// 2. max와 min 각각 해당 정수로 나누었을 때 나머지가 0인 경우, 최대공약수(gcd)이다.
	public static int solution(int max, int min) {
		
		int gcd = 0;
		for (int i = 2; i <= min; i++) {
			if (max%i == 0 && min%i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	// 기본해결 - 유클리드 호제법
	public static int solution1(int max, int min) {

		// 나머지
		int reminder;
		
		// 나누는 숫자가 0이 아닌 경우 계속 반복
		while (min != 0) {
			reminder = max%min; // 나머지
			max = min;			// max 나눈값 대입
			min = reminder;		// min에 나머지 대입
		}
		
		return max;
	}
	
	// 재귀함수
	public static int solution2(int max, int min) {
		
		if (min == 0) {
			return max;			
		} else {
			return solution2(min, max%min);
		}

	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int n = in.nextInt();
		System.out.print("두번째 숫자: ");
		int m = in.nextInt();
		in.close();
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		
		// 기본 해결
		int result0 = solution(max, min);
		int result1 = solution1(max, min);
		System.out.println("기본해결");
		System.out.println(n + "과 " + m + "의 최대공약수: " + result0);
		System.out.println(n + "과 " + m + "의 최대공약수: " + result1);
		
		// 재귀함수 이용
		int result2 = solution2(max, min);
		System.out.println("재귀함수");
		System.out.println(n + "과 " + m + "의 최대공약수: " + result2);
		
	}
	
}
