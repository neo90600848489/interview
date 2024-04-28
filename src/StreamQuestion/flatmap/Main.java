package StreamQuestion.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        // Using flatMap to extract unique characters from words
        List<Character> uniqueCharacters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list of words: " + words);
        System.out.println("Unique characters: " + uniqueCharacters);
    }
}

