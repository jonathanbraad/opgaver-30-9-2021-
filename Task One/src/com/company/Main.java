package com.company;

public class Main
{


    public static void main(String[] args)
    {
       String[] wordList = {"hej", "hund", "datamatiker", "goddag"};

	printLongestString(wordList);

    }

     static void printLongestString(String[] tempWordList)
    {
        String longestWord = "";
        int wordCount = 0;
for (int i = 0; i <= tempWordList.length - 1; i++) {
    if (tempWordList[i].length() > wordCount)
    {
        longestWord = tempWordList[i];
        wordCount = tempWordList[i].length();
    }
}
        System.out.println(longestWord + " is the longest word.");

    }
}
