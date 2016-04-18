package eg.edu.alexu.csd.datastructure.stack.cs46;

import java.util.Scanner;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;

public class MyExpressionEvaluator implements IExpressionEvaluator {

    @Override
    public String infixToPostfix(String expression) {
        // TODO Auto-generated method stub
        String answer = "";
if(expression.length()!=0 && !isoperator(expression.charAt(expression.length()-1))&&!isoperator(expression.charAt(0))){
        MyStack s = new MyStack();
        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);
            if(ch ==' ') continue; 
            if (isOperand(ch)) {
                answer += " "+ch;
            } else if(isoperator(ch)){
                while (!s.isEmpty()
                        && HasHigherPrec(s.peek().toString().charAt(0), ch)&& s.peek().toString().charAt(0)!='(' ){
                    answer += " "+s.peek();
                    s.pop();
                }
                s.push(ch);
            }
                else if(ch=='('){
                    s.push(ch);
                }
                else if(ch==')'){
                while(!s.isEmpty()&&s.peek().toString().charAt(0)!='('){
                    
                   answer+=" "+s.peek();
                    s.pop();
                }
                s.pop();
            }
        }
      
        while(!s.isEmpty()){
            
            answer+=" "+s.peek();
            s.pop();
        }

    }

else{
    throw new RuntimeException("Check your inputs");
}
        return answer;
  }

    @Override
    public int evaluate(String expression) {
        // TODO Auto-generated method stub
        return 0;
    }
        
    
    
    public boolean isOperand(char x){
        if(x >= '0' && x <= '9') return true;
        if(x >= 'a' && x <= 'z') return true;
        if(x >= 'A' && x <= 'Z') return true;
        return false;
    }
    
    
  public boolean isoperator(char x){
      
      if(x == '+' || x == '-' || x == '*' || x== '/')
          return true;

      return false;
  }
  int GetOperatorval(char x){
      int weight = 0; 
      switch(x)
      {
      case '+':weight = 1;break;
      case '-':weight = 1;break;
      case '*':weight=2;break;
      case '/':weight=2;break;
      }
      return weight;
  }


    
 boolean  HasHigherPrec(char x,char y){
        if(GetOperatorval(x)>=GetOperatorval(y)){
            return true;
        }
        else{
            return false;
         }
        
        
        
}
}