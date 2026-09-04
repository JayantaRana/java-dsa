// Input 3: 
// "one hundred twenty-five" 
// Output 3: 
// 125 

import java.util.HashMap;

public class WordToNumber {
    public static void convertWordtoNumber(String words) {
        HashMap<String, Integer> map = new HashMap<>();

        // Basic numbers
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);

        // Tens
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);

        // Multipliers
        map.put("hundred", 100);
        map.put("thousand", 1000);
        map.put("million", 1000000);
        map.put("billion", 1000000000);

        String tokens[] = words.toLowerCase().split(" ");

        for (String token : tokens) {
            if (map.containsKey(token)) {
                int value = map.get(token);
                if (value == 100) {

                }
            }
        }

    }

    public static void main(String[] args) {
        convertWordtoNumber("one hundred twenty-five");
    }
}
