package lesson3;

import java.util.HashMap;
import java.util.Map;

public class Homework1 {
    private static final String [] INPUT_DATA = {
            "Moscow",
            "St.Petersburg",
            "Vladimir", "Moscow", "Vladimir",
            "Omsk",
            "Voronezh",
            "Omsk","Omsk","Omsk",
            "London",
            "Rome",
            "London"
    };

    public static void main(String[] args) {
        Map <String, Integer> frequencyByWord = new HashMap<>();
        for (String word : INPUT_DATA) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, frequency + 1);
        }
        for (Map.Entry<String, Integer> entry : frequencyByWord.entrySet()) {
            System.out.printf("Город %s встречается %d раз %n", entry.getKey(),entry.getValue());
        }
            
        }
            
        }
