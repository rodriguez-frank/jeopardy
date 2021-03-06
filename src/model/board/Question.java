package model.board;

/**
 * Represent a question/jeopardy clue in the game.
 */
public class Question {

    // category?
    private String qText;
    private String qAnswer;
    private int val;
    private boolean isDouble;
    private boolean isAnswered;

    /**
     * Construct a question with a question text, answer, and value.
     * @param qText is the question.
     * @param qAnswer is an answer to the question.
     * @param val is the value of the question if gotten right.
     */
    public Question(String qText, String qAnswer, int val) {
        this.qText = qText;
        this.qAnswer = qAnswer;
        this.val = val;
        this.isDouble = false;
        this.isAnswered = false;
    }

    /**
     * Get the question text.
     * @return the text from the question
     */
    public String getQuestion() {
        return this.qText;
    }

    /**
     * Get the answer from the question.
     * @return the question text
     */
    public String getAnswer() {
        return this.qAnswer;
    }

    /**
     * Get the dollar or points value of the question.
     * @return the value of single jeopardy for the question
     */
    public int getVal() {
        if (! isDouble ) {
            return this.val;
        } else {
            return this.val * 2;
        }
    }

    /**
     * Tell if this is a double jeopardy question or not.
     */
    public boolean getDoubleJ() {
        return this.isDouble;
    }

    /**
     * Set to double question or not;
     */
    public void setDoubleJ(boolean dj) {
        this.isDouble = dj;
    }

    /**
     * Return if a question has been answered yet.
     * @return true if question answered, false if not.
     */
    public boolean isAnswered() {
        return this.isAnswered;
    }

    /**
     * Set a question to be answered or unanswered.
     */
    public void setAnswered(boolean setter) {
        this.isAnswered = setter;
    }
}
