package array;

public class trappingWater {
    public static int trappingRainWater(int height[]) {
        int n = height.length;

        // left max boundary -array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right max boundary -array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // water lavel = min(leftmax boun,right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = water level -height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;

    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println(trappingRainWater(height));
    }

}
