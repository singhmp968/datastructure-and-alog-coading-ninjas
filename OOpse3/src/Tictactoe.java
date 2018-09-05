import java.util.Scanner; 
public class Tictactoe {
private Player player1,player2;
private Board board;
public void startGame() {
Scanner s=new Scanner(System.in);
	//player input
	// Create Board 
	// Conduct the game
	player1=takePlayerInput(1);
	player2=takePlayerInput(2);
	while(player1.getSymbol()==player2.getSymbol()) {
		System.out.println("Symbol has Already Taken || Pick another Symbol !!");
		char symbol=s.next().charAt(0);
		player2.setSymbol(symbol);
	}
	board =new Board(player1.getSymbol(),player2.getSymbol());
	boolean player1Turn = true;
	int status =Board.INCOMPLETE;
	while(status==Board.INCOMPLETE||status==Board.INVALID) {
		if(player1Turn)
		{
			System.out.println("Player 1 - " + player1.getName() + " s turn");
			System.out.println("Enter x :");
			int x=s.nextInt();
			System.out.println("Enter y");
			int y=s.nextInt();
			 status=board.move(player1.getSymbol(),x,y);
		if(status !=Board.INVALID) {
		
			player1Turn=false;
		}
		}
		else {
			System.out.println("Player 2 - " + player2.getName() + " s turn");
			System.out.println("Enter x :");
			int x=s.nextInt();
			System.out.println("Enter y");
			int y=s.nextInt();
			 status=board.move(player2.getSymbol(),x,y);
	if(status!=Board.INVALID) {
		player1Turn=true;
		board.print();
	}
		}	
		
		
		}
			
		}

private Player takePlayerInput(int num) {
	Scanner s=new Scanner(System.in);
System.out.println( "Enter Player" + num + " name ");
String name=s.nextLine();
System.out.println(" Enter player " + num + " Symbol :");
char symbol=s.next().charAt(0);
Player p=new Player (name,symbol);
return p;
	
}

}
