class Solution {
    public int[] findErrorNums(int[] a) {
        int i=0;
        while(i<a.length)
        {
            int cor=a[i]-1;
            if(a[i]!=a[cor])
            {
                int temp=a[i];
                a[i]=a[cor];
                a[cor]=temp;
            }
            else
            {
                i++;}
        }
        int[] ar= new int[2];
        for(int x=0;x<a.length;x++)
        {
            if(a[x]!=x+1)
            {
                ar[0]=a[x];
                ar[1]=x+1;
            }
        }
        return ar;

        
    }
}