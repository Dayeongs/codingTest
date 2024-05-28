import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(str.length() <= 1 && str.length() >= 20) {
            System.out.println("Error!");
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            // charAt 타입의 데이터(문자열)에서 특정 문자를 
            // char 타입으로 변환할 때 사용하는 함수
            int j = (int)(str.charAt(i));
            
            if (j > 96) {
                System.out.print((char)((int)(str.charAt(i))-32));
            } else if (j < 96 && j > 64) {
                System.out.print((char)((int)(str.charAt(i))+32));
            }
        }
        
        sc.close();
        
        
    }
}