package Program5;
//Michael Binelli
import java.util.Scanner;
public class TicTacToe {
	static Scanner stdIn = new Scanner(System.in);
	static String player1;
	static String player2;
	static int player1Score = 0;
	static int player2Score = 0;
	static char gridLocation[] =  new char[10];
	
	public static String displayRules() {
		System.out.println("-- This is a two player (X’s and O’s) board game. Each player starts with a tally of 0");
		System.out.println("-- The game board is a 3 X 3 grid, where each location initially contains its location’s number : 1 - 9.");
		System.out.println("-- The players take turns placing their mark over one of the empty locations on the grid. in doing so, this numer is added to the players score. \n   If the resulting tally is greater than 15 then their score is set back 16 points.");
		System.out.println("-- The game is won when a playr's tally hits 15 exactly.");
		System.out.println("-- The game can also reach a stalemate: neither player has won.");
		return "displayRules";
	}
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
	        return "referenceBoard";
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
		while(round>= 0 && round <=9) {
			if((round%2)==0) { 
				System.out.println(player1 + " Please enter a location to move[1-9]: ");
				int newLocation = stdIn.nextInt();
				if(newLocation >=1 && newLocation <=9) {
					if(gridLocation[newLocation - 1] != 'X' || gridLocation[newLocation - 1 ] != 'O') {
						gridLocation[newLocation-1] = 'X';
						player1Score = player1Score + newLocation;
						if(player1Score == 15) {
							System.out.println(player1 + " WON THE GAME!!");
							break;
						}
						else if(player1Score > 15) {
							player1Score = player1Score - 16;
							round++;
						}
						else {
							displayCurrentBoard();
							displayCurrentScore();
							round++;
						}
					}
					else {
						return;
					}
				}
				else {
					return;
				}
			}
			else {
				System.out.println(player2 + " Please enter a location to move[1-9]: ");
				int newLocation = stdIn.nextInt();
				if(newLocation >=1 && newLocation <=9) {
					if(gridLocation[newLocation - 1] != 'X' || gridLocation[newLocation - 1] != 'O') {
						gridLocation[newLocation-1] = 'O';
						player2Score = player2Score + newLocation;
						if(player2Score == 15) {
							System.out.println(player2 + " WON THE GAME!!");
							break;
						}
						else if(player2Score > 15) {
							player2Score = player2Score - 16;
							round++;
						}
						else {
							displayCurrentBoard();
							displayCurrentScore();
							round++;
						}
					}
					else {
						return;
					}
				}
				else {
					return;
				}
			}
		}
//		else {
//			System.out.println("The game has resulted in a stalemate, mate.");
//		}
	}
	
	  public static String displayCurrentScore() {
		  System.out.println(player1 + " has a score of: " + player1Score);
		  System.out.println(player2 + " has a score of: " + player2Score);
		return "displayCurrentScore";
	  }

	  public static String displayCurrentBoard()
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
	        return "displayCurrentBoard";
	    }
	
	public static void main(String[] args) {
		System.out.println("Tic-Tac-Toe");
		System.out.println("____________");
		System.out.print('\n');
		displayRules();
		System.out.print('\n');
		referenceBoard();
		getPlayerNames();
		playGame();
		
	}
}
