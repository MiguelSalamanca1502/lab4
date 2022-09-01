package hangman.model;
import org.junit.Assert;
import org.junit.Test;

class GameScoreTest {

    /** Equivalence Class
     * 0 <= incorrectCount <=10
     */
    @Test
    void calculateOriginalScoreTest() {
        OriginalScore ori = new OriginalScore();
        int correctCount = 1;
        int incorrectCount = 11;
        int score = ori.calculateScore(correctCount, incorrectCount);
        int expected = 0;
        Assert.assertEquals(expected, score);
    }

    @Test
    /** Equivalence Class
     * 5*incorrectCount <= 10*correctCount
     */
    void calculateBonusScoreTest() {
        BonusScore bonus = new BonusScore();
        int correctCount = 1;
        int incorrectCount = 4;
        int score = bonus.calculateScore(correctCount, incorrectCount);
        int expected = 0;
        Assert.assertEquals(expected, score);

    }


    @Test
    /** Equivalence Class
     * 0 <= 5^correctCount - 8*incorrectCount <= 500
     */
    void calculatePowerScore(){
        PowerScore pow = new PowerScore();
        int correctCount = 4;
        int incorrectCount = 1;
        int score = pow.calculateScore(correctCount, incorrectCount);
        int expected = 500;
        Assert.assertEquals(expected, score);
    }


}