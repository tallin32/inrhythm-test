/**
 * File: SentenceCounter.ts
 * Author: Chris Meredith <tallin32@gmail.com>
 * Essentially just implements a method to give you the number of words and longest word
 * in a sentence.
 */

export interface SentenceStats {
    longestWord: string;
    length: number;
}

export function stats(sentence: string) {
    let ret: SentenceStats = {
        length: 0,
        longestWord: ""
    };
    // Corner cases
    if (!sentence.length) {
        return ret;
    }
    const words: string[] = sentence.split(/\s+/);
    if (words.length === 1) {
        ret = {
            length: sentence.length,
            longestWord: sentence
        };
        return ret;
    }
    // Apparently, using foreach in JavaScript arrays isn't as performant as the good old for loop.
    for (let i = 0; i < words.length; i++) {
        // Cut down on the number of function calls
        const len = words[i].length;
        if (len >= ret.length) {
            ret.length = len;
            ret.longestWord = words[i];
        }
    }
    return ret;
}
