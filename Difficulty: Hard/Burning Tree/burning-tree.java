      class Solution {
    Node tgt;
    int timer;
    public int burn(Node root,int target){
        if(root==null)return 0;
        if(root.data==target){
           tgt=root;
           return -1;
        }
        int left=burn(root.left,target);
        int right=burn(root.right,target);
        if(left<0){
            timer=Math.max(timer,Math.abs(left)+right);
            return left-1;
        }
        if(right<0){
            timer=Math.max(timer,Math.abs(right)+left);
            return right-1;
        }
        return 1+Math.max(left,right);
    }
    public int giveHeight(Node root){
        if(root==null)return 0;
        int left=giveHeight(root.left);
        int right=giveHeight(root.right);
        return Math.max(left,right)+1;
    }
    public int minTime(Node root, int target) {
        timer=Integer.MIN_VALUE;
        tgt=null;
        int a=burn(root,target);
        int ht=giveHeight(tgt)-1;
        return Math.max(timer,ht);
    }
}