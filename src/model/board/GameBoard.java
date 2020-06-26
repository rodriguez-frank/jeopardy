package model.board;

/**
 * Represent a game board for jeopardy.
 */
public class GameBoard {

    private String[] categories;
    private Question[][] board;

    /**
     * Make a game board out of questions.
     * @param qs are the questions inputted to the board.
     */
    public GameBoard(String[] cat, Question[][] qs) {
        for (Question[] qArr : qs) {
            for (Question q : qArr) {
                if (q == null) {
                    throw new IllegalArgumentException("Not all board pieces were initialized");
                }
            }
        }

        for (String s : cat) {
            if (s == null) {
                throw new IllegalArgumentException("Not all board categories were initialized");
            }
        }

        this.board = qs;
    }

    /**
     * Get a question at a spot on the board.
     * @Return the question object.
     */
    public Question getQuestionAt(int r, int c) {
        return this.board[r][c];
    }


}
