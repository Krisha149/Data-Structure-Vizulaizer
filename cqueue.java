//Circular-Queue

import java.util.Scanner;

class cqueue
{
    Scanner sc=new Scanner(System.in);
    int front=(-1);
    int rear=(-1);
    int size;
    int a[];
    cqueue(int size)
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
        else
        {
             System.out.println("Enter num:");
            int num=sc.nextInt();
            rear=(rear+1)%size;
            a[rear]=num;
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
        else
        {
            System.out.println(a[front]+"deleted");
            front=(front+1)%size;
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
            System.out.println("Queue is:");
            for(i=front;i!=rear;i=(i+1)%size)
            {
                System.out.println(a[i]+" ");
            }
            System.out.println(a[rear]);
        }
    }
}
