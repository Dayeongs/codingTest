package practice;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 1 <= str의 길이 <= 20
		if (1 > str.length() && str.length() > 20) {
			System.out.println("문자의 길이는 1 ~ 20까지 가능합니다.");
		}
		
		String str1 = "";
		// 대소문자 바꿔서 출력하기
		// 소문자는 대문자로, 대문자는 소문자로 바꾸기
		// 문자열을 문자로 바꾼다.
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch)) {
				str1 += Character.toLowerCase(ch);
			} else {
				Character.toUpperCase(ch);
				str1 += Character.toUpperCase(ch);
			}
		}
		
		System.out.println(str1);
		sc.close();
	}

}
