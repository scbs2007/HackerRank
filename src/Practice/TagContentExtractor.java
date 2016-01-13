package Practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      int flag;
      while(testCases>0){
         String line = in.nextLine();
         Pattern p = Pattern.compile("<(.+)>([^><]+)</\\1>");
         

          Matcher m = p.matcher(line);
          int i;
          flag =0;
          while(m.find())
          {
              System.out.println(m.group(2));
              flag = 1;
          }
          if(flag ==0)
              System.out.println("None");
             //Write your code here
         
         testCases--;
      }
   }
}
