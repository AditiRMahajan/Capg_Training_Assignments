package ques_seven;

import java.util.Scanner;

abstract class dessertItem{
    int candy;
    int cookie;
    int icecream;
    int price;
    int number;
    abstract void getCost();
}


class owner extends dessertItem{
    owner(int val1,int val2,int val3){
        candy = candy + val1;
        cookie = cookie + val2;
        icecream = icecream + val3;
    }

   
    void getCost(){
        number = candy+cookie+icecream;
        price = candy*60 + cookie*70 + icecream*10;
        System.out.println("Total "+ number + " item is added and Cost of these item is "+ price+ " Rupees." );
    }
}

class customer extends dessertItem{
    customer(int val1,int val2,int val3){
        candy = candy + val1;
        cookie = cookie + val2;
        icecream = icecream + val3;
    }
    void getCost(){
        number = candy+cookie+icecream;
        price = candy*60 + cookie*70 + icecream*10;
        System.out.println("Total price of buying element is "+price+" Rupees.");
    }
}

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select owner/customer:");
        String value = scan.next();
        if(value.equals("owner")){
            System.out.println("Enter number of candy");
            int val1 = scan.nextInt();
            System.out.println("Enter number of cookies");
            int val2 = scan.nextInt();
            System.out.println("Enter number of icecream");
            int  val3 = scan.nextInt();
            dessertItem obj1 = new owner(val1, val2, val3);
            obj1.getCost();
        }
        else{
            System.out.println("Welcome to Dessert Shop");
            System.out.println("Enter number of candy");
            int val1 = scan.nextInt();
            System.out.println("Enter number of cookies");
            int val2 = scan.nextInt();
            System.out.println("Enter number of icecream");
            int  val3 = scan.nextInt();
            dessertItem obj1 = new customer(val1, val2, val3);
            obj1.getCost();
        }
        scan.close();

    }
}