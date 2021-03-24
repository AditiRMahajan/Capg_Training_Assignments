

class Employee{
    int basesalary = 30000;
}
class Manager extends Employee{
    int incentive=0;
    public void setIncentive(int newincentive){
        incentive = incentive + newincentive;
    }
    public void display(){
        int total = super.basesalary + incentive;
        System.out.println(total);
    }
}
class Labour extends Employee{
    int overtime=0;
    public void setOvertime(int newOvertime){
        overtime = overtime + newOvertime;
    }
    public void display(){
        int total = super.basesalary + overtime*1000;
        System.out.println(total);
    }
}

public class emp {

    public static void main(String[] args) {
        Manager m = new Manager();
        Labour l = new Labour();
        m.setIncentive(10000);
        m.display();
        l.setOvertime(3);
        l.display();
    }
}