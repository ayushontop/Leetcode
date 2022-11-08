class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp= new HashMap<>();
        PriorityQueue<Character> pq= new PriorityQueue<>((x,y)->mp.get(y)-mp.get(x));
        
        for(char c: s.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char cs: mp.keySet())
        {
            pq.add(cs);
        }
        StringBuilder ans= new StringBuilder();
        
        while(pq.isEmpty()!=true)
        {
            char ch= pq.remove();
            
            for(int i=0;i<mp.get(ch);i++)
            {
                ans.append(ch);
            }
        }
        return ans.toString();
        
        
    }
}