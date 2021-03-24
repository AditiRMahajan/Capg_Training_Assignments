import java.util.*;
public class Result {
	public static void main(String args[])
    {
        int sub1,sub2,sub3;
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Marks of Subject1:");
        sub1=sc.nextInt();
        
        System.out.print("Enter Marks of Subject2:");
        sub2=sc.nextInt();
        
        System.out.print("Enter Marks of Subject3:");
        sub3=sc.nextInt();
        
        sc.close();
       
        System.out.print("The Result of student is: ");
        if(sub1>60 && sub2>60 && sub3>60)
        {
            System.out.print("Passed");
        }
        else if((sub1>60 && sub2>60)||(sub1>60 && sub3>60)||(sub2>60 && sub3>60))
        {
           System.out.print("Promoted");
        } 
        else if(sub1<60 && sub2<60 && sub3<60)
        {
            System.out.print("failed");
        }
       
    }

}
