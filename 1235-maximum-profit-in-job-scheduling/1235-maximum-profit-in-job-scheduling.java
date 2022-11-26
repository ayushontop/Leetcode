class Solution {
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        Job[] arr = new Job[startTime.length]; // group together
        for(int i=0;i<arr.length;i++){
            arr[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(arr, (v1, v2) -> v1.start - v2.start); // sort by start time
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return rec(arr, 0, dp); // find the best subset
    }

    int rec(Job[] arr, int idx, int[] dp) {
        if(idx == arr.length)
            return 0;
        if(dp[idx] != -1)
            return dp[idx];
        int i = idx+1;
        while(i < arr.length && arr[i].start < arr[idx].end){ // skip jobs overlapping with current job
            i++; // Array is sorted, so we can use binary search here
        }
        return dp[idx] = Math.max(arr[idx].profit + rec(arr, i, dp), rec(arr, idx + 1, dp));
    }
    
    class Job{
        int start, end, profit;
        Job(int s, int e, int p){ start=s; end=e; profit=p; }
    }
    
}