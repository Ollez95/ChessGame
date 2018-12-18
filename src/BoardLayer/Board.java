package BoardLayer;

import java.awt.*;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int column) {
        this.rows = rows;
        this.columns = column;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumn() {
        return columns;
    }

    public void setColumn(int column) {
        this.columns = column;
    }

    public Piece piece(int row,int column){
        return pieces[row][column];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
    public void PlacePosition(Piece piece,Position position){

    }
    public Piece removePiece(Position position){
        return null;
    }
    public Boolean positionExists(Position position){
        return null;
    }

    public Boolean thereIsAPiece(Position position){
        return null;
    }






}
