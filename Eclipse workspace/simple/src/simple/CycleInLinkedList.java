package simple;

public class CycleInLinkedList {
    Node head=null;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void add(int d)
    {
        Node new_node=new Node(d);
        if(head==null)
            head = new_node;
        else
        {
            Node traverse=head;
            while(traverse.next!=null)
            {
                traverse=traverse.next;
            }
            traverse.next=new_node;
        }

    }

    public void loopDetect()
    {
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Loop found");
                break;
            }
        }
    }

    public void display()
    {
        Node traverse=head;
        while(traverse!=null)
        {
            System.out.println(traverse.data);
            traverse=traverse.next;
        }

    }
    public static void main(String arg[])
    {
        CycleInLinkedList list=new CycleInLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.head.next.next.next=list.head;
        list.loopDetect();

    }
}
