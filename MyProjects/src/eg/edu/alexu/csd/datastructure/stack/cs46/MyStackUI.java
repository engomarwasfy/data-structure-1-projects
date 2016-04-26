package eg.edu.alexu.csd.datastructure.stack.cs46;

import java.util.Scanner;

public class MyStackUI {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int choose=1;
        Object ob;
        Object poped;
        boolean check;
        MyStack help = new MyStack();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("please choose an operation");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Get size");
            System.out.println("5: Check if empty");
            choose= sc.nextInt();
            switch(choose){
            case 1: System.out.println("please enter a value");
           ob = sc.next();
          help.push(ob);
          break;
            case 2:
               poped = help.pop();
               System.out.println("the poped value is "+poped);
               break;
            case 3:
                System.out.println("the peeked value is"+help.peek());
                break;
            case 4:
                System.out.println("the size is"+help.size());
                break;
            case 5:
                check = help.isEmpty();
                if(check){
                    System.out.println("stack is empty");
                }
                else{
                    System.out.println("stack is not empty");
                }
                break;
            default:
                System.out.println("wrong choosen please enter again ");
            }
            
            }
            

            
            
            
            
            
        }

    }


