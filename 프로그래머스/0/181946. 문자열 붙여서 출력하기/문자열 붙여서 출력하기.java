import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        
        StringBuilder str = new StringBuilder();
        str.append(a);
        str.append(b);
        
        System.out.println(str);
    }
}