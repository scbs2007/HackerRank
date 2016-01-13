package Practice;

import java.util.Scanner;
import java.util.regex.*;

public class TagContentExtractor{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      int flag;
      while(testCases>0){
         String line = in.nextLine();
         Pattern p = Pattern.compile("<(.+)>[^><]*</\\1>");
          Matcher m = p.matcher(line);
          int i;
          flag =0;
          while(m.find())
          {
              for(i =m.start(); line.charAt(i)!='>'; ++i)
                  {}
              ++i;
              int fp =0;
              for(; line.charAt(i)!='<'; ++i)
                  {
                  fp = 1;
                  System.out.print(line.charAt(i));
                  }
              if(fp==0)
                System.out.print("None");
              System.out.println();
              flag = 1;
          }
          if(flag ==0)
              System.out.println("None");
             //Write your code here
         
         testCases--;
      }
   }
   
}
