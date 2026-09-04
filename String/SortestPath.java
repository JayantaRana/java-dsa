public class SortestPath {
    public static void shortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            }
            if (path.charAt(i) == 'S') {
                y--;
            }
            if (path.charAt(i) == 'W') {
                x--;
            }
            if (path.charAt(i) == 'E') {
                x++;
            }

        }
        int x1 = x * x;
        int y1 = y * y;
        double result = Math.sqrt(x1 + y1);
        System.out.println("your result is " + result);
    }

    // WNEENESENNN
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        shortestpath(path);
    }
}
