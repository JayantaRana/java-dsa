// import java.util.*;

// public class Common {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter first array size......");
//         int m = sc.nextInt();

//         System.out.println("enter array elements....");
//         String arr1[] = new String[m];
//         for (int i = 0; i < m; i++) {
//             arr1[i] = sc.next();
//         }

//         System.out.println("enter second array size......");
//         int n = sc.nextInt();
//         System.out.println("enter array elements....");
//         String arr2[] = new String[n];
//         for (int i = 0; i < n; i++) {
//             arr2[i] = sc.next();
//         }

//         HashSet<String> set1 = new HashSet<>();
//         for (int i = 0; i < arr2.length; i++) {
//             set1.add(arr2[i]);
//         }

//         HashSet<String> result = new HashSet<>();
//         for (int i = 0; i < arr1.length; i++) {
//             if (set1.contains(arr1[i])) {
//                 result.add(arr1[i]);
//             }
//         }

//         System.out.println("common elemnts.....");
//         System.out.println(result);

//     }
// }

import java.util.*;

public class Common {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size: ");
        int m = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        System.out.println("Enter first array elements:");
        for (int i = 0; i < m; i++) {
            set.add(sc.next());
        }

        System.out.print("Enter second array size: ");
        int n = sc.nextInt();

        HashSet<String> result = new HashSet<>();

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                result.add(str);
            }
        }

        System.out.println("Common Elements: " + result);
    }
}