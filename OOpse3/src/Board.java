
public class Board {

	private char board [][];
	private int boardSize =3;
	private char p1Symbol,p2Symbol;
	int count;
	public final static int PLAYER1_WINS=1;
	public final  static int PLAYER2_WINS=2;
	public final static int DRAW=3;
	public final static int INCOMPLETE=4;
	public final static int INVALID =5;
	
	
public Board(char p1Symbol,char p2Symbol)	
{
	board =new char[boardSize][boardSize];
	for(int i=0;i<boardSize;i++) {
		for(int j=0;j<boardSize;j++) {
			board[i][j]=' ';
		}
	}
	this.p1Symbol=p1Symbol;
	this.p2Symbol=p2Symbol;
}
}
