class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9'){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String original=sb.toString();
        String reverse=sb.reverse().toString();

        return original.equals(reverse);

    }
}