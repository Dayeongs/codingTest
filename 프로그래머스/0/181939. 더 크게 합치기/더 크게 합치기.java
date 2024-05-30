class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(a).append(b);
        int num1 = Integer.parseInt(sb1.toString());
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b).append(a);
        int num2 = Integer.parseInt(sb2.toString());
        
        if (num1 >= num2) {
            answer = num1;
        } else {
            answer = num2;
        }
        return answer;
    }
}