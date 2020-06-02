public class LeftViewOfTree {
    static int max_level = 0;
    public static void main(String arg[])
    {
        NodeT node1=new NodeT(1);
        NodeT node2=new NodeT(2);
        NodeT node3=new NodeT(3);
        NodeT node4=new NodeT(4);
        NodeT node5=new NodeT(5);
        NodeT node6=new NodeT(6);
        NodeT node7=new NodeT(7);
        NodeT root=node1;
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node3.right=node7;
        node3.left=node6;
        node6.left=node5;


        LeftViewOfTree tree=new LeftViewOfTree();
        tree.leftViewUtil(root,1);

    }

    void leftViewUtil(NodeT node, int level)
    {
        // Base Case
        if (node == null)
            return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }
}
