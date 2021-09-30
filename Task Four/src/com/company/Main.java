package com.company;

public class Main {


    public static void main(String[] args) {
        String text = "Datamatiker";
        printLeastFrequentLetter(text);
    }

    static void printLeastFrequentLetter(String tempText) {
        char charCount;
        int counter = 0;
        char leastFrequentChar = tempText.charAt(1);
        int leastFrequentCharNumber = 1;

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
            if (counter <= leastFrequentCharNumber)
            {
                leastFrequentChar = charCount;
                leastFrequentCharNumber = counter;
            }
            counter = 0;
        }
        System.out.println("the least frequent letter is :" + leastFrequentChar);
    }

}
