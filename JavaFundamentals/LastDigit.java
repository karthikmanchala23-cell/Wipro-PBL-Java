import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        if(num1%10 == num2%10){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        sc.close();
    }
}
