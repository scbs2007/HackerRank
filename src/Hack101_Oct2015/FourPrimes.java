package Hack101_Oct2015;
import java.util.*;

public class FourPrimes {

	public static boolean isPrime(long n)
	{
		for(long i =2; i< n/2; ++i)
		{
			if(n%2==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n = sc.nextInt();
        
        sc.close();
	}

}
