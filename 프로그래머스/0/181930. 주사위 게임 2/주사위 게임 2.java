import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        long distinctCount = Arrays.stream(new int[] {a, b, c})
                                   .distinct()
                                   .count();
        if (distinctCount == 1) {
            answer =  (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (distinctCount == 2) {
            answer = (a + b + c) * (a*a + b*b + c*c);
        } else {
            answer = a + b + c;
        }
        return answer;
    }
}