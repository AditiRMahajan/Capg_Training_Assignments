
public class RangeOfArmstrong {
	   public static void main(String args[]){
          System.out.println("Armstrong numbers between 100 and 999 are:");
	      for (int num = 100; num<1000; num++){
	         int temp, rem, sum = 0;
	         temp = num;
	         while(temp != 0) {
	            rem = temp % 10;
	            sum = sum + (rem * rem * rem);
	            temp = temp / 10;
	         }
	         if(sum == num){
	            System.out.println(num);
	         }
	      }
	   }
}
