static int getNthFibonacciNumber(int N) {
       int fib = 0;
	    int count = 1;
	    int i = 0;
	       int j=1;
           if(N==0){
               return 0;
           }
	   while(count!=N){
	       
	       fib = i+j;
	       i = j;
	       j = fib;
	       count++;
	   }
       return fib;
    }
