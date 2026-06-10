package Week_2.Day_3;

import java.util.Arrays;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        if(n<2) return false;
        char ch=s.charAt(0);
        for( int lsub=1;lsub<=n/2;lsub++){
        if(n % lsub!=0){
            continue;
        }
        int i=0;
        int j=i+lsub;
        boolean flag=true;
        while(i<n&&j<n){
            char[] arr=s.substring(i,i+lsub).toCharArray();
            char[] arr1=s.substring(j,j+lsub).toCharArray();
            if(Arrays.equals(arr,arr1)!=true){
                flag=false;
                break;
            }
            i=i+lsub;
            j=j+lsub;
        }
        if (flag) return true;
       }
       return false;
    }
} {
    
}
