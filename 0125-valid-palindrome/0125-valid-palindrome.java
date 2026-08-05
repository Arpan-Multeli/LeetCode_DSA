class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(arr[left])){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(arr[right])){
                right--;
                continue;
            }

            char c1 = Character.toLowerCase(arr[left]);
            char c2 = Character.toLowerCase(arr[right]);

            if(c1 != c2){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}