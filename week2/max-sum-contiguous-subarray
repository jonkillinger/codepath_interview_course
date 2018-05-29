public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int maxSum = A.get(0);
        int curSum = A.get(0);
        for(int i = 1; i < A.size(); i++){
            if(A.get(i) > curSum){
                curSum = A.get(i);
            } else {
                curSum += A.get(i);
            }
            if(maxSum < curSum){
                maxSum = curSum;
            }
            
        }
        return maxSum;
    }
}
