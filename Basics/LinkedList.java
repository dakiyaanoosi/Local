package Basics;
public class LinkedList
{
    Node head;
    int size;

    LinkedList()
    {
        size=0;
    }

    public class Node
    {
        Node next;
        String data;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addLast(String data)
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            return;
        }

        Node lastNode=head;

        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
        }

        lastNode.next=newNode;
        size++;
    }

    public void removeFirst()
    {
        if(head == null)
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = this.head.next;
        size--;
    }
 
    public void removeLast()
    {
        if(head == null)
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
        if(head.next == null)
        {
            head = null;
            return;
        }
 
 
        Node currNode = head;
        Node lastNode = head.next;
        
        while(lastNode.next != null)
        {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
 
 
        currNode.next = null;
        size--;
    }
 
    public int getSize() {
        return size;
    }
 
    public void printList()
    {
        Node currNode=head;

        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }

        System.out.println("null");
    }

    public void addInMiddle(int index, String data)
    {
        if(index > size || index < 0)
        {
            System.out.println("Invalid Index value");
            return;
        }

        Node newNode = new Node(data);

        if(index == 0)
        {
            newNode.next = head;
            head = newNode;
        }
        else
        {
            Node currNode = head;
            for(int i = 1; i < index; i++)
            {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        
        size++;
    }
}