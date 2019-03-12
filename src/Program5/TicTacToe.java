package Program5;
//Michael Binelli
import java.util.Scanner;
public class TicTacToe {
	static Scanner stdIn = new Scanner(System.in);
	static String player1;
	static String player2;
	static int player1Score = 0;
	static int player2Score = 0;
	static char gridLocation[] =  new char[9];
	
	public static String referenceBoard(){
		  System.out.print("Use this as your referance board throughout the game:");
	        System.out.println(  "\n\n\t\t    |    |  ");
	        System.out.println(  " \t\t  1 |  2 |  3 " );
	        System.out.println(  " \t\t ___|____|___ " );
	        System.out.println(  "\t\t    |    |    " );
	        System.out.println(  " \t\t  4 | 5  |  6 " );
	        System.out.println(  " \t\t ___|____|___ " );
	        System.out.println(  "\t\t    |    |    ");
	        System.out.println(  " \t\t  7 |  8 | 9  " );
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  "\n\n" );
	        return "currentBoard";
	}
	
	static void getPlayerNames() {
		System.out.println("Player one enter your name: ");
		player1 = stdIn.nextLine();
		System.out.println("Player two enter your name: ");
		player2 = stdIn.nextLine();
	}
	
	public static void playGame() {
		int round = 0;
		System.out.println(player1 + " will go first and play as X's.");
		while(round>= 0) {
			if((round%2)==0) {
				//player 1 turn
				System.out.println(player1 + " Please enter a location to move[1-9]: ");
				int newLocation = stdIn.nextInt();
				if(newLocation >=0 && newLocation <=9) {
					gridLocation[newLocation-1] = 'X';
					int updatedScore = player1Score + newLocation;
					
					
				}
				
			}
			else {
				//player 2 turn
				System.out.println(player2 + " Please enter a location to move[1-9]: ");
				char newLocation = stdIn.next().charAt(0);
			}
		}
	}

	  public static String currentBoard()
	    {
	        System.out.println(  "\n\n\t\t" + gridLocation [1] + "   | " +gridLocation [2]+ "  | " +gridLocation [3]);
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  " \t\t ___|____|___ " );
	        System.out.println(  "\t\t" +gridLocation [4]+ "   | " +gridLocation [5]+ "  | " +gridLocation [6]);
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  " \t\t ___|____|___ " );
	        System.out.println(  "\t\t" +gridLocation [7]+ "   | " +gridLocation [8]+ "  | " +gridLocation [9]);
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  "\n\n" );
	        return "currentBoard";
	    }
//	  public static char checkWinnerForPlayer1() {
//		  char winner = '';
//		  if(gridLocation[1] == 'X' && gridLocation[2] == 'X' && gridLocation[3] == 'X')
//			  winner = 'X';
//	        if (posn[4] == 'X' && posn[5] == 'X' && posn[6] == 'X')
//	        	winner = 'X';
//	        if (posn[7] == 'X' && posn[8] == 'X' && posn[9] == 'X') 
//	        	winner = 'X';
//	        if (posn[1] == 'X' && posn[4] == 'X' && posn[7] == 'X') 
//	        	winner = 'X';
//	        if (posn[2] == 'X' && posn[5] == 'X' && posn[8] == 'X') 
//	        	winner = 'X';
//	        if (posn[3] == 'X' && posn[6] == 'X' && posn[9] == 'X') 
//	        	winner = 'X';
//	        if (posn[1] == 'X' && posn[5] == 'X' && posn[9] == 'X') 
//	        	winner = 'X';
//	        if (posn[3] == 'X' && posn[5] == 'X' && posn[7] == 'X') 
//	        	winner = 'X';
//	        if(winner == "X") 
//	        	System.out.println(player1 + " Wins!!");
//	  }

	
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		System.out.println("Tic-Tac-Toe");
		referenceBoard();
		getPlayerNames();
		playGame();
		
	}
}
