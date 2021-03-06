package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String[]> Dictionary = new HashMap<>();

        Dictionary.put("good", new String[]{"well", "nice", "super", "cool", "awesome", "amazing"});

        Dictionary.put("bad", new String[]{"terrible", "nasty", "awful", "grim", "unacceptable"});

        Dictionary.put("cold", new String[]{"icy", "chilly", "cool", "glacial", "frosty", "frigid"});

        Dictionary.put("hot", new String[]{"boiling", "scorching", "baking", "roasting", "flaming"});

        Dictionary.put("beauty", new String[]{"charm", "grace", "allure", "elegance", "style"});

        Set<String> setKey = Dictionary.keySet();
        List<String> arrayListOfSynonyms = new ArrayList<>();
        Map<String, String[]> dictionary = new HashMap<>();



        for (String key : setKey) {
            Collections.addAll(arrayListOfSynonyms, Dictionary.get(key));
            for (int i = 0; i < arrayListOfSynonyms.size(); i++) {
                String newKey = arrayListOfSynonyms.get(i);

                arrayListOfSynonyms.remove(i);
                arrayListOfSynonyms.add(key);

                Object[] a = arrayListOfSynonyms.toArray();
                String[] b = new String[a.length];
                for (int j = 0; j < b.length - 1; j++) {
                    b[j] = (String) a[j];
                }

                dictionary.put(newKey, b);
                arrayListOfSynonyms.clear();
                Collections.addAll(arrayListOfSynonyms, Dictionary.get(key));
            }
        }
        dictionary.putAll(Dictionary);

        for (Map.Entry<String, String[]> item: Dictionary.entrySet()) {
            System.out.println(item.getKey()+" - "+Arrays.toString(item.getValue()));
        }

        do {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("-----------------------------");
            System.out.println("Type a word for a synonyms: ");
            //System.out.println("(Hint - good,bad,hot,cold,beauty)");
            String[] strings = dictionary.get(scanner.nextLine());
            if (strings != null) {
                Random r = new Random();
                int i = r.nextInt(strings.length);
                System.out.println("your synonym is: " + strings[i]);
            } else
                System.out.println("There's no such word");

        } while (true);



    }
}
