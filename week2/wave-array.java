public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Arrays.sort(A);
        for(int i = 1; i < A.size(); i += 2){
            int temp = A.get(i - 1);
            A.set(i - 1, A.get(i));
            A.set(i, temp);
        }
        return A;
    }
}
