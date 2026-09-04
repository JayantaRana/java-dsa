//tc: O(m * n)

public class FloodFillAlgorithm {

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];

        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    // helper TC: O(m * n)
    public static void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc]
                || image[sr][sc] != orgColor) {
            return;
        }

        // 1. Mark the current cell as visited
        vis[sr][sc] = true;
        image[sr][sc] = color;

        // left
        helper(image, sr, sc - 1, color, vis, orgColor);
        // right
        helper(image, sr, sc + 1, color, vis, orgColor);
        // up
        helper(image, sr - 1, sc, color, vis, orgColor);
        // down
        helper(image, sr + 1, sc, color, vis, orgColor);

    }

    public static void main(String[] args) {
        int image[][] = { { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 } };
        int sr = 1;
        int sc = 1;
        int color = 2;

        floodFill(image, sr, sc, color);

        for (int row[] : image) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
