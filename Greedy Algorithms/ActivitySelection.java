import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//TC: O(n)
public class ActivitySelection {

    // use this for unsorted end time000
    public int activitySelection(int[] start, int[] finish) {
        // code here
        if (start.length < 1 || finish.length < 1 || finish.length != start.length) {
            return 0;
        }

        int n = start.length;
        int activity[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            activity[i][0] = start[i];
            activity[i][1] = finish[i];
        }

        Arrays.sort(activity, Comparator.comparingInt(o -> o[1]));

        int maxCount = 1;
        int lastEnd = activity[0][1];
        for (int i = 1; i < activity.length; i++) {
            if (activity[i][0] > lastEnd) {
                maxCount++;
                lastEnd = activity[i][1];
            }
        }

        return maxCount;

    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        // end time basis sprted

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {

                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
