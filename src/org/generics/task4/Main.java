package org.generics.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Main {
    private static final String TEXT = "aaaas 2341244 124 llll";

    public static void main(String[] args) {
        char[] elements = TEXT.toLowerCase().toCharArray();
        Map<Character, Integer> symbols = new HashMap<>();

        for (int i = 0; i < elements.length; i++) {
            if (Character.isLetter(elements[i])) {
                Integer count = symbols.get(elements[i]);
                if (count == null) {
                    symbols.put(elements[i], 1);
                } else {
                    symbols.put(elements[i], ++count);
                }
            }
        }

        Integer max = getMax(symbols);
        Integer min = getMin(symbols);

        System.out.print("Максимальное количество вхождений: ");
        for (Map.Entry<Character, Integer> symbol: symbols.entrySet()) {
            if (Objects.equals(symbol.getValue(), max)) {
                System.out.print(" [ " + symbol.getKey() + " : " + symbol.getValue() + " ] ");

            }
        }

        System.out.println();
        System.out.print("Минимальное количество вхождений: ");
        for (Map.Entry<Character, Integer> symbol: symbols.entrySet()) {
            if (Objects.equals(symbol.getValue(), min)) {
                System.out.print(" [ " + symbol.getKey() + " : " + symbol.getValue() + " ] ");
            }
        }
            }

    private static Integer getMax(Map<Character, Integer> symbols) {
        int max = Integer.MIN_VALUE;

            for (Map.Entry<Character, Integer> symbol: symbols.entrySet()) {
                if (symbol.getValue() > max) {
                    max = symbol.getValue();
                }
            }
            return max;
        }
        private static Integer getMin(Map < Character, Integer > symbols){
            int min = Integer.MAX_VALUE;

            for (Map.Entry<Character, Integer> symbol: symbols.entrySet()) {
                if (min > symbol.getValue()) {
                    min = symbol.getValue();

            }
        }
            return min;
    }
}



