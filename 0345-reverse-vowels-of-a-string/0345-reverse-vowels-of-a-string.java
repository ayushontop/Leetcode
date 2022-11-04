class Solution {
    public String reverseVowels(String s) {
        
        int i=0;
        char[] chars= s.toCharArray();
        int end= s.length()-1;
        int start=0;
        
        String vowels = "aeiouAEIOU";
        while(start<end){
        
        while(start<end && !vowels.contains(chars[start]+"")){
            start++;
        }
        
        while(start<end && !vowels.contains(chars[end]+"")){
            end--;
        }
        
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        
        start++;
        end--;
    }
    return new String(chars);

            
        
    }
}