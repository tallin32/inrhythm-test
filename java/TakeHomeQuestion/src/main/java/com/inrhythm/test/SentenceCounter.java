package com.inrhythm.test.TakeHomeQuestion;
import java.lang.*;

public class SentenceCounter {
    public SentenceStats stats(String sentence) {
        SentenceStats stats = new SentenceStats("");
        String[] words = sentence.split("\\s+");
        if (sentence.length() == 0) {
            return stats;
        }
        for (String word: words) {
            if (word.length() >= stats.length) {
                stats.length = word.length();
                stats.longestWord = word;
            }
        }
        return stats;
    }
}

