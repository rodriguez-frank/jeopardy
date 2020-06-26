package model.game;


/**
 * Represent a player.
 */
public class Player {

    private final String name;
    private int winnings;

    /**
     * Construct a player with a name.
     * @param name is the name of the player.
     */
    public Player(String name) {
        this.name = name;
        this.winnings = 0;
    }

    /**
     * Add or subtract from winnings.
     * @param changeAmount is the amount to change by.
     */
    public void changeWinnings(int changeAmount) {
        this.winnings = this.winnings + changeAmount;
    }

    /**
     * Gets the name of a player.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get a player's current winnings.
     */
    public int getWinnings() {
        return this.winnings;
    }

    /**
     * Override player equals.
     */
    public boolean equals(Object o) {
        if (! (o instanceof Player)) {
            return false;
        }

        Player playerObj = (Player) o;

        return playerObj.name.equals(this.name);
    }

    /**
     * Override hash code as well.
     */
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
