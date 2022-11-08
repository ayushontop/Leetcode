class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> map1= new HashMap<>();
        HashMap<Character,Boolean> map2= new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map1.containsKey(ch1))
            {
                if(map1.get(ch1)!=ch2)
                {
                    return false;
                }
                
            }
            
            else
            {
                if(map2.containsKey(ch2))
                {
                    return false;
                }
                else
                {
                    map1.put(ch1,ch2);
                    map2.put(ch2,true);
                }
                
            }
        }
        return true;
        
    }
}