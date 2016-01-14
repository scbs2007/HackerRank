package Practice;
import java.util.*;

class JavaStack{
   
   public static void main(String []argh)
   {
      Scanner s = new Scanner(System.in);
      
      while (s.hasNext()) {
         String input=s.next();
            //Complete the code
          boolean flag = true;
          Stack<Character> sc = new Stack<Character>();
         for(int i=0;i<input.length(); ++i){
             char c = input.charAt(i);
             if(c=='{' || c=='(' || c=='['){
                 sc.push(c);
             }
             else if(c==')'|| c=='}' || c==']')
             {
                 if(sc.empty()==true)
                 {
                     flag = false;
                     break;
                 }
                 else if((c == '}' && sc.peek() == '{') || (c == ')' && sc.peek() == '(') || (c == ']' && sc.peek() == '['))
                     sc.pop();
                 else
                 {
                     flag = false;
                     break;
                 }
                 
             }    
                 
         }
         if(sc.empty()==false)
        	 flag = false;
          if(flag)
              System.out.println("true");
          else
              System.out.println("false");
      }
      
   }
}
