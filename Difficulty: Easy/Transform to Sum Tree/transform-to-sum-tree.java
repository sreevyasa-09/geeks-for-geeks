/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public void toSumTree(Node root) {
        updateTree(root);
    }
    
    private int updateTree(Node root) {
        if (root == null) return 0;
        
        int left = updateTree(root.left);
        int right = updateTree(root.right);
        
        int trueVal = root.data;
        root.data = left + right;
        return trueVal + root.data;
    }
}