import java.util.ArrayList;

public class Player {
    // this class is for storing the player details.

    //variables
    private String _playerName;
    private int _playerTurnPosition;
    private ArrayList<Integer> _playerMarkedPosition = new ArrayList<Integer>();

    //constructor
    public Player(String pName, int pTurnPosition){
        this._playerName = pName;
        this._playerTurnPosition = pTurnPosition; 
    }

    //public Functions
    public void getPlayerDetails(){
        System.out.println(_playerName+ " you are player " + _playerTurnPosition);
    }

    public String getPlayerName(){
        return _playerName;
    }

    public int getPlayerTurnPosition(){
        return _playerTurnPosition;
    }

    public void addtoPlayerMarkedPositionArray(int postion){
            _playerMarkedPosition.add(postion);
    }

}
