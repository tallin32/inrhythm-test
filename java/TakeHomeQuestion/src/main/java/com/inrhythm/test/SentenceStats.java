package com.inrhythm.test.TakeHomeQuestion;
import java.lang.*;
public class SentenceStats {
    public int length;
    public String longestWord;
    public SentenceStats(String longestWord) {
        this.length = longestWord.length();
        this.longestWord = longestWord;
    }
}