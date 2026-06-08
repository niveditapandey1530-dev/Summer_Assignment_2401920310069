class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] freq=new int[26];
        for(int ele:magazine.toCharArray()){
            freq[ele-'a']++;
        }
        for(int ele:ransomNote.toCharArray()){
            freq[ele-'a']--;
        }
        for(int i:freq){
            if(i<0) return false;
        }
        return true;
    }
}
