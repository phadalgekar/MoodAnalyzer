package com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	 public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");//Tc1.1 Refactor
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//Tc1.2 Refactor
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood1 = moodAnalyzer.analyseMood();
        Assert.assertEquals(mood1,"HAPPY");
    }
}
    


