import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> queue=new LinkedList<>();
        int[] result=new int[nums.length-k+1];
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            while(!queue.isEmpty() && queue.peekLast()<nums[i]){
                queue.removeLast();
            }
            queue.add(nums[i]);
            if(i>=k-1){
                result[idx++]=queue.peek();
                if(queue.peek() == nums[i-k+1]){ 
                    queue.remove();
                }
            }
        }

        return result;
    }
} {
    
}
