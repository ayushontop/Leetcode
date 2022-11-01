class Solution {
    public boolean check(int[] arr) {
        // Arrays.sort(arr);
        int count=0;
        int n=arr.length;
         for( int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
                
            }
            // else
            // {
            //     return false;
            // }
        }
        if( arr[n-1]>arr[0])
        {
            count++;
        }
        if(count<=1)
        {
        return true;
        }
        return false;
        
    }
}