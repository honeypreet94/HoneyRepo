public class ReverseLinkedList {
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

        Node prev=null,next=null,curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

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
