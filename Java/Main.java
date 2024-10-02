// Import libraries
import java.util.Scanner;


class Main{
    public static void main(String[] args) {

        //Initializations
        Scanner sc = new Scanner(System.in);

        //variables
        String _pOneName;
        String _pTwoName;

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


        _board.setBoardValueAtPosition('c', 0);
        _board.setBoardValueAtPosition('c', 1);
        _board.setBoardValueAtPosition('c', 2);
        _board.setBoardValueAtPosition('c', 3);
        _board.setBoardValueAtPosition('c', 4);
        _board.setBoardValueAtPosition('c', 5);
        _board.setBoardValueAtPosition('c', 6);
        _board.setBoardValueAtPosition('c', 7);
        _board.setBoardValueAtPosition('c', 8);
        
    
        _playerOne.getPlayerDetails();
        _playerTwo.getPlayerDetails();
        System.out.println("Tic Tac Toe");
        _board.displayBoard();


        sc.close();
    }

 }