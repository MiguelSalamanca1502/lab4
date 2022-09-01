package hangman.model;

public class PowerScore implements GameScore {

    @Override
    /**
     * @pre correcCount and incorrectCount are both greater than zero
     * @pos returns a number between 0 and 500
     * @param correctCount
     * @param incorrectCount
     * @return
     */
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
