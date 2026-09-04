public class Prime {
    public static void main(String[] args) {
        int num = 9;
        boolean isPrime = true;
        for (int i = 2; Math.sqrt(num) >= i; i++) { // num-1
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT prime");
        }

    }
}
