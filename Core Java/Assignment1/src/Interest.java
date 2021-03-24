import java.util .*;
public class Interest{
	public static void main(String[] args){
    double sum,rate,t,SI,CI;
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the Principle Amount:");
    sum=sc.nextDouble();
    
    System.out.println("Enter the Time Period:");
    t=sc.nextDouble();
    
    System.out.println("Enter the Rate of Interest");
    rate=sc.nextDouble();
    
    SI=(sum*rate*t)/100;
    
    CI=sum*Math.pow(1.0+rate/100.0,t)-sum;
    
    System.out.println("Simple Interest="+SI);
    System.out. println("Compound Interest="+CI);
   }
}