import java.util.Scanner;
import java.util.Stack;

public class Stacks 
{
    static int top;
    static int capacity;
    static int[] array;
    Scanner sc=new Scanner(System.in);

    Stacks()
    {
        System.out.println("enter the size of stack");
        int size=sc.nextInt();
        array=new int[size];
        capacity=size;
         top=-1;
    }

    //to insert the element at the top of the stack
    void push(int data)
    {
        if(top>=(capacity-1))
        {
            System.out.println("stack is overflowed");

        }
        else
        {
            top++;
            array[top]=data;
        }
    }

    //it changes the ith element from the top of the stack
    void change(int data,int term)
    {
        if(top-term+1<0)
        {
            System.out.println("stack is out of bound");
        }
        else
        {
            array[top-term+1]=data;
            System.out.println("the "+ top+1 +"element is replace by -"+data);

        }
    }

    //it prints the stack
    void display()
    {
        if(top==-1)
        {
            System.out.println("array has no memory allocation");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(array[i]);
            }
        }
    }

    //peep
    void peep(int i)
    {
        if(top-i+1<0)
        {
            System.out.println("array is under bound");
        }
        else
        {
            System.out.println("the"+ i +"element from the top is"+ array[top-i+1]);
        }
    }

    //to delete the element from the top of the stack
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is out of bound");
        }
        else
        {
            top--;
            System.out.println("the"+ top +"element is deleted");
        }
    }
}
