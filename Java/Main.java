// Import libraries
import java.util.Scanner;


class Main{
    public static void main(String[] args) {

        //Initializations
        Scanner sc = new Scanner(System.in);

        //variables
        String _pOneName;
        String _pTwoName;
        int _playerInput;
        boolean _isValidInput = false;

        //player details
        System.out.println("Input Player one name: ");
        _pOneName = sc.nextLine();
        System.out.println("Input Player Two name: ");
        do {
            _pTwoName = sc.nextLine();
            if (_pTwoName.equals(_pOneName)) {
                System.out.println("Player Two name cannot be the same as Player One. Please enter a different name.");
            }
        } while (_pTwoName.equals(_pOneName));


        //objects
        Player _playerOne = new Player(_pOneName, 1);
        Player _playerTwo = new Player(_pTwoName, 2);
        Board _board = new Board();

        //Game Introduction
        System.out.println("Hello, Welcome to a Game of TIC TAC TOE." );
        _playerOne.getPlayerDetails();
        _playerTwo.getPlayerDetails();
        System.out.println("Player 1 gets to move first and use the symbol : 'X'. Now, let's Start the Game.\nThe symbol C is used to let the player know that these places on the board are empty." );


        //board Initialization
        _board.setBoardValueAtPosition('c', 0);
        _board.setBoardValueAtPosition('c', 1);
        _board.setBoardValueAtPosition('c', 2);
        _board.setBoardValueAtPosition('c', 3);
        _board.setBoardValueAtPosition('c', 4);
        _board.setBoardValueAtPosition('c', 5);
        _board.setBoardValueAtPosition('c', 6);
        _board.setBoardValueAtPosition('c', 7);
        _board.setBoardValueAtPosition('c', 8);

        System.out.println("Tic Tac Toe");
        _board.displayBoard();

        //Winning Conditions
        


        //get Player Input for Game

        System.out.println("\nlet us BEGINNNNN!!!!!!!!!!!!");
        System.out.println("1 2 3\n4 5 6\n7 8 9\nThese are the positions of each cell");

        do {
            //Player one input loop
            System.out.println("where do "+ _playerOne.getPlayerName()+" Want to place 'X'");
            do {
                _playerInput = sc.nextInt();
                if(_board.getBoardValueAtPosition(_playerInput) == 'O'|| _board.getBoardValueAtPosition(_playerInput) == 'X'){
                    System.out.println("this Position is not valid pick another one");
                }else{
                    _playerOne.addtoPlayerMarkedPositionArray(_playerInput);

                    _board.setBoardValueAtPosition(_playerInput,_playerOne);
                    _board.displayBoard();
                    
                    _isValidInput = true;
                } 
            } while (_isValidInput == false);

            //player two input loop
            if(!_board.isFull()){
                System.out.println("where do "+ _playerTwo.getPlayerName()+" Want to place 'O'");
                do {
                    _playerInput = sc.nextInt();
                    if(_board.getBoardValueAtPosition(_playerInput) == 'O'|| _board.getBoardValueAtPosition(_playerInput) == 'X'){
                        System.out.println("this Position is not valid pick another one");
                    }else{
                        _playerTwo.addtoPlayerMarkedPositionArray(_playerInput);

                        _board.setBoardValueAtPosition(_playerInput,_playerTwo);

                        _board.displayBoard();
                        
                        _isValidInput = false;
                    } 
                } while (_isValidInput == true);
            }


        } while (!_board.checkWin('X') && !_board.checkWin('O') && !_board.isFull());


        //Winning Declaration
        if(_board.checkWin('X')){
            System.out.println("Player " + _playerOne.getPlayerName() + " Wins.");
        }
        if(_board.checkWin('O')){
            System.out.println("Player " + _playerTwo.getPlayerName() + " Wins.");
        }
        if(_board.isFull()){
            System.out.println("Both of you turned out to be idiots. Want to prove me wrong Play AGAIN?");
        }

        sc.close();
    }

 }