//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // int i=0;
        ArrayList<Integer> sums= new ArrayList<>();
        // int sum=0;
      find(arr,0,0,N,sums);
      return sums;
        // code here
    }
    void find(ArrayList<Integer> arr, int i,int sum, int n, ArrayList<Integer> sums)
    {
        
        if(i==n)
        {
            sums.add(sum);
            return;
        }
        find(arr,i+1,sum+arr.get(i),n,sums);
        find(arr,i+1,sum,n,sums);
    }
    
}