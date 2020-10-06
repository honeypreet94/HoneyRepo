class NodeD
{
    int data;
    NodeD next;
    NodeD prev;
    NodeD(int d)
    {
        data=d;
        next=null;
        prev=null;
    }
}

public class ReverseDoublyLinkedList {
    public static void main(String arg[])
    {
        NodeD node1=new NodeD(1);
        NodeD node2=new NodeD(2);
        NodeD node3=new NodeD(3);
        NodeD node4=new NodeD(4);
        NodeD head=node1;
        node1.next=node2;
        node2.next=node3;
        node2.prev=node1;
        node3.next=node4;
        node3.prev=node2;
        node4.prev=node3;

        NodeD prevp=null,nextp=null,curr=head;
        while(curr!=null)
        {
            nextp=curr.next;
            curr.next=prevp;
            curr.prev=nextp;
            prevp=curr;
            curr=nextp;
        }
        head=prevp;

        print(head);
    }

    static void print(NodeD head )
    {
        NodeD i=head;
        while(i!=null)
        {
            System.out.println(i.data);
            i=i.next;
        }
    }
}
