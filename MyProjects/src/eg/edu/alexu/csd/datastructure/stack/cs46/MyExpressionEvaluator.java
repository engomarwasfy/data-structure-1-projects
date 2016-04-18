package eg.edu.alexu.csd.datastructure.stack.cs46;

import java.util.Scanner;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;

public class MyExpressionEvaluator implements IExpressionEvaluator {

    @Override
    public String infixToPostfix(String expression){
      
        
       // TODO Auto-generated method stub
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
    
     }
}
    
     