public class PrintLast2ndElementLinkedList {
    public static void main(String arg[])
    {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        Node i=head;
        while(i.next.next!=null)
        {
            i=i.next;
        }
        System.out.println(i.data);
    }
}
