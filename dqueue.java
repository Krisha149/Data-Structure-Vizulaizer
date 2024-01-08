//Double-ended-Queue

import java.util.*;

class dqueue
{
    Scanner sc=new Scanner(System.in);
    int front=(-1);
    int rear=(-1);
    int size;
    int a[];
    dqueue(int size)
    {
        this.size=size;
        a=new int[size];
    }
    boolean isEmpty()
    {
        if(front==(-1)&&rear==(-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isFull()
    {
        if(front==(rear+1)%size)
        {
            return true;
        }
    else
    {
        return false;
    }
    }
    void insertAtRare()
    {
        if(isEmpty())
        {
            System.out.println("Enter num:");
            int num=sc.nextInt();
            front=0;
            rear=0;
            a[rear]=num;
        }
        else if(isFull())
        {
            System.out.println("overflow");
        }
        else if(rear==size-1)
        {
            System.out.println("Enter num:");
            int num=sc.nextInt();
                rear=0;
                a[rear]=num;
        }
        else
        {
            System.out.println("Enter num:");
            int num=sc.nextInt();
            rear++;
            a[rear]=num;
        }
    }

    void insertAtfront()
    {
        if(isFull())
        {
            System.out.println("overflow");
        }
        else if(isEmpty())
        {
            System.out.println("Enter num:");
            int num=sc.nextInt();
            front=0;
            rear=0;
            a[front]=num;
        }
        else if(front==0)
        {
            front=size-1;
            System.out.println("Enter num:");
            int num=sc.nextInt();
            a[front]=num;
        }
        else
        {
            System.out.println("Enter num:");
            int num=sc.nextInt();
             front--;
             a[front]=num;
        }
    }

    void deleteAtfront()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else if(front==rear)
        {      
             //only one element here
             System.out.println(a[front]+"deleted");
            front=(-1);
            rear=(-1);
        }
        else if(front==size-1)
        {
            System.out.println(a[front]+"deleted.");
                front=0;
        }
        else
        {
            System.out.println(a[front]+"deleted");
            front=(front+1);
        }
    }

    void deleteAtrear()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else if(front==rear)
        {
            System.out.println(a[rear]+"is deleted.");
            front=-1;
            rear=-1;
        }
        else if(rear==0)
        {
            System.out.println(a[rear]+"is deleted");
            rear=size-1;
        }
        else
        {
             System.out.println(a[rear]+"is deleted");
             rear--;
        }


    }
    void dispaly()
    {
        int i=0;
        if(isEmpty())
        {
            System.out.println("Empty Queue");
        }
        else
        {
            System.out.println("Front:"+front+"\nRear:"+rear);
            System.out.println("Queue is:");
            for(i=front;i!=rear;i=(i+1)%size)
            {
                System.out.println(a[i]+" ");
            }
            System.out.println(a[i]);
        }
    }
}
