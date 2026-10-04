import java.util.Stack;

public class LargestRectangleHistogram {
    // tc: O(n^2)
    public static int areaBrute(int heights[]) {
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currHeight = heights[i];
            int currArea = currHeight;
            // left
            for (int left = i - 1; left >= 0; left--) {
                if (heights[left] < currHeight) {
                    break;
                }
                currArea += currHeight;
            }
            // right
            for (int right = i + 1; right < n; right++) {
                if (heights[right] < currHeight) {
                    break;
                }
                currArea += currHeight;
            }

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    // tc:O(n) sc:O(n)
    public static int areaBetter(int heights[]) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        // right smaller
        for (int i = n - 1; i >= 0; i--) {
            while (stack.size() > 0 && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        // left smaller
        for (int i = 0; i < n; i++) {
            while (stack.size() > 0 && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currArea = heights[i] * width;
            ans = Math.max(ans, currArea);
        }
        return ans;
    }

    public static void main(String[] args) {
        int heights[] = { 1, 1 };
        System.out.println(areaBrute(heights));
    }
}
