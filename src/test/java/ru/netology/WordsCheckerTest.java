package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordsCheckerTest {
    private WordsChecker wordsChecker;


    @BeforeEach
    void createObjectWordsChecker() {
        wordsChecker = new WordsChecker("hEllO woRld");
    }

    @Test
    void toLowerCaseCheck() {
        assertEquals("hello world", wordsChecker.getText());
    }

    @Test
    void hasWordTrueCheck() {
        assertEquals(true, wordsChecker.hasWord("hello"));
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void hasWordCheck(String word) {
        assertTrue(wordsChecker.hasWord(word.toLowerCase()));
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void hasWordFalseCheck(String word) {
        assertFalse(wordsChecker.hasWord(word));
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("Hello"),
                Arguments.of("World")
        );
    }
}