import java.io.*;
import java.util.*;

class Program5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (word.length() > 0) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

            br.close();

            System.out.println("Word Occurrences:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}