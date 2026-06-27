import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean leftToRight = true;

        while(!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if(leftToRight)
                    list.addLast(node.val);
                else
                    list.addFirst(node.val);

                if(node.left != null)
                    q.offer(node.left);

                if(node.right != null)
                    q.offer(node.right);
            }

            ans.add(list);
            leftToRight = !leftToRight;
        }

        return ans;
    }
} {
    
}
