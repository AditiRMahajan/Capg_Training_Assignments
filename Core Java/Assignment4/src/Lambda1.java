/**
 * Application to perform basic arithmetic operations using lambda expressions and functional interface
 * @author ADITI
 *
 */
public class Lambda1 {
	
	@FunctionalInterface
	public interface arithmeticOperation {
		public int arithmetic(int a,int b);
	}
	
	public static void main(String[] args) {
		
		//Arithmetic Operation using Lambda Expressions
		arithmeticOperation addition = (a, b) -> a+b;
		arithmeticOperation subtraction = (a, b) -> a-b;
		arithmeticOperation multiplication = (a, b) -> a*b;
		arithmeticOperation division = (a, b) -> a/b;
		
		System.out.println("Addition: "+addition.arithmetic(3, 4));
		System.out.println("Subtraction: "+subtraction.arithmetic(5, 2));
		System.out.println("Multiplication: "+multiplication.arithmetic(3, 4));
		System.out.println("Division: "+division.arithmetic(4, 2));
	}
	
    

}
