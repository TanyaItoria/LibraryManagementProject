package com.example.Library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProgramTest {
    @Test
    void plaindromeString() {
        StringProgram stringProgram = new StringProgram();
        String actual, expected;
        actual = "babad";
        expected = "bab";
        assertEquals(stringProgram.longestPalindrome(actual), expected);
        actual = "cbbd";
        expected = "bb";
        assertEquals(stringProgram.longestPalindrome(actual), expected);
        actual = "a";
        expected = "a";
        assertEquals(stringProgram.longestPalindrome(actual), expected);
        actual = "ac";
        expected = "a";
        assertEquals(stringProgram.longestPalindrome(actual), expected);
    }


}