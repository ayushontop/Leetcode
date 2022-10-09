class Solution {
    public boolean judgeCircle(String moves) {
        int s=0;
        int e=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                s++;
            }
            if(moves.charAt(i)=='D'){
                s--;
            }
            if(moves.charAt(i)=='L'){
                e--;
            }
            if(moves.charAt(i)=='R'){
                e++;
            }
        }
        return s==0&&e==0;
    }
}