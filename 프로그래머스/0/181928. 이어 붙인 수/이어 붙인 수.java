class Solution {
    public int solution(int[] num_list) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            if (num%2 == 0) {
                str1 += Integer.toString(num);
            } else {
                str2 += Integer.toString(num);
            }
        }
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}