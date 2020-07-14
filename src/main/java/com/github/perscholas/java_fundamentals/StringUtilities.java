package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
/**Method functionalities added
 * Monica Deshmukh
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String result = "Hello World";
        return (result);
        //return null;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String result = firstSegment + secondSegment;
        return result;
        //return null;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String result = firstSegment + secondSegment;
        return result;
        //return null;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String result = input.substring(0,3);
        return result;
        //return null;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int startIndex, endIndex;
        startIndex = input.length() - 3;
        endIndex = input.length();
        String result = input.substring(startIndex,endIndex);
        return result;
        //return null;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
        //return null;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        Character middleChar;
        int stringLength = inputValue.length();
        int middleCharIndex;
        middleCharIndex = stringLength/2;
        /** for even length return the character at middleCharIndex - 1 */
        if (stringLength%2 == 0)
            middleCharIndex--;
        middleChar = inputValue.charAt(middleCharIndex);
        return middleChar;
        //return null;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String firstWord= spaceDelimitedString.substring(0, spaceDelimitedString.indexOf(" "));
        return firstWord;
        //return null;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        return words[1];
        //return null;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reverse;
        StringBuilder sb = new StringBuilder(stringToReverse);
        reverse = (sb.reverse()).toString();
        return reverse;
        // return null;
    }
}
