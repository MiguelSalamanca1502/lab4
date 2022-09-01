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
        double score = 0;
        score = Math.pow(5, correctCount) - 8*incorrectCount;
        if (score > 500){
            score = 500;
        } else if (score < 0) {
            score = 0;
        }
        return (int) score;
    }
}
