//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends




class MyQueue {

    int front, rear,count;
    
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
		count=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    
	    arr[rear%arr.length]=x;
	    count++;
	    rear++;
	    
	    
	    
	    // Your code here
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(count==0)
	    {
	        return -1;
	    }
	    int z= arr[front%arr.length];
	    arr[front%arr.length]=-1;
	    front++;
	    count--;
	    return z;
	    
		// Your code here
	} 
}




