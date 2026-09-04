public class SumofDistinctElement {
    public static int uniqueSum(int arr[]) {
        boolean visited[] = new boolean[1000];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!visited[arr[i]]) {
                sum = sum + arr[i];
                visited[arr[i]] = true;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 3, 4, 2 };
        System.out.println("result is  " + uniqueSum(arr));
    }
}
