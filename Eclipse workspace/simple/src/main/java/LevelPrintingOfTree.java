import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LevelPrintingOfTree {
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
        node2.right=node5;
        node3.right=node7;
        node3.left=node6;

        Queue<NodeT> queue=new LinkedList();
        queue.add(root);

        while(!queue.isEmpty())
        {
            System.out.println(queue.element().data);
            if(queue.element().left!=null)
                queue.add(queue.element().left);
            if(queue.element().right!=null)
                queue.add(queue.element().right);
            queue.remove();

        }


    }
}
