import java.util.Iterator;
import java.util.PriorityQueue;

public class Exam3 {
    public static void main(String[]args)
    {
        PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
        q1.add(22);
        q1.add(23);
        q1.add(24);
        q1.add(25);
        q1.add(26);
        q1.add(27);
        System.out.println("head"+q1.peek());
        System.out.println("elements present in the queue are");
        Iterator itr=q1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());


        }
        q1.remove();

        System.out.println("after removing the  first element existing elements present in the queue");
        Iterator<Integer> itr2=q1.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());


            }
        q1.remove();
        System.out.println("after removing the elements existing elements present in the queue");
        Iterator<Integer> itr3=q1.iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());


        }


    }

    }



