package homework_nr_9;

import java.util.HashMap;
import java.util.Map;

public class TranslatorEnRo {
    public static void main(String[] args) {

        Map<String, String> dictionaryEnRo = new HashMap<>();

        dictionaryEnRo.put("Bread", "Pâine");
        dictionaryEnRo.put("Cheese", "Brânză");
        dictionaryEnRo.put("Apple", "Măr");
        dictionaryEnRo.put("Chicken", "Pui");
        dictionaryEnRo.put("Salad", "Salată");
        dictionaryEnRo.put("Soup", "Supă");
        dictionaryEnRo.put("Fish", "Pește");
        dictionaryEnRo.put("Rice", "Orez");
        dictionaryEnRo.put("Tomato", "Roșie");
        dictionaryEnRo.put("Potato", "Cartof");

        System.out.println("English to Romanian dictionary:");
        for (Map.Entry<String, String> entry : dictionaryEnRo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
