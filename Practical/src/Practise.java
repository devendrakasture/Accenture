import java.util.*;
import java.io.*;

class Practise {
	public  static int getSum(int n)
    {
        int sum = 0;
     
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
 
        return sum;
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    
    	int n=sc.nextInt();
    	System.out.println("ENter the Given no="+n);
    	 System.out.println( getSum(n));
    }
    	
    	 
}
    	 
    	    /* Function to get sum of digits */
    
    	 
    	
    	 
    	       
    	