public class Solution {
    public int isPalindrome(String A) {
        int s = 0;
        int e = A.length() - 1;
        while(s < e){
            if(!Character.isLetter(A.charAt(s))){
                s++;
                continue;
            }
            if(!Character.isLetter(A.charAt(e))){
                e--;
                continue;
            }
            //System.out.println(Character.toLowerCase(A.charAt(s)) + " and " + Character.toLowerCase(A.charAt(e)));
            if(s < e){
                if(Character.toLowerCase(A.charAt(s)) != (Character.toLowerCase(A.charAt(e)))){
                    return 0;
                }
            }
            s++;
            e--;
        }
        return 1;
    }
}
