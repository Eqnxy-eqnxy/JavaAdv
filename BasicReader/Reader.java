package BasicReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("путь к файлу"));
            String line = reader.readLine();
            reader.close();

            if (line != null) {
                String[] words = line.split(" ");
                Arrays.sort(words);

                HashMap<String, Integer> wordCountMap = new HashMap<>();
                for (String word : words) {
                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }

                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

                String maxWord = "";
                int maxCount = 0;
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    if (entry.getValue() > maxCount) {
                        maxWord = entry.getKey();
                        maxCount = entry.getValue();
                    }
                }

                System.out.println("Повторяющееся слово: " + maxWord);
                System.out.println("Кол-во повторений: " + maxCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}