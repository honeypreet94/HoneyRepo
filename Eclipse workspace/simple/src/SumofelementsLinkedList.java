class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
    }

}
public class SumofelementsLinkedList {

    public static void main(String arg[])
    {
        Node node1=new Node(9);
        Node node2=new Node(3);
        Node node3=new Node(3);
        Node firstHead=node1;
        node1.next=node2;
        node2.next=node3;
        Node n1=new Node(7);
       // Node n2=new Node(4);
       // Node n3=new Node(9);
        Node secondHead=n1;
       // n1.next=n2;
       //
        // n2.next=n3;
        Node head=addition(firstHead,secondHead);
        print(head);
    }
    static Node addition(Node firstHead,Node secondHead)
    {

        Node head=null;
        Node i=firstHead;
        Node j=secondHead;
        int carry=0;
        int sum=0;
        while(i!=null && j!=null)
        {
            Node node=new Node((i.data+j.data+carry)%10);
            if((i.data+j.data+carry)>9)
                 carry=1;
            else
                 carry=0;

            //Node node=new Node((i.data+j.data));
            i=i.next;
            j=j.next;
            if(head==null)
                head=node;
            else
            {
                node.next=head;
                head=node;
            }

        }
        if(i==null)
        {
            while(j!=null)
            {
                Node node=new Node((j.data+carry)%10);
                if((j.data+carry)>9)
                    carry=1;
                else
                    carry=0;
                j=j.next;
                if(head==null)
                    head=node;
                else
                {
                    node.next=head;
                    head=node;
                }

            }
        }
        if(j==null)
        {
            while(i!=null)
            {
                Node node=new Node((i.data+carry)%10);
                if((i.data+carry)>9)
                    carry=1;
                else
                    carry=0;
                i=i.next;
                if(head==null)
                    head=node;
                else
                {
                    node.next=head;
                    head=node;
                }

            }
        }
        if(carry==1)
        {
            Node node=new Node(1);
            if(head==null)
                head=node;
            else
            {
                node.next=head;
                head=node;
            }
        }



        return head;
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
