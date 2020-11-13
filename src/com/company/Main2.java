package com.company;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        HashMap<String, String[]> dictionary = new HashMap<>();

        dictionary.put("машина", new String[]{"тачка", "автомобиль", "фургон", "авто"});
        dictionary.put("дом", new String[]{"жилье", "убежище", "хата", "квартира","апартаменты"});
        dictionary.put("красивый", new String[]{"прекрасный", "симпотичный", "красавчик","няшка"});
        dictionary.put("большоый", new String[]{"гигантский", "огромный", "громадный", "крупный"});

        for (Map.Entry<String, String[]> item: dictionary.entrySet()) {
            System.out.println(item.getKey()+" - "+Arrays.toString(item.getValue()));
        }

        while (true) {
            System.out.println("Tape a word:");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            String[] values = dictionary.get(word);
            if (values != null) {
                Random r = new Random();
                int i = r.nextInt(values.length);
                System.out.println(values[i]);
            } else
                System.out.println("There's no such word");
        }
    }
}
