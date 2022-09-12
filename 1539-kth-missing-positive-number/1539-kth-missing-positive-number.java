class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int mid;
        int end= arr.length;
        while(start<end)
        {
             mid= (start+end)/2;
            if(arr[mid]-1-mid<k)
            {
                start=mid+1;
            }
            else        
                end=mid;
        }
        return start+k;
        
    }
}