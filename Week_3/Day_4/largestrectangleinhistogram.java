class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maximum = 0;
        for(int i = 0; i <= heights.length; i++) {
            while(!stack.isEmpty()&&(i==heights.length||heights[i]<heights[stack.peek()])){
                int height=heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width=i;
                } else {
                    width=i-stack.peek()-1;
                }
                maximum=Math.max(maximum, height*width);
            }
            stack.push(i);
        }
        return maximum;
    }
}
