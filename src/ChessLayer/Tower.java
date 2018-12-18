package ChessLayer;

import BoardLayer.Board;

public class Tower extends ChessPiece{

    public Tower(Board board, ChessColor color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "T";
    }
}
