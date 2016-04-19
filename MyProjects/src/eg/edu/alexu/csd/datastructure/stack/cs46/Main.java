package eg.edu.alexu.csd.datastructure.stack.cs46;

public class Main {

    public static void main(String[] args) {
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
       // String in="((5+3)*2/3)*3-4*2-16/2 ";
        String in="26 3 / 3 14 + 2 / -";
        
      //  String t="1+1+1+1+1+1";
       // ans=testy.infixToPostfix(in);
        ans2=testy.evaluate(in);
        System.out.println(ans2);
        
        
    }

}
