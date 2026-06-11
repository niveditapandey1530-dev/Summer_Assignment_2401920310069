package Week_2.Day_4;

public class Solution {
    public String decodeString(String s) {
        Stack<String> strings=new Stack<>();
        Stack<Integer> counts=new Stack<>();
        int count=0;
        String decoded="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                count=count*10+(ch-'0');
            }
            else if(ch=='['){
                strings.push(decoded);
                counts.push(count);
                decoded="";
                count=0;
            }
            else if(ch==']'){
                StringBuilder decodestr=new StringBuilder(strings.pop());
                int repeat=counts.pop();
                for(int i=0;i<repeat;i++){
                    decodestr.append(decoded);
                }
                decoded=decodestr.toString();
            }
            else decoded+=ch;
        }
        return decoded;

    }
}
    

