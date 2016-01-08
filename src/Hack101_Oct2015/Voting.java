package Hack101_Oct2015;

import java.util.*;

public class Voting {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;++i)
            {
            String temp = sc.next();
            if(m.containsKey(temp))
                {
                m.put(temp, m.get(temp)+1);
            }
            else
                m.put(temp, 1);
        }
        int max = -1;String res="";
        for(String e: m.keySet())
        {
        	if(m.get(e)>max)
        	{
        		res = e;
        		max = m.get(e);
        	}
        }
        System.out.println(res);
        sc.close();
    }
    
}