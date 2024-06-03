class Solution {
    public String solution(String code) {
        char[] codeList = code.toCharArray();
        String ret = "";
        int mode = 0;
        for(int idx = 0;idx <= codeList.length - 1; idx++) {
            if (codeList[idx] == '1') {
                mode = 1 - mode;
            } 
            if (codeList[idx] != '1') {
                if (mode == 0 && idx % 2 == 0) {
                    ret += String.valueOf(codeList[idx]);
                } 
                if (mode == 1 && idx % 2 != 0) {
                    ret += String.valueOf(codeList[idx]);
                }
            }
        }
        return ret.isEmpty() ? "EMPTY" : ret;
    }
}