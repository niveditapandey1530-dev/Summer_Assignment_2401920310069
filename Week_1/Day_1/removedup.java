class Solution {
    public int removeDuplicates(int[] nums) {
       int prev=0;
       int next=1;
       while(next<nums.length){
           if(nums[prev]!=nums[next]){
                prev++;
                nums[prev]=nums[next];
            }
            next++;
        }
        return prev+1; 
    }
}