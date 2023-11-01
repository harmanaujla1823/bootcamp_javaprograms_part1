package com.bootcamp.javaPrograms2;

public class StringWordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample sentence. Count me, please!";
        int wordCount = countWords(inputString);

        System.out.println("Word count: " + wordCount);
    }

    public static int countWords(String inputString) {
        String[] words = inputString.split("[\\s\\p{Punct}]+");
        return words.length;
    }
}

