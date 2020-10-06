public class PalindromeLinkedList {
    public static void main(String arg[])
    {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(3);
        Node node6=new Node(2);
        Node node7=new Node(1);
        Node head=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }

        Node prev=null,next=null,curr=slow.next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow.next=prev;

        prev=head;
        next=slow.next;
        while(next!=null)
        {
            if(prev.data==next.data)
            {
                prev=prev.next;
                next=next.next;
            }
            else
            {
                System.out.println("Palindrome does not exist");
                break;
            }
        }
        if(next==null)
            System.out.println("Palindrome exists");


    }

}
