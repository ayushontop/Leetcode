class Solution {
     public String makeGood(String s) {
    Stack <Character> stk = new Stack<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>=65 && s.charAt(i)<=90){ 
            
            if(!stk.empty() && stk.peek()==Character.toLowerCase(s.charAt(i)) ){  
                stk.pop();
            }else stk.push(s.charAt(i)); 
        }else{ 
            if(!stk.empty() && stk.peek()==Character.toUpperCase(s.charAt(i)) ){ 
                stk.pop();
            }else stk.push(s.charAt(i));
        }
        
    }
        String ans ="";
        while(!stk.empty())ans=stk.pop()+ans;  
        return ans;
    }
}