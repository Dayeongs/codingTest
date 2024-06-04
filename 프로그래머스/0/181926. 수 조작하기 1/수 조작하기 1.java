class Solution {
    public int solution(int n, String control) {
        for (char ch : control.toCharArray()) {
            switch(ch) {
                case 'w': n = n + 1; break;
                case 's': n = n - 1; break;
                case 'd': n = n + 10; break;
                case 'a': n = n - 10; break;
            }
        }
        return n;
    }
}