package eg.edu.alexu.csd.datastructure.stack.cs46;

public class Main {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub
      /*  MyStack test = new MyStack();
        test.push(3);
        test.push(4);
        test.push(5);
       test.add(2, 20);
      
       while(!test.isEmpty()){
            
            System.out.println(test.pop());
        }*/
        MyExpressionEvaluator testy=new MyExpressionEvaluator();
        
        String ans;
        int ans2;
       //String in="((a+b)(c+d))+ab+c*t";
       String in="5 3 /";
        
       //ans=testy.infixToPostfix(in);
       ans2=testy.evaluate(in);
        System.out.println(ans2);
        
        
    }

}
