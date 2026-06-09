class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int[] fre = new int[256];
        int left=0;
        int right=0;
        int max=0;
        while(right<n){
                char ch=s.charAt(right);
                fre[ch]++;
                while(fre[ch]>1){
                char leftChar = s.charAt(left);   
                fre[leftChar]--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}