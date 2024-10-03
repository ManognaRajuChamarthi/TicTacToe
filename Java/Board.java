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

    //setting board values based on playerInput
    public void setBoardValueAtPosition(int position, Player player){
        if(player.getPlayerTurnPosition() == 1){
            _board[position-1]= 'X';
        }
        else{
            _board[position-1]= 'O';
        }
    }

    //Getting the value at position
    public char getBoardValueAtPosition(int position){
        return _board[position-1];
    }

    public boolean checkWin(char symbol) {
        // Check rows, columns, and diagonals for a win
        return (_board[0] == symbol && _board[1] == symbol && _board[2] == symbol) || // Row 1
               (_board[3] == symbol && _board[4] == symbol && _board[5] == symbol) || // Row 2
               (_board[6] == symbol && _board[7] == symbol && _board[8] == symbol) || // Row 3
               (_board[0] == symbol && _board[3] == symbol && _board[6] == symbol) || // Column 1
               (_board[1] == symbol && _board[4] == symbol && _board[7] == symbol) || // Column 2
               (_board[2] == symbol && _board[5] == symbol && _board[8] == symbol) || // Column 3
               (_board[0] == symbol && _board[4] == symbol && _board[8] == symbol) || // Diagonal 1
               (_board[2] == symbol && _board[4] == symbol && _board[6] == symbol);   // Diagonal 2
    }
} 
