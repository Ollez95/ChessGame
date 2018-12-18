package BoardLayer;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    /*
    public Boolean possibleMoves(){

        return null;
    }
    public Boolean possibleMove(Position position){

        return null;
    }
    public Boolean isThereAnyPossibleMove(){

        return null;
    }
    */


}
