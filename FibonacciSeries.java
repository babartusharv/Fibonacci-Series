import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class FibonacciSeries
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		//int n1,n2,a,b,c,cntr;
		FibonacciSeries n = new FibonacciSeries();
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> fib = new ArrayList<Integer>();
		int k = s.nextInt();
		
		for(int i = 0;i<k;i++)
		{
		    int n1 = s.nextInt();
		    int a=n.pb(n1);
		   
		    int cntr = 0;
		    while(a>0)
		    {
		        n1 = n1 - a;
		        fib.add(a);
		        a = n.pb(n1);
		        cntr = cntr + 1;
		        
		    }
		    if(a==0)
		    {
		        int b = fib.size();
		        System.out.print(cntr);
		         System.out.print(" ");
		        for(int j=(b-1) ; j>=0 ; j--)
		        {
		            System.out.print(fib.get(j) + " ");
		        }
		    }
		    else
		    {
		        System.out.println("-1");
		    }
		    
		    System.out.println(" ");
		    
		        fib.clear();
		}
	}
	
	int pb(int m)
    {
        if (m<=0) return 0;
        int a =1;
        int b = 2;
        int c;
        while(b<=m)
        {
            c=a+b; 
            a=b;
            b=c;
        }
        
        return a;
    }

    
    
}