class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> ans=new ArrayList<>();
        boolean[] bool = new boolean[n];
        String[] sorted = new String[n];
        for(int i=0;i<n;i++) {
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            sorted[i]=new String(arr);
        }
        for(int i=0;i<n;i++){
            if(bool[i])  continue;
            List<String> ansgrp= new ArrayList<>();
            ansgrp.add(strs[i]);
            bool[i]=true;
            for(int j=i+1;j<n;j++){
                if(! bool[j]&&sorted[i].equals(sorted[j])){
                    ansgrp.add(strs[j]);
                    bool[j]=true;
                }
            }
            ans.add(ansgrp);
        }
        return ans;
    }
}