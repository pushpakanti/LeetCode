/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {

        Queue<Node> q= new LinkedList<>();
        if(root==null) return null;
        q.offer(root);

        while(!q.isEmpty())
        {
            int levelSize= q.size();
            Node prev= null;

            for(int i=0; i< levelSize; i++)
            {
                Node current= q.poll();
                if(prev!=null){
                    prev.next=current;
                }
                prev=current;

                if(current.left!=null)
                {
                    q.add(current.left);
                }
                if(current.right!=null)
                {
                    q.add(current.right);
                }


            }
        }
        return root;

        
    }
}