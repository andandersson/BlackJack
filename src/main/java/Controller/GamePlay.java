package Controller;

public class GamePlay {
    private final int HUMANTURN = 1;
    private final int COMPUTERTURN = 2;
    private int TURN;

    public void setTurn(int turn) {
        this.TURN = turn;
    }

    public int getTurn(){
        return this.TURN;
    }


}
