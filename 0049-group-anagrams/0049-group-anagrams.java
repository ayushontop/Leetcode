class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n= strs.length;
        
         HashMap<String, ArrayList<String>> hmap = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++)
        {
           String str = strs[i];
           char[] chars = str.toCharArray();
           Arrays.sort(chars);
           String sorted = new String(chars);
           if(hmap.containsKey(sorted))
           {
                hmap.get(sorted).add(str);
           }
           else
           {
            hmap.put(sorted, new ArrayList<String>());
            hmap.get(sorted).add(str);
           }
        }
        List<List<String>> list = new ArrayList<>(hmap.values());
        return list;
        
    }
}