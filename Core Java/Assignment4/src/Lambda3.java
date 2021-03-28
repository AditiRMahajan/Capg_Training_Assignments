import java.util.function.*;
/**
 * Class Employee containing employee's id,name and salary
 * @author ADITI
 */
class Employee{
	private int id,salary;
	private String name;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

/**
 * Driver class
 */

public class Lambda3 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Aditi",50000);
		Employee emp2 = new Employee(2,"Anusha",30000);
		Employee emp3 = new Employee(1,"Aishwarya",40000);
		
		//Supplier Functional Interface
		Supplier<Integer> func = () -> 20;
		System.out.println("Value returned by Supplier: "+func.get());
		
		//Consumer Functional Interface to update name of employee
		Consumer<Employee> updateName = p -> p.setName("Keshav");
		updateName.accept(emp2);
		System.out.println("Updated name using Consumer: "+emp2.getName());
		
		//Predicate Functional interface to check salary>30000
		Predicate<Employee> chk = e -> e.getSalary() > 30000;
		System.out.println("Is salary greater than 30000 or not: "+chk.check(emp1));
		
		//Function Interface to double the salary
		Function<Employee, Integer> doubleSal = s -> s.getSalary()*2;
		System.out.println("Doubled Salary using Function: "+doubleSal.apply(emp3));
	}

}

@SuppressWarnings("hiding")
@FunctionalInterface
interface Predicate<Employee> {
	boolean check(Employee e);
}

@SuppressWarnings("hiding")
@FunctionalInterface
interface Function<Employee, Integer> {
	Integer apply(Employee s);
}


