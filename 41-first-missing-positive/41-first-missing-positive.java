class Solution {
    public int firstMissingPositive(int[] a) {
        int i=0;
        while(i<a.length)
        {
            int cor=a[i]-1;
            if(a[i]>0&&a[i]<=a.length&&a[i]!=a[cor])
            {
                int temp=a[i];
                a[i]=a[cor];
                a[cor]=temp;
            }
            else
            {
                i++;}
        }
        // List<Integer> l=new ArrayList<Integer>();
        for(int x=0;x<a.length;x++)
        {
            if(a[x]!=x+1)
            {
                return x+1;
            }
        }
        return a.length+1;

        
    }
}