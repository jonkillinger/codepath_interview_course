public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < A.size(); i++){
            if(A.get(i).length() < smallest){
                smallest = A.get(i).length();
            }
        }
        String curPrefix = A.get(0).substring(0, smallest);
        
        for(int i = 1; i < A.size(); i++){
            String curString = A.get(i);
            for(int ii = 0; ii < curPrefix.length(); ii++){
                if(curString.charAt(ii) != curPrefix.charAt(ii)){
                    curPrefix = curPrefix.substring(0, ii);
                    break;
                }
            }
        }
        return curPrefix;
    }
}
