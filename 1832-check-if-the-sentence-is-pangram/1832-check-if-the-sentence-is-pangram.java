class Solution {
    public boolean checkIfPangram(String sentence) {
        String a="abcdefghijklmnopqrstuvwxyz";   
        for (char ch : a.toCharArray()) {
            if (sentence.indexOf(ch) == -1) 
                return false;
        }        
        return true;
    }
}