//Simple Linkedlist

class linkedlist
{
    class node
    {
        node next;
        int  data;
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
        }
        else
        {
            n.next=first;
            first=n;
        }
    }
    void addlast(int data)
    {
        node n=new node(data);
        if(first==null)
        {
            first=n;
        }
        else
        {
            node temp=first;
            while(temp.next!=null)
            {
                temp=temp.next;
            }  
            temp.next=n;
        }
    }
    void deletefirst()
    {
        if(first==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            node del=first;
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
        else
        {
            node del=first;
            while(del.next.next!=null)
            {
                del=del.next;
            }
            del.next=null;
        }
    }
    void display()
    {
        System.out.println("LINKED LIST");
        if(first==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            node  temp=first;
            while(temp!=null)
            {
                System.out.print(temp.data + " -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
            System.out.println();
        }
    }
}
