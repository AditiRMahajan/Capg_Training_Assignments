import java.util.Scanner;

abstract class dessertItem{
    int candy,cookie,icecream,price,number;
    abstract void getCost();
}


class Owner extends dessertItem{
    Owner(int num1,int num2,int num3){
        candy = candy + num1;
        cookie = cookie + num2;
        icecream = icecream + num3;
    }

   
    void getCost(){
        number = candy+cookie+icecream;
        price = (candy*60) + (cookie*70) + (icecream*10);
        System.out.println("Total "+ number + " items are added and Cost of these items is "+ price+ " Rs." );
    }
}

class Customer extends dessertItem{
    Customer(int num1,int num2,int num3){
        candy = candy + num1;
        cookie = cookie + num2;
        icecream = icecream + num3;
    }
    void getCost(){
        number = candy+cookie+icecream;
        price = (candy*60) + (cookie*70) + (icecream*10);
        System.out.println("Total price of buying elements is "+price+" Rs.");
    }
}



public class dessert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Owner/Customer:");
        String type = sc.next();
        if(type.equals("Owner")){
            System.out.println("Enter the number of candies");
            int val1 = sc.nextInt();
            System.out.println("Enter number of cookies");
            int val2 = sc.nextInt();
            System.out.println("Enter number of icecream");
            int  val3 = sc.nextInt();
            dessertItem item1 = new Owner(val1, val2, val3);
            item1.getCost();
        }
        else{
            System.out.println("Welcome to Dessert Shop");
            System.out.println("Enter number of candies");
            int val1 = sc.nextInt();
            System.out.println("Enter number of cookies");
            int val2 = sc.nextInt();
            System.out.println("Enter number of icecream");
            int  val3 = sc.nextInt();
            dessertItem item2 = new Customer(val1, val2, val3);
            item2.getCost();
        }
        sc.close();

    }
}