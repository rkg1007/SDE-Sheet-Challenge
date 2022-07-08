/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    static void dfs(TreeNode<Integer> root, ArrayList<Integer> res, int h) {
        if (root != null) {
            if (h == res.size()) {
                res.add(root.data);
            }
            dfs(root.left, res, h + 1);
            dfs(root.right, res, h + 1);
        }    
    }
    
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }
}
