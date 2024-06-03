class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for (int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            if (num%2 == 0) {
                even += Integer.toString(num);
            } else {
                odd += Integer.toString(num);
            }
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}