/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    class CustomNode{
        Node node;
        int col;
        CustomNode(Node node , int col){
            this.node = node;
            this.col = col;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Queue<CustomNode> q = new LinkedList<>();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        
        q.offer(new CustomNode(root , 0));
        
        while(!q.isEmpty()){
            CustomNode currNode = q.poll();
            Node node = currNode.node;
            int col = currNode.col;
            
            if(!map.containsKey(col)){
                map.put(col , new ArrayList<>());
                minCol = Math.min(minCol , col);
                maxCol = Math.max(maxCol , col);
            }
            map.get(col).add(node.data);
            
            if(node.left != null){
                q.offer(new CustomNode(node.left , col - 1));
            }
            if(node.right != null){
                q.offer(new CustomNode(node.right , col + 1));
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = minCol ; i <= maxCol ; i++){
            result.add(map.get(i));
        }
        return result;
    }
}

