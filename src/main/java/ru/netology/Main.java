package ru.netology;

import java.util.Scanner;

public class Main {

    public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur " +
            "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
            "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
            " occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
            "anim id est laborum.";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordsChecker text = new WordsChecker(LOREM_IPSUM);

        System.out.println("Слово для поиска:");
        String findWord = in.nextLine().toLowerCase();
        System.out.println(text.hasWord(findWord) ?
                "Указанное слово есть" : "Указанного слова нет");
    }
}
