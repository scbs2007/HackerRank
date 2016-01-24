//In O(n^2)

package Practice;

import java.util.Scanner;

public class LongestSubstringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i, length = s.length(), righti, lefti;
		StringBuilder longest = new StringBuilder();
		StringBuilder superlongest = new StringBuilder(s.charAt(0)+"");
		
		for(i=1; i < length-1;++i)
		{
			lefti = i-1;
			righti = i+1;
			
			while(lefti >=0 && righti < length)
			{
				if(s.charAt(lefti--) != s.charAt(righti++))
					break;
				longest.delete(0, longest.length());
				longest.append(s.substring(lefti+1, righti));
				if(longest.length()>superlongest.length())
					superlongest = longest;
			}
			lefti = i-1;
			righti = i;
			while(lefti >=0 && righti < length)
			{
				if(s.charAt(lefti--) != s.charAt(righti++))
					break;
				longest.delete(0, longest.length());
				longest.append(s.substring(lefti+1, righti));
				if(longest.length()>superlongest.length())
					superlongest = longest;
			}
			
			
		}
		System.out.println(superlongest.toString());
	}

}
