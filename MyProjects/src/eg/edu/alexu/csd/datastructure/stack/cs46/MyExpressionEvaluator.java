package eg.edu.alexu.csd.datastructure.stack.cs46;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;

public class MyExpressionEvaluator implements IExpressionEvaluator {

    @Override
    public String infixToPostfix(String expression) {
        // TODO Auto-generated method stub
        return null;
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
