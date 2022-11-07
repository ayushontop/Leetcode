class Solution {
    public int maximum69Number (int num) {
        StringBuilder nums = new StringBuilder();
        nums.append(num);
        for(int i=0;i<nums.length();i++)
        {
            if(nums.charAt(i)=='6')
            {
                nums.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(nums.toString());
      }
    
 }
        
