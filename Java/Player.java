public class Player {
    // this class is for storing the player details.

    private String _playerName;
    private int _playerTurnPosition;

    public Player(String pName, int turnPosition){
        this._playerName = pName;
        this._playerTurnPosition = turnPosition;
    }

    public void getPlayerDetails(){
        System.out.println(_playerName+ " you are player " + _playerTurnPosition);
    }
}
