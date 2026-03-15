/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        
        Queue<Pair>q= new LinkedList<>();
        ArrayList<Integer>  ans = new ArrayList<Integer> ();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        if(root==null)
        return ans;
        
        q.add(new Pair(0,root));
        //map.add(0,root.data);
        int min=0;
        int max=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Pair temp=q.poll();
                int dis=temp.dis;
                min=Math.min(min,dis);
                max=Math.max(max,dis);
                Node t=temp.node;
                if(!map.containsKey(temp.dis))
                {
                    map.put(temp.dis,temp.node.data);
                }
                    if(t.left!=null)
                    {
                        q.add(new Pair(dis-1,t.left));
                    }
                    if(t.right!=null)
                    {
                        q.add(new Pair(dis+1,t.right));
                    }
                
                
            }
        }
        
        List<Integer>l=new ArrayList<>();
        
      for(int i=min;i<=max;i++)
      {
          ans.add(map.get(i));
      }
        
      return ans;  
        
    }
}

class Pair{
    int dis;
    Node node;
    Pair(int dis,Node node)
    {
        this.dis=dis;
        this.node=node;
    }
}