//Circular Linkedlist

class circularlinkedlist
{
    class node
    {
        node next;
        int data;
        node(int data)
        {
            this.data=data;
        }
    }
    node first=null;
    void addfirst(int data)
    {
        node n=new node(data);
        if(first==null)
        {
            first=n;
            n.next=n;
        }
        else
        {
            n.next=first;
            node temp=first;
            while(temp.next!=first)
            {
                temp=temp.next;
            }
            temp.next=n;
            first=n;
        }
    }
    void addlast(int data)
    {
        node  n=new node(data);
        if(first==null)
        {
            first=n;
            n.next=n;
        }
        else
        {
            n.next=first;
            node temp=first;
            while(temp.next!=first)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.next=first;
        }
    }
    void deletefirst()
    {
        if(first==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else if(first==first.next)
        {
            first=null;
        }
        else
        {
            node temp=first;
            node del=first;
            while(temp.next!=first)
            {
                temp=temp.next;
            }
            temp.next=first.next;
            first=first.next;
            del.next=null;
        }
    }
    void deletelast()
    {
        if(first==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else if(first==first.next)
        {
            first=null;
        }
        else
        {
            node temp=first;
            node del;
            while(temp.next.next!=first)
            {
                temp=temp.next;
            }
            del=temp.next;
            temp.next=first;
            del=null;
        }
    }
    void display()
    {
        if(first==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            node temp=first;
            while(temp.next!=first)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(temp.data);
            System.out.println();
        }
    }
}
