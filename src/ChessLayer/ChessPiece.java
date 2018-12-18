package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Piece;




public class ChessPiece extends Piece {

    private ChessColor color;

    public ChessPiece(Board board, ChessColor color) {
        super(board);
        this.color = color;
    }

    public ChessColor getColor() {
        return color;
    }




}
