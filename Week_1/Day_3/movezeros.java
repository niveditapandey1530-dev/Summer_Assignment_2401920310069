class Solution {
    public void moveZeroes(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)  nums[flag++]=nums[i];

        }
        while(flag<nums.length)  nums[flag++]=0;
    }
}