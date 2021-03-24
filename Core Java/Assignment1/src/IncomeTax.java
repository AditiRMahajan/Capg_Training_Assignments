import java.util.*;
public class IncomeTax {
	public static void main(String args[]){
	double tax=0,CTC;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter CTC:");
	CTC=sc.nextDouble();
	if(CTC<=180000)
		tax=0;
	else if(CTC>181000 && CTC<=300000)
		tax=0.1*CTC;
	else if(CTC>300000 && CTC<=500000)
		tax=0.2*CTC;
	else if(CTC>500000 && CTC<=1000000)
		tax=0.3*CTC;

	System.out.println("Income tax amount is "+tax);
	}

}
