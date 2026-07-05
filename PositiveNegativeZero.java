import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a integer:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        sc.close();
    }
}
