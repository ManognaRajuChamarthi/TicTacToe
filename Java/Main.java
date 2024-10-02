// Import libraries
 class Main{
    public static void main(String[] args) {

        Player _playerOne = new Player("Alpha", 1);
        Player _playerTwo = new Player("Beta", 2);

        Board _board = new Board();
        _board.setBoardValueAtPosition('c', 0);
        _board.setBoardValueAtPosition('c', 2);
        _board.setBoardValueAtPosition('c', 4);
        _board.setBoardValueAtPosition('c', 6);
        _board.setBoardValueAtPosition('c', 8);
    
        _board.displayBoard();
        _playerOne.getPlayerDetails();
        _playerTwo.getPlayerDetails();
        System.out.println("Tic Tac Toe");
    }

 }