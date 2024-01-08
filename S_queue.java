//Simple Queue

import java.util.*;

class S_queue
{
    Scanner sc=new Scanner(System.in);
    int front=(-1);
    int rare=(-1);
    int size;
    int a[];
    S_queue(int size)
    {
        this.size=size;
        a=new int[size];
    }
    void insertAtrare()
    {
        if(front==(-1)&&rare==(-1))
        {
            System.out.println("Enter Num you insert in Queue");
            int num=sc.nextInt();
            front=0;
            rare=0;
            a[rare]=num;
            System.out.println("Number "+num+" is inserted successfully");
            
        }
        else if(rare==size-1)
        {
            System.out.println("overflow");
        }
        else
        {
            System.out.println("Enter Num you insert in Queue");
            int num=sc.nextInt();
            rare=rare+1;
            a[rare]=num;
            System.out.println("Number "+num+" is inserted successfully");
            
        }

    }
    void deleteAtFront()
    {
        if(front==(-1)&&rare==(-1))
        {
            System.out.println("Underflow");
        }
        else if(front==rare)
        {
            System.out.println(a[front]+"deleted");
            front=(-1);
            rare=(-1);
        }
        else
        {
            front++;

        }

    }
    void display()
    {
            if (front == -1 && rare==-1)
            {
            System.out.println(" Queue is Empty ");
            }
             else
            {
            System.out.print(" Queue is : ");
            for (int i = front; i <= rare; i++)
            System.out.print(a[i] + " ");
            System.out.println(" ");
            }
    }
}
