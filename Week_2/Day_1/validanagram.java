class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] freq=new int[26];
        for(int ele:s.toCharArray()){
            freq[ele-'a']++;
        }
        for(int ele:t.toCharArray()){
            freq[ele-'a']--;
        }
        for(int i:freq){
            if(i!=0) return false;
        }
        return true;
    }
}