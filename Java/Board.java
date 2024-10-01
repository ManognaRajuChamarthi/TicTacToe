public class Board {
    // this class is to related to making a board
    // to access and, update the values of the board and 
    // to all the other board related functions.

    private char[] _board;//board

    // board constructor
    public Board(){
        _board = new char[9];
    }

    public void setBoardValueAtPosition(char values, int index){
        this._board[index] = values;
    }

    //get all values of board
    public void displayBoard() {
        for (int i = 0; i < _board.length; i++) {
            System.out.print(_board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println(); // create a new line after every 3 elements for a 3x3 board
            }
        }   
    }
} 
