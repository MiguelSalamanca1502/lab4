package hangman.model;

public class OriginalScore implements GameScore {

    @Override
    /**
     * @pre correcCount and incorrectCount are both greater than zero
     * @pos returns a number between 0 and 100
     * @param correctCount
     * @param incorrectCount
     * @return
     */
    public int calculateScore(int correctCount, int incorrectCount) {
        int score=100;
        score -= incorrectCount*10;
        if(score < 0){
            score = 0;
        }
        return score;
    }
}
