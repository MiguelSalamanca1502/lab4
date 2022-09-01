package hangman.model;

public class BonusScore implements GameScore {

    @Override
    /**
     * @pre correcCount and incorrectCount are both greater than zero
     * @pos returns a number equal or greater than zero
     * @param correctCount
     * @param incorrectCount
     * @return
     */
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;
        score = 10*correctCount - 5*incorrectCount;
        if (score < 0){
            score = 0;
        }
        return score;
    }
}
