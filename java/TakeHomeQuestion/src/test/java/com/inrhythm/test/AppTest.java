package com.inrhythm.test.TakeHomeQuestion;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnLengthOfMultiWord() {
        SentenceCounter counter = new SentenceCounter();
        SentenceStats ss = counter.stats("The cow jumped over the moon");
        assertEquals(ss.length, 6);
        assertEquals(ss.longestWord, "jumped");
    }

    @Test
    public void shouldReturnLastEncounteredWordWhenThereIsATie() {
        SentenceCounter counter = new SentenceCounter();
        SentenceStats ss = counter.stats("New York's unique");
        assertEquals(ss.length, 6);
        assertEquals(ss.longestWord, "unique");
    }

    @Test
    public void shouldHandleTheCaseWhereThereIsOneWord() {
        SentenceCounter counter = new SentenceCounter();
        SentenceStats ss = counter.stats("Manhattan");
        assertEquals(ss.length, 9);
        assertEquals(ss.longestWord, "Manhattan");
    }
}
