class Solution {
    public boolean isValid(String s) {
        List<Character> list=new ArrayList<>();
        if(s.length()==1) return false;
        for(char ch:s.toCharArray()){
            if(ch=='['||ch=='{'||ch=='('){
                list.add(ch);
            }
            else if((ch==']'||ch=='}'||ch==')')){
                if(list.size()==0){
                    return false;
                }
                char top=list.get(list.size()-1);
                if(ch==')' && top!='(') return false;
                if(ch=='}' && top!='{') return false;
                if(ch==']' && top!='[') return false;
                list.remove(list.size()-1);
                
            }
        }
        if(list.size()==0) return true;
        return false;
    }
}