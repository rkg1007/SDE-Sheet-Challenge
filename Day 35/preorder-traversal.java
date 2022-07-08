/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

import java.util.*;

public class Solution {
    static void dfs(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.data);
            dfs(root.left, res);
            dfs(root.right, res);
        }    
    }
    
    public static List<Integer> getPreOrderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }
}
