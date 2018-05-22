public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        if(A == null){
            return new ArrayList<Integer>();
        }
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> returnArr = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++){
            if(numMap.containsKey(B - A.get(i))){
                returnArr.add(numMap.get(B - A.get(i)) + 1);
                returnArr.add(i + 1);
                break;
            }
            if(!numMap.containsKey(A.get(i))){
                numMap.put(A.get(i), i);
            }
        }
        return returnArr;
    }
}
