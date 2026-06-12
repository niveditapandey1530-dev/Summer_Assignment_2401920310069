class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int j=0;
        String ans="";
        while(j<n){
            if(chars[i]==chars[j])  j++;
            else{
                ans+=chars[i];
                int len=j-i;
                if(len>1) ans+=len;
                i=j;
                j++;
            }
        }
        ans+=chars[i];
        int len=j-i;
        if(len>1) ans+=len;
        for(int k=0;k<ans.length();k++){
            chars[k]=ans.charAt(k);
        }
        return ans.length();
    }
}