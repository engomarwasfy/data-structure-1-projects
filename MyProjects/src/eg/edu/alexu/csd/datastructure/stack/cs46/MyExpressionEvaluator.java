package eg.edu.alexu.csd.datastructure.stack.cs46;



import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;
//with check style
public class MyExpressionEvaluator implements IExpressionEvaluator {

    @Override
    public String infixToPostfix(final String expression) {
        // TODO Auto-generated method stub
        StringBuilder answer = new StringBuilder();
        StringBuilder finalanswer = new StringBuilder();
        StringBuilder check = new StringBuilder();
        char ch2;
        String str;
        StringBuilder ans = new StringBuilder();
      
if(expression.length()!=0 && !isoperator(expression.charAt(expression.length()-1))&&!isoperator(expression.charAt(0))){
        MyStack s = new MyStack();
        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);
            if(ch ==' ') {
                continue;
            } 
            
            if((i+1)!=expression.length()&&isOperand(ch)&&isOperand(expression.charAt(i+1))){
                ch2=expression.charAt(i+1);
                 str = new StringBuilder().append(ch).append(ch2).toString();
               //answer+=" "+str;
                 answer.append(' ');
                 answer.append(str.toString());
               i++;
            }
            else if(isOperand(ch)){
               // answer+=" "+ch;
                answer.append(' ');
                answer.append(ch);
            } 
             else if(isoperator(ch)){
                while (!s.isEmpty()
                        && HasHigherPrec(s.peek().toString().charAt(0), ch)&& s.peek().toString().charAt(0)!='(' ){
                   // answer += " "+s.peek();
                    answer.append(' ');
                    answer.append(s.peek());
                    s.pop();
                }
                s.push(ch);
            }
                else if(ch=='('){
                    s.push(ch);
                }
                else if(ch==')'){
                while(!s.isEmpty()&&s.peek().toString().charAt(0)!='('){
                    
                  // answer+=" "+s.peek();
                    answer.append(' ');
                    answer.append(s.peek());
                    s.pop();
                }
                s.pop();
            }
        }
      
        while(!s.isEmpty()){
            
          //  answer+=" "+s.peek();
            answer.append(' ');
            answer.append(s.peek());
            s.pop();
        }

    }

else{
    throw new RuntimeException("Check your inputs");
}       
        
        /*for(int i=1;i<answer.length();i++){
            finalanswer.append (answer.toString().charAt(i));
        }*/
        if(answer.charAt(1)>='0'&&answer.charAt(1)<='9'){
       evaluate(answer.toString());
        }
       else{
           for(int i=0;i<answer.length();i++){
               if(isOperand(answer.charAt(i))){
                   check.append('3');//replace with character 3
               }
               else{
                   check.append(answer.charAt(i));
               }   
           }
           evaluate(check.toString());
       }
    
        
        return answer.toString();
    }    
        
 



    @Override
    public int evaluate(final String expression) {
        // TODO Auto-generated method stub
        MyStack st =new MyStack();
        int op1;
        int op2;
        float answer;
        char ch2;
      //  if((expression.equals("5 3 + 2 * 3 / 3 * 4 2 * - 16 2 / -"))){
        //    return 0;
      //  }
        
        if (!isoperator(expression.charAt(0))&& expression.length()!=0)
                {
                    for(int i=0;i<expression.length();i++){
                        char ch =expression.charAt(i);
                        if(ch==' ') {
                            continue;
                        }
                        if(isOperand(ch)&&isOperand(expression.charAt(i+1))){
                            ch2=expression.charAt(i+1);
                            String s = new StringBuilder().append(ch).append(ch2).toString();
                           st.push(s);
                           i++;
                        }
                        else if(isOperand(ch)&&expression.charAt(i+1)==' '){
                            st.push(ch);
                        }
                        else if(isoperator(ch)){
                            if (st.size()<2){
                                throw new RuntimeException("Check your inputs");
                            }
                            else{
                                op2=Integer.parseInt("" + st.pop());
                                op1=Integer.parseInt("" + st.pop());
                                answer=get(op1,op2,ch);
                                st.push((int)answer);
                           }
                            
                            
                            
                        }
                    }
                    if(st.size()!=1){
                        throw new RuntimeException("Check your inputs");
                    }
                    else{
                    return   Integer.parseInt(""+st.pop());
                    }
                 
            
                }
        return 0;
    }
        
    
    
    public boolean isOperand(final char x){
        if(x >= '0' && x <= '9') {
            return true;
        }
        if(x >= 'a' && x <= 'z') {
            return true;
        }
        if(x >= 'A' && x <= 'Z') {
            return true;
        }
        return false;
    }
    
    
  public boolean isoperator(final char x){
      
      if(x == '+' || x == '-' || x == '*' || x== '/') {
        return true;
    }

      return false;
  }
  int GetOperatorval(final char x){
      int weight = 0; 
      switch(x)
      {
      case '+':weight = 1;break;
      case '-':weight = 1;break;
      case '*':weight=2;break;
      case '/':weight=2;break;
    default:
        break;
      }
      return weight;
  }


    
 boolean  HasHigherPrec(final char x,final char y){
        return GetOperatorval(x)>=GetOperatorval(y);
}

float get(final int op1,final int op2,final char ex){
    switch (ex) {
    case '+':
        return((float)op1 + op2);
        
    case '-':
        return((float)op1 - op2);
       
    case '*':
        return((float)op1 * op2);
    case '/':
        return((float)op1 / op2);
    default:
        break;
 
}
    return 0;//?????? i don't know but it can't work without this
   
}
}