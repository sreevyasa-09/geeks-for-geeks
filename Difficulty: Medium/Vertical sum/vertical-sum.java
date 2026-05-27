/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Solution {
    public ArrayList<Integer> verticalSum(Node root) {
        // add your code here
        Queue<Vertical>q= new LinkedList<>();
        ArrayList<Integer> ans= new ArrayList<>();
         HashMap<Integer, Integer>map = new HashMap<>();
        q.add(new Vertical(0,root));
     
        while(!q.isEmpty())
        {
            for(int i=0;i<q.size();i++)
            {
                Vertical temp=q.poll();
                map.put(temp.d,map.getOrDefault(temp.d,0)+temp.node.data);
                if(temp.node.left!=null)
                {
                    q.add(new Vertical(temp.d-1,temp.node.left) );
                }
                 if(temp.node.right!=null)
                {
                    q.add(new Vertical(temp.d+1,temp.node.right) );
                }
                
            }
        }
       ArrayList<Integer> keySet=new ArrayList<Integer>(map.keySet());
       Collections.sort(keySet);
       for(int i=0;i<keySet.size();i++)
       {
           ans.add(map.get(keySet.get(i)));
       }
      return ans;  
    }
}
 class Vertical{
    int d;
    Node node;
    Vertical(int d,Node node)
    
    {
        this.d=d;
        this.node=node;
    }
    
}