//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int last;
        int num;
        int ans=0;
        int on= n;
        
        while(n>0)
        {
            last= n%10;
            num= last*last*last;
            ans+=num;
            n/=10;
        }
        if(on==ans)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
        // code here
    }
}