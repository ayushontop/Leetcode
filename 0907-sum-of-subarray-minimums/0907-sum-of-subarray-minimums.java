class Solution {
    public int sumSubarrayMins(int[] arr) {
          Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        for(int i = 0; i < n; i++) {
            leftMin[i] = i + 1;
            rightMin[i] = n - i;
        }

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                leftMin[i] = i - stack.peek();
            }
            stack.push(i);
        }
        
        stack.clear();
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                int prevIndex = stack.pop();
                rightMin[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        long result = 0;
        for(int i = 0; i < n; i++) {
            result += arr[i] * ((long)leftMin[i] * rightMin[i]);
            result %= 1000_000_007;
        }
        
        return (int)result;
        
    }
}