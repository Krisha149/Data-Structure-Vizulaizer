//Doubly Linkedlist

class doublylinkedlist
{
    class node
    {
        int data;
        node next;
        node prev;
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
            first.prev=n;
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
            while (temp.next!=null) 
            {
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
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
            if(first.next==null && first.prev==null)
            {
                first=null;
            }
            else
            {
                node del=first;
                first=first.next;
                first.prev=null;
                del.next=null;
            }
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
            if(first.next==null && first.prev==null)
            {
                first=null;
            }
            else
            {
                node temp=first;
                while (temp.next!=null) 
                {
                    temp=temp.next;    
                }
                temp.prev.next=null;
                temp.prev=null;
            }
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
            while (temp!=null) 
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }    
            System.out.println();
            System.out.println();
        }
    }
}
