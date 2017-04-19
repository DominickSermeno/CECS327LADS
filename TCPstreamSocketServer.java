package lab7;



public class TCPstreamSocketServer 
{
	public static void main(String[] args) 
	{
        
       /*
        *Server code goes here  
        * 
        **/ 
		
	} // end of main 
	
	
	//Dominick
	  public static long fibonacci(long n) 
	  {
	        if (n <= 1)
	        {
	        	//do nothing+
	        }
	        else
	        {
	        	n = fibonacci(n-1) + fibonacci(n-2);
	        }
	        return n;
	    }
	  
	  public static void nextEvenFib(long n)
	  {
		  long temp = 1;
		  long evens[]= new long[5];
		  int i = 0;
		  for(int ii = 0; ii < 5; ii++)
		  {
			  while(temp%2!=0)
			  {
				  temp = fibonacci(n+i);
				  i++;
			  }
			  evens[ii] = temp;
			  temp++;
			  i++;
		  }  
		  System.out.println("The Next Five Even Fibonacci Values are: " );
		  for (int iii = 0; iii < 5; iii++)
		  {
			  System.out.println(evens[iii]);
		  }
		  
	  }
	//Lori
	public int nextLargerRand() 
	{
		return 0;
	}
	//Steph
	public int nextPrime(int prime){
		boolean isPrime = false;

	    int start = 2;

	    while (!isPrime) {
	    	prime += 1;
	        int m = (int) Math.ceil(Math.sqrt(prime));

	        isPrime = true;
	        for (int i = start; i <= m; i++) {
	            if (prime % i == 0) {
	                isPrime = false;
	                break;
	            } 
	        }
	    }
	    return prime;
	
	}
} // end of server program 


	

