package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;



    public RockPaperScissorHandSign getWinner() {
        if (this.equals(ROCK)) {
            return PAPER;
        } else if (this.equals(SCISSOR)) {
            return ROCK;
        }
        return SCISSOR;    }

    public RockPaperScissorHandSign getLoser() {
        if (this.equals(ROCK)) {
            return SCISSOR;
        } else if (this.equals(SCISSOR)) {
            return PAPER;
        }
        return ROCK;        }
}
