package ChessLayer;

import BoardLayer.Board;

public class King extends ChessPiece{

    public King(Board board, ChessColor color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
