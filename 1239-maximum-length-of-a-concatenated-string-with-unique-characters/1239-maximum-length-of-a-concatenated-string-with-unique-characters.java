class Solution {
    int max=0;
    public int maxLength(List<String> arr) {
        solve(arr,0,"");
        return max;
    }
    void solve(List<String> list,int i,String s)
    {
        if(i>=list.size())
        {
            if(check(s))
            {
                max=Math.max(max,s.length());
            }
            return;
        }
        if(check(s)==false)
        {return;}
        solve(list,i+1,s+list.get(i));
        solve(list,i+1,s);
        }
        boolean check(String s)
        {
            int arr[]= new int[26];
            for(int i=0;i<s.length();i++)
            {
                arr[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                if(arr[i]>1)
                    return false;
            }
            return true;
        }
    }
