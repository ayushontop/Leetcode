class Solution {
    public int numDecodings(String s) {
    char ld = s.charAt(0);
        if (ld == '0') 
        {
          return 0;  
        } 
        int Count = 1, totalNum = 1;
        for (int i = 1; i < s.length(); i++) {
            char digit = s.charAt(i);
            int temp = digit == '0' ? 0 : totalNum, tempTotalNum = temp;
            if (ld > '0' && ld <= '2' && (ld != '2' || digit <= '6')) {
                tempTotalNum += Count;
            }
            ld = digit;
            totalNum = tempTotalNum;
            Count = temp;
            if (totalNum == 0) return 0;
        }
        return totalNum;
        
    }
}