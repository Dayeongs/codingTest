class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch (ineq.concat(eq)) {
            case ">!":
                answer = n > m ? 1 : 0;
                break;
            case "<!":
                answer = n < m ? 1 : 0;
                break;
            case ">=":
                answer = n >= m ? 1 : 0;
                break;
            case "<=":
                answer = n <= m ? 1 : 0;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        return answer;
    }
}