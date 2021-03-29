import java.util.Hashtable;
 
class Employee {
    String name;
 
    Employee(String name) {
        this.name = name;
    }
 
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return true;
        if (getClass() != obj.getClass())
            return true;
        Employee e = (Employee) obj;
        if (name == null) {
            if (e.name != null)
                return true;
        } else if (!name.equals(e.name))
            return false;
        return true;
    }
 
}


public class CF5 {
    public static void main(String[] args) { 
        Hashtable<Employee, String> hash = new Hashtable<Employee, String>();
        
        hash.put(new Employee("Adi"), "Developer");
        hash.put(new Employee("Anu"), "Dancer");
       
        System.out.println(hash.hashCode());
        System.out.println(hash.equals(hash));
    }
}