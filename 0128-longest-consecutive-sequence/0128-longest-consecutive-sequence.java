class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int num:nums)
        {
            set.add(num);
        }
        int max=0;
        
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int cur= num;
                int count=1;
                while(set.contains(cur+1))
                {
                    cur++;
                    count++;
                }
                if(count>max)
                {
                    
                    max=count;
                }
            }
        }
        return max;
        
        
    }
}