import java.util.Scanner;


public class AverageMark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<3;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int total = a+b+c;
            int avg = total/3;
            System.out.println("Total marks: "+total);
            System.out.println("Average marks: "+avg);
        }
        scan.close();
    }
}