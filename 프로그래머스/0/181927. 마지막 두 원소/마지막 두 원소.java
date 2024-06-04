class Solution {
    public int[] solution(int[] num_list) {
        int numSize = num_list.length;
        int[] answer = new int[numSize+1];
        for(int i = 0; i < numSize; i++) {
            answer[i] = num_list[i];
        }
        if (num_list[numSize-2] < num_list[numSize-1]) {
            answer[numSize] = num_list[numSize-1] - num_list[numSize-2];
        } else {
            answer[numSize] = num_list[numSize-1] * 2;
        }
        return answer;
    }
}