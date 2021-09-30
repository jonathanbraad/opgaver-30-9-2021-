package com.company;

public class Main {


    public static void main(String[] args) {
	String[] wordList = {"kylling", "gris", "godaften", "sovs"};
    printHalfWord(wordList);
    }

    static void printHalfWord(String[] tempWordList) {

        for (int i = 0; i < tempWordList.length - 1; i++) {
            System.out.println(tempWordList[i].substring(tempWordList[i].length() / 2));
        }
    }

}
