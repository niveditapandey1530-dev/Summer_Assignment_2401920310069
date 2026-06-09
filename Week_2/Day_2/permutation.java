class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] frq1=new int[26];
        int[] frq2=new int[26];
        for(char ele:s1.toCharArray()){
            frq1[ele-'a']++;
        }
        int i=0;
        int j=0;
        while(j<m){
            frq2[s2.charAt(j)-'a']++;
            if(j-i+1>n){
                frq2[s2.charAt(i)-'a']--;
                i++;
            }
            
            if(Arrays.equals(frq1,frq2)) return true;
            j++;

        }
        return false;
    }
}
