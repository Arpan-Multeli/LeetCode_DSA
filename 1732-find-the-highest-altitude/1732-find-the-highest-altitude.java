class Solution {
    public int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int highestAlt = 0;
        for(int i = 0; i < gain.length; i++){
            currentAlt = currentAlt + gain[i]; 
            highestAlt = Math.max(currentAlt,highestAlt);
        }
        return highestAlt;
    }
}