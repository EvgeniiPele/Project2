package lesson3;

import java.util.HashMap;
import java.util.Map;

public class HomeWorkOne {
    private static final String[] INPUT_DATA = {
            "Moscow",
            "St.Petersburg", "Moscow", "Moscow",
            "Omsk",
            "Novgorod",
            "London", "Rome",
            "London",
            "Rome", "Rome", "New York",
            "Helsinki",
            "New York"
    };

    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new HashMap<>();

        for (String word : INPUT_DATA) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, frequency + 1);

        }

        for (Map.Entry<String, Integer> entry : frequencyByWord.entrySet()) {
            System.out.printf("Город %s встречается %d раз(а) %n", entry.getKey(), entry.getValue());
        }
    }
}

