package eg.edu.alexu.csd.datastructure.queue.cs46;

import java.util.Scanner;

/**
 * @author wasfy
 *
 */
public class MyQueueUI {
    /**
     * @author wasfy
     *
     */
    private static final int MAG_3 = 3;
    /**
     * @author wasfy
     *
     */
    private static final int MAG_4 = 4;
    /**
     * @author wasfy
     * @param args
     *            test
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        int choose = 1;
        Object ob;
        Object dequeued;
        boolean check;
        MyQueueLinked help = new MyQueueLinked();
        // MyQueueArray help = new MyQueueArray(3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please choose an operation");
            System.out.println("1: enqueue");
            System.out.println("2: dequeue");
            System.out.println("3: Get size");
            System.out.println("4: Check if empty");
            choose = sc.nextInt();
            switch (choose) {
            case 1:
                System.out.println("please enter a value");
                ob = sc.next();
                help.enqueue(ob);
                break;
            case 2:
                dequeued = help.dequeue();
                System.out.println("the dequed value is " + dequeued);
                break;
            case  MAG_3 :
                System.out.println("the size is " + help.size());
                break;
            case  MAG_4 :
                check = help.isEmpty();
                if (check) {
                    System.out.println("Queue is empty");
                } else {
                    System.out.println("Queue is not empty");
                }
                break;

            default:
                System.out.println("wrong choosen please enter again");
            }
        }
    }

}
