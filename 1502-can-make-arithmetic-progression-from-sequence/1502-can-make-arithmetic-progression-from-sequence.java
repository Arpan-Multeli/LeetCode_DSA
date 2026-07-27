class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int diff = sorted[1] - sorted[0]; 
        for (int i = 1; i< arr.length - 1; i++){
            if(sorted [i+1] - sorted[i] != diff){
                return false;
            }
        }return true;
    }
}