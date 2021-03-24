import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n,a,temp,sum=0; 
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();
	        temp=n; 
	        while(n>0)  
	        {  
	        a=n%10;  
	        n=n/10;  
	        sum=sum+(a*a*a);  
	        }  
	        if(temp==sum)  
	        System.out.println("Given number is Armstrong number");   
	        else  
	            System.out.println("Given number is not Armstrong number");  
	         
	    }

}
