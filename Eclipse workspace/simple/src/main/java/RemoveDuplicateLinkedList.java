
public class RemoveDuplicateLinkedList {
    public static void main(String arg[])
    {
        Node node1=new Node(1);
        Node node2=new Node(1);
        Node node3=new Node(2);
        Node node4=new Node(2);
        Node node5=new Node(2);
        Node node6=new Node(2);
        Node node7=new Node(3);
        Node node8=new Node(4);
        Node node9=new Node(4);
        Node node10=new Node(4);
        Node head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;
        node9.next=node10;

        Node i=head;
        while(i.next!=null)
        {
            if(i.data==i.next.data)
                i.next=i.next.next;
            else
                i=i.next;

        }

        print(head);
    }

    static void print(Node head )
    {
        Node i=head;
        while(i!=null)
        {
            System.out.println(i.data);
            i=i.next;
        }
    }
}
