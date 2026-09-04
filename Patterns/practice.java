// import java.util.*;

// public class practice {
//     public static void main(String args[]) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         boolean isPrime = true;
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         if (isPrime) {
//             if (n == 1) {
//                 System.out.println("This is neither prime not composite");
//             } else {
//                 System.out.println("This is a prime number");
//             }
//         } else {
//             System.out.println("This is not a prime number");
//         }
//     }
// }

// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         System.out.println("Enter your number ");
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         if (n % 2 == 0) {
//             System.out.println("NOT prime");
//         } else {
//             System.out.println("Prime");
//         }
//     }
// }

public class practice {
    public static void main(String[] args) {
        int x = 5;
        do {
            System.out.print(x + " ");
            x--;
        } while (x > 0);
    }
}