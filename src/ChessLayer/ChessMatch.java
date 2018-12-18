package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Position;

public class ChessMatch {

    private Board board;

    public ChessMatch(){

        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumn()];
        for(int i = 0; i < board.getRows();i++){
            for(int j = 0; j< board.getColumn();j++){
                mat[i][j] = (ChessPiece)board.piece(i,j);

            }
        }
        return mat;

    }
    private void placeNewPiece(char column,int row,ChessPiece piece){

        board.placePosition(piece, new ChessPosition(column,row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('b',6,new Tower(board,ChessColor.BLACK));
        placeNewPiece('e',1,new King(board,ChessColor.BLACK));
        placeNewPiece('e',8,new King(board,ChessColor.WHITE));
    }





}
