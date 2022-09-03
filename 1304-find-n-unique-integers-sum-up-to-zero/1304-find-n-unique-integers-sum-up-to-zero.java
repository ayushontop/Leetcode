class Solution {
    public int[] sumZero(int n) {
    int[] arr= new int[n];
        int f=0;
        if(n==0)
        {
            return arr;
        }
        if(n%2!=0)
        {
            n--;
            arr[f++]=0;
        }
        for(int i=1;i<=n/2;i++)
        {
            arr[f++]=i;
            arr[f++]=i*(-1);
        }
        return arr;
    }
}