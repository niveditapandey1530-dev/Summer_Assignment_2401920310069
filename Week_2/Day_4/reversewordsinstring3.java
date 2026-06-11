class Solution {
    public void reverse(StringBuilder sb,int i , int j){
        while(i<=j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder(s);
        while(j<s.length()){
            if(sb.charAt(j)!=' ') j++;
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1);
        return sb.toString();
    }
}