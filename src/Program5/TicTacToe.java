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
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Tic-Tac-Toe");
		getPlayerNames();
		currentBoard();
	}
}
