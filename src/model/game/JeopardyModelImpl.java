package model.game;

import model.board.GameBoard;
import model.board.Question;

import java.util.List;

/**
 * Represent a game of jeopardy.
 */
public class JeopardyModelImpl implements IModel {

    private GameBoard board;
    private List<Player> loPlayers;

    /**
     * Construct with a board and a list of players for the game.
     * @param board is the board of questions.
     * @param loPlayers is the list of game players.
     */
    public JeopardyModelImpl(GameBoard board, List<Player> loPlayers) {
        this.board = board;
        this.loPlayers = loPlayers;
    }

    /**
     * Answer a question on the board. Change player value appropriately, and says the question
     * is answered.
     * @param r is the row of the question.
     * @param r is the column of the question.
     * @param n is the name of the player who answers.
     * @param correct is if the player answered correctly.
     */
    public void questionAnswered(int r, int c, String n, boolean correct) {
        Question qObj = this.board.getQuestionAt(r, c);
        qObj.setAnswered(true);
        int changeVal = qObj.getVal();
        int indOfPlayer = this.getPlayerIndex(n);

        if (correct) {
            this.loPlayers.get(indOfPlayer).changeWinnings(changeVal);
        } else {
            this.loPlayers.get(indOfPlayer).changeWinnings(changeVal * -1);
        }

    }

    private int getPlayerIndex(String name) {
        for (int i = 0; i < this.loPlayers.size(); i ++) {
            if (this.loPlayers.get(i).getName().equals(name)) {
                return i;
            }
        }

        throw new IllegalArgumentException("No player found");
    }
}
