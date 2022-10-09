class Solution {
    static int isSubstring(String s1, String s2)
    {
        return s2.indexOf(s1);
    }
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++)
        {
            int val= isSubstring(patterns[i],word);
            if(val!=-1)
            {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}