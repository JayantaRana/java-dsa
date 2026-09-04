import java.util.Scanner;

public class Max {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number ");
    int a = sc.nextInt();
    System.out.println("Enter your second number ");
    int b= sc.nextInt();
    System.out.println("Enter your third number ");
    int c= sc.nextInt();
     if(a>b){
        if(a>c){
            System.out.println("maximum number is "+ a);
        }else{
            System.out.println("maximum number is "+ c);
        }
        
     }else{
        if(b>c){
        System.out.println("maximum number is "+ b);
        }else{
            System.out.println("maximum number is "+ c);
        }
     }
 }
}
