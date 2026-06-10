package Week_2.Day_3;

public class Solution {
    public int strStr(String haystack, String needle) {
        int lenh=haystack.length();
        int lenn=needle.length();
        for(int i=0;i<=lenh-lenn;i++){

            if(haystack.substring(i,i+lenn).equals(needle)) return i;
        }
        return -1;
    }
} {
    
}
