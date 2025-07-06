package LeetCode.Solve2;

import java.sql.Array;
import java.util.Arrays;

public class prob2114 {

    public static void main(String[] args) {

        String[] n = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(n));

    }

    public static int mostWordsFound(String[] sentences) {

        int[] wordCounter = new int[sentences.length];

        for(int index = 0; index < sentences.length; index++){
             String[] words = sentences[index].split(" ", 0);
             wordCounter[index] = words.length;
        }

        return Arrays.stream(wordCounter).max().getAsInt();

    }
}
