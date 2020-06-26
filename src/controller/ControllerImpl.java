package controller;

import model.game.IModel;
import view.IView;

/**
 * Represents the controller for the game of jeopardy.
 */
public class ControllerImpl implements IController {

    private IModel model;
    private IView view;

    /**
     * Construct controller with model and view.
     * @param model is the game model.
     * @param view is the visual view of the game.
     */
    public ControllerImpl(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Play a game of jeopardy.
     */
    public void playGame() {
        // hmmmm
        this.view.drawBoard();
    }

}
