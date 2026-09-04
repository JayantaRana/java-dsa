// Input: 25 
// Output: Yes

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 25;
        int square = (int) Math.sqrt(num);
        System.out.println(square * square == num ? "Yes perfect square" : "Not perfect square");
    }
}