class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int max=0;
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                max=Math.max(max,(r-l)*arr[l]);
                l++;
            }
            else if(arr[l]>=arr[r]){
                max=Math.max(max,(r-l)*arr[r]);
                r--;
            }

        }
        return max;
    }
}
