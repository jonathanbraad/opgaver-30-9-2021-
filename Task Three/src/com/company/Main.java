package com.company;

public class Main {


    public static void main(String[] args) {
        String text = "Datamatiker";
        printMostFrequentLetter(text);
    }

    static void printMostFrequentLetter(String tempText) {
        char charCount;
        int counter = 0;
        char mostFrequentChar = 'b';
        int mostFrequentCharNumber = 0;

        for (int i = 0; i < tempText.length() - 1; i++)
        {
            charCount = tempText.charAt(i);
            for (int x = 0; x < tempText.length() - 1; x++)
            {
                if (tempText.charAt(x) == charCount)
                {
                    counter++;
                }

            }
            if (counter > mostFrequentCharNumber)
            {
                mostFrequentChar = charCount;
                mostFrequentCharNumber = counter;
            }
            counter = 0;
        }
        System.out.println("the most frequent letter is :" + mostFrequentChar);
    }

}
