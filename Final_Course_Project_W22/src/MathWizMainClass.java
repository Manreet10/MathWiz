/*
 *Description : This is the main class with the object for the class for execution of the game
 *Author: Manreet Grewal
 *Date: 14th April,2022
 *Time: 1400 hrs
 */
import java.util.Scanner;

public class MathWizMainClass 
{

	public static void main(String[] args) 
	{
		//variables for gameboard and solutionboard
		String row1Answer = Integer.toString(27);
		String row2Answer = Integer.toString(28);
		String row3Answer = Integer.toString(26);
		String col1Answer = Integer.toString(34);
		String col2Answer = Integer.toString(24);
		String col3Answer = Integer.toString(23);
		int numberOfMoves = 15;
		boolean exit = true;
		
		//gameboard for the game
		String[][] gameBoard = {{" ","__"," ","__"," ","__"," ","__"," "},
  			    					{"|","  ","|","  ","|","  ","|",row1Answer,"|"},
  			    					{" ","__"," ","__"," ","__"," ","__"," "},
  			    					{"|","  ","|","  ","|","  ","|",row2Answer,"|"},
  			    					{" ","__"," ","__"," ","__"," ","__"," "},
  			    					{"|","  ","|","  ","|","  ","|",row3Answer,"|"},
  			    					{" ","__"," ","__"," ","__"," "," "," "},
  			    					{"|",col1Answer,"|",col2Answer,"|",col3Answer,"|"," "," "}};
		
		//solution board
		String[][] solutionBoard = {{" ","_"," ","_"," ","_"," ","_"," "},
  			    					{"|",Integer.toString(7),"|",Integer.toString(12),"|",Integer.toString(8),"|",row1Answer,"|"},
  			    					{" ","_"," ","_"," ","_"," ","_"," "},
  			    					{"|",Integer.toString(11),"|",Integer.toString(3),"|",Integer.toString(14),"|",row2Answer,"|"},
  			    					{" ","_"," ","_"," ","_"," ","_"," "},
  			    					{"|",Integer.toString(16),"|",Integer.toString(9),"|",Integer.toString(1),"|",row3Answer,"|"},
  			    					{" ","_"," ","_"," ","_"," "," "," "},
  			    					{"|",col1Answer,"|",col2Answer,"|",col3Answer,"|"," "," "}};
				
		MathWiz puzzle = new MathWiz();
		//set gameboard created
		puzzle.setGameBoard(gameBoard);
		
		//set solutionBoard created
		puzzle.setSolutionBoard(solutionBoard);
		
		//taking inputs
		Scanner in = new Scanner(System.in);
		//asking username
		System.out.println("Please enter your name: ");
		String userName = in.nextLine();
		
		//set userName
		puzzle.setUserName(userName);
		System.out.println("Hi, "+puzzle.getUserName()+"!");
		
		// printing instructions
		MathWiz.Instruction();
		
		//printing gameBoard
		System.out.println("Number of moves: "+ numberOfMoves);
		puzzle.printGameBoard();
		
		//running a loop, asking the place and the piece
		for(int i = 0; i < 15 ; i++)
		{
			//asking the position
			System.out.println("What position would you like to change(1-9): ");
			int position = in.nextInt();
			System.out.println("What would you like to place at "+position+" :");
			int placeholder = in.nextInt();
		
			puzzle.printGameBoard(position, placeholder);
			puzzle.printGameBoard();
			//after minimum turns, ask for if user wants to submit the code
			if(i > 7 & i < 15) 
			{
				while(exit = true)
				{
					System.out.println("Do you want end and check?(Yes/No): ");
					String userResponse = in.nextLine();
					if(userResponse.equalsIgnoreCase("Yes"))
					{
						puzzle.compareBoards();
						i = 16;
						exit = false;
						break;
					}
					else if(userResponse.equalsIgnoreCase("No"))
						break;
					
				}
			}
			//after maximum turns, the code terminates and prints out the result.
			if(i == 14)
			{
				//after 15 moves
				System.out.println("You are out of moves!");
				puzzle.compareBoards();
			}
		}
		
		in.close();
		
	}
	
}
