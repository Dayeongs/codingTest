class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        switch (ineq.concat(eq)) {
            case ">!":
                answer = n > m;
                break;
            case "<!":
                answer = n < m;
                break;
            case ">=":
                answer = n >= m;
                break;
            case "<=":
                answer = n <= m;
                break;
        }
        return answer ? 1 : 0;
    }
}