class Solution {
    public boolean halvesAreAlike(String s) {
        int len= s.length();
      int mid = len/2;   
    String s1 = s.substring(0,mid);
    String s2 = s.substring(mid,len);
         
    int s1len = s1.length();
    int s2len = s2.length();
    
    String r1 = s1.replaceAll("[aeiouAEIOU]", "");
    String r2 = s2.replaceAll("[aeiouAEIOU]", "");
    
     
    int r1len = r1.length();
    int r2len = r2.length();
    
    
    int x = s1len-r1len;
    int y = s2len-r2len;

    
   if(x==y)
   return true;
    else
        return false;
        
    }
}