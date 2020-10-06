public class ReverseKElementsLinkedList {
    public static void main(String arg[])
    {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);
        Node node7=new Node(7);
        Node node8=new Node(8);
        Node node9=new Node(9);
        Node node10=new Node(10);
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

        int k=4;
        Node curr=head,prev=null,next=null;
        int flag=1;
        Node temp=null,temp2=null;
        while(curr!=null)
        {
            for(int i=1;i<=k;i++)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                if(curr==null)
                    break;
            }
            if(flag==1)
            {
                temp=head;
                head=prev;
                prev=null;
                temp2=curr;
                flag=0;
            }
            else
            {
                temp.next=prev;
                prev=null;
                temp=temp2;
                temp2=curr;
            }

        }
        temp.next=null;

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
