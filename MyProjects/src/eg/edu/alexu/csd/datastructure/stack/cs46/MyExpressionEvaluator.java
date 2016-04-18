package eg.edu.alexu.csd.datastructure.stack.cs46;

import java.util.Scanner;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;

public class MyExpressionEvaluator implements IExpressionEvaluator {

    @Override
    public String infixToPostfix(String expression){
        throw new RuntimeException("exp "+expression);
        
   /*     // TODO Auto-generated method stub
        String postfixString = " ";
        MyStack S =new MyStack();

        for (int index = 0; index < expression.length(); ++index) {
            char ch = expression.charAt(index);
            if (ch == '(') {
               S.push('(');
            } else if (ch == ')') {
                char oper = S.peek().toString().charAt(0);
                while (!(oper=='(') && !S.isEmpty()) {
                    postfixString += oper;
                    S.pop();
                    oper = S.peek().toString().charAt(0);
                }
                S.pop();
            } else if (ch == '+' || ch == '-') {
                //Stack is empty
                if (S.isEmpty()) {
                   S.push(ch);
                    //current Stack is not empty
                } else {
                    char oper = S.peek().toString().charAt(0);
                    while (!S.isEmpty() || oper=='(' || oper==')') {
                        S.pop();
                        postfixString += oper;
                    }
                    S.push(ch);
                }
            } else if (ch == '*' || ch == '/') {
                if (S.isEmpty()) {
                    S.push(ch);
                } else {
                    char oper = S.peek().toString().charAt(0);
                    while (!(oper=='+') && !(oper=='-') && !S.isEmpty()) {
                        S.pop();
                        postfixString += oper;
                    }
                    S.push(ch);
                }
            } else {
                postfixString += ch;
            }
        }
        while (!S.isEmpty()) {
            char oper = S.peek().toString().charAt(0);
            if (!(oper=='(')) {
                S.pop();
                postfixString += oper;
            }
        }
        return postfixString;
    }

   
    

    @Override
    public int evaluate(String expression) {
        // TODO Auto-generated method stub
        MyStack s =new MyStack();
        String []array; 
      array= expression.split(" ");
        for (int i = 0; i < array.length; i++) {
            

            if (isop(array[i])) {
                int  op2=(int)s.pop();
                int op1 =(int)s.pop();
                switch (array[i].charAt(0)) {
                    case '+': s.push(op1+op2);   break;
                    case '-': s.push(op1-op2);   break;
                    case '*': s.push (op1*op2); break;
                    case '/':s.push(op1/op2);break;
                }
            } else  {
               
                s.push(Integer.valueOf(array[i]));
            }
        }
        if (s.size()==1) {
            return Integer.valueOf(s.pop().toString());
        }
        else{
            throw new RuntimeException("Check your inputs ");
        }
            
    }

    
     boolean isop(String ch) {
        return (ch == "*" || ch == "/" || ch == "+" || ch == "-");
    }*/


//public static void main(String[] args) {
    /*MyExpressionEvaluator  test = new MyExpressionEvaluator();
    System.out.println("Type in an expression like (1+2)*(3+4)/(12-5)\n "
            + "with no monadic operators like in-5 or +5 followed by key");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println("The Expression you have typed in infix form :\n"+str);
    System.out.println("The Equivalent Postfix Expression is :\n"+test.infixToPostfix(str));
}*/

//}
}

    @Override
    public int evaluate(String expression) {
        // TODO Auto-generated method stub
        throw new RuntimeException("eva  "+expression);
    }
}