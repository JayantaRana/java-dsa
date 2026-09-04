// Start day: Monday 
// Number of days: 13

public class SundayCount {
    public static int countSunDays(String startDay, int numDays) {
        // Map days to index
        String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int startIndex = 0;
        // find index of start day

        for (int i = 0; i < 7; i++) {
            if (days[i].equalsIgnoreCase(startDay)) {
                startIndex = i;
                break;
            }

        }
        int sunDayCount = 0;
        for (int j = 0; j < numDays; j++) {
            int dayIndex = (startIndex + j) % 7;
            if (days[dayIndex].equals("Sunday")) {
                sunDayCount++;
            }
        }

        return sunDayCount;
    }

    public static void main(String args[]) {
        String startDay = "Monday";
        int numDays = 13;
        System.out.println(countSunDays(startDay, numDays));

    }
}
