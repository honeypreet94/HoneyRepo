public class NumberOfNodeCircularLinkedList {
    public static void main(String arg[])
    {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(2);
        Node node5=new Node(1);
        Node head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=head;

        Node i=head;
        int count=1;
        while(i.next!=head)
        {
            count++;
            i=i.next;
        }
        System.out.println(count);
    }
}
