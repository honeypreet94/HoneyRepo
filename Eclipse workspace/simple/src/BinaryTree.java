class NodeT
{
    NodeT left;
    NodeT right;
    int data;
    NodeT(int d)
    {
        data=d;
        left=right=null;
    }
}
public class BinaryTree {
    public static void main(String arg[])
    {
        NodeT node1=new NodeT(1);
        NodeT node2=new NodeT(2);
        NodeT node3=new NodeT(3);
        NodeT node4=new NodeT(4);
        NodeT node5=new NodeT(5);
        NodeT node6=new NodeT(6);
        NodeT root=node1;
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.right=node6;

        System.out.println("PreOrder");
        preorder(root);
        System.out.println("INOrder");
        inorder(root);
        System.out.println("PostOrder");
        postorder(root);


    }

    static void preorder(NodeT root)
    {
        System.out.println(root.data);
        if(root.left!= null)
            preorder(root.left);
        if(root.right!= null)
            preorder(root.right);


    }

    static void postorder(NodeT root)
    {
        if(root.left!= null)
            postorder(root.left);
        if(root.right!= null)
            postorder(root.right);
        System.out.println(root.data);
    }

    static void inorder(NodeT root)
    {

        if(root.left!= null)
            inorder(root.left);
        System.out.println(root.data);
        if(root.right!= null)
            inorder(root.right);

    }
}
