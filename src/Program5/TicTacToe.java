package Program5;
//Michael Binelli
import java.util.Scanner;
public class TicTacToe {
	static Scanner stdIn = new Scanner(System.in);
	static String player1;
	static String player2;
	static char gridLocation[] =  new char[10];
	
	static void getPlayerNames() {
		System.out.println("Player one enter your name: ");
		player1 = stdIn.nextLine();
		System.out.println("Player two enter your name: ");
		player2 = stdIn.nextLine();
	}
	  public static  String referenceBoard()
	    {
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
	  public static  String currentBoard()
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
	  public static char checkWinnerForPlayer1() {
		  char winner = '';
		  if(gridLocation[1] == 'X' && gridLocation[2] == 'X' && gridLocation[3] == 'X')
			  winner = 'X';
	        if (posn[4] == 'X' && posn[5] == 'X' && posn[6] == 'X')
	        	winner = 'X';
	        if (posn[7] == 'X' && posn[8] == 'X' && posn[9] == 'X') 
	        	winner = 'X';
	        if (posn[1] == 'X' && posn[4] == 'X' && posn[7] == 'X') 
	        	winner = 'X';
	        if (posn[2] == 'X' && posn[5] == 'X' && posn[8] == 'X') 
	        	winner = 'X';
	        if (posn[3] == 'X' && posn[6] == 'X' && posn[9] == 'X') 
	        	winner = 'X';
	        if (posn[1] == 'X' && posn[5] == 'X' && posn[9] == 'X') 
	        	winner = 'X';
	        if (posn[3] == 'X' && posn[5] == 'X' && posn[7] == 'X') 
	        	winner = 'X';
	        if(winner == "X") 
	        	System.out.println(player1 + " Wins!!");
	  }
	  public static char checkWinnerForPlayer2() {
		  char winner = '';
		  if(gridLocation[1] == 'O' && gridLocation[2] == 'O' && gridLocation[3] == 'O')
			  winner = 'O';
	        if (posn[4] == 'O' && posn[5] == 'O' && posn[6] == 'O')
	        	winner = 'O';
	        if (posn[7] == 'O' && posn[8] == 'O' && posn[9] == 'O') 
	        	winner = 'O';
	        if (posn[1] == 'O' && posn[4] == 'O' && posn[7] == 'O') 
	        	winner = 'O';
	        if (posn[2] == 'O' && posn[5] == 'O' && posn[8] == 'O') 
	        	winner = 'O';
	        if (posn[3] == 'O' && posn[6] == 'O' && posn[9] == 'O') 
	        	winner = 'O';
	        if (posn[1] == 'O' && posn[5] == 'O' && posn[9] == 'O') 
	        	winner = 'O';
	        if (posn[3] == 'O' && posn[5] == 'O' && posn[7] == 'O') 
	        	winner = 'O';
	        if(winner == "O") 
	        	System.out.println(player2 + " Wins!!");
	  }
	
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		System.out.println("Tic-Tac-Toe");
		referenceBoard();
		getPlayerNames();
		currentBoard();
	}
}
