package eg.edu.alexu.csd.datastructure.stack.cs46;

import java.util.Scanner;
/**
 * @author wasfy
 * this is app of  project
 *
 */
public class MyExpressionEvaluatorUI {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        
        int choose;
        MyExpressionEvaluator test=new MyExpressionEvaluator();
        String taker ;
        Scanner sc = new Scanner(System.in);
       
        while(true){
            System.out.println("please choose an operation");
            System.out.println("1: infix to postfix");
            System.out.println("2: evaluate postfix expression");
            
            choose= sc.nextInt();
            sc.nextLine();
            switch(choose){
            case 1: 
                System.out.println("please Enter an infix expression");
                taker = sc.nextLine();
                System.out.println("the postfix expression is "+test.infixToPostfix(taker));
                break;
         
            case 2:
                System.out.println("please Enter a postfix expression");
                taker = sc.nextLine();
                System.out.println(taker);
               System.out.println("the value is "+test.evaluate(taker));
                break;
                default : System.out.println("Please Enter Again");
    }
        }
}
}

