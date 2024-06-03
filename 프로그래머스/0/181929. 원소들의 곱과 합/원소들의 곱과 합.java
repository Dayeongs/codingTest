import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int num1 = Arrays.stream(num_list).reduce((x, y) -> x * y).getAsInt();
        int num2 = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        return num1 < Math.pow(num2, 2) ? 1 : 0;
    }
}