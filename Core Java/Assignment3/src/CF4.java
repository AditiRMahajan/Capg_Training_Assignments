import java.util.*;

class DOB{
    int day;
    int month;
    int year;

    DOB(int day,int month,int year){
        this.day = day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        String x = this.day+"/"+this.month+"/"+this.year;
        return x;
    }

    @Override
    public int hashCode() {
        int result = 1;        
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        DOB dob = (DOB) obj;
        if (day == dob.day && month == dob.month)
            return false;
        return true;
    }
}

class EmpName{
    String Name;
    EmpName(String Name){
        this.Name=Name;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString(){
        return getName();
    }
}


public class CF4 {

    public static void main(String[] args) {
        DOB b = new DOB(4,4,97);
        EmpName e = new EmpName("Aditi");
        
        HashMap<DOB,EmpName> map = new HashMap<DOB,EmpName>();
        map.put(b, e);
        map.put(new DOB(3,2,98),new EmpName("Anusha"));
        map.put(new DOB(3,2,99),new EmpName("Aish"));
        for(Map.Entry<DOB,EmpName> m: map.entrySet()){
            DOB dob = m.getKey();
            EmpName emp = m.getValue();

            System.out.println("Employee DOB: " + dob.toString() + " Name: " + emp.getName());
        }       
    }
}