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
        return 0;
    }
}
