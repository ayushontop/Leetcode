class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int ans=0;
        for(int i=1;i<colors.length();i++)
        {
            if(colors[i]==colors[i-1])
            {
                ans+=min(neededTime[i],neededTime[i-1]);
                if(neededTime[i-1]>neededTime[i])
                    swap(neededTime[i-1],neededTime[i]);
            }
            
        }
        return ans;
        
    }
};