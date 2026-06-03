public class Solution {
    public int[] sortedSquares(int[] nums) {
        int flag=nums.length-1;
        int left=0;
        int right=nums.length-1;
        int [] ans=new int[nums.length];
        while(left<=right){
            if(nums[left]*nums[left]>=nums[right]*nums[right]){
                ans[flag--]=nums[left]*nums[left];
                left++;
            }
            else{
                ans[flag--]=nums[right]*nums[right];
                right--;

            }
        }
        return ans;

    }
}
    

