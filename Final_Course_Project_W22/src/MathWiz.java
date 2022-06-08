/*
 * Description : This code contains variables, getters , setters, constructors, methods for the MathWiz class for setting up the game
 * Author : Manreet Grewal
 * Date: 11th April,2022
 * Time : 1300 hrs
 */



import java.util.Arrays;

public class MathWiz 
{
	//variables
	private String userName;
	private String[][] gameBoard;
	private String[][] solutionBoard;
	
	//constructor
	public MathWiz()
	{
		
	}
	
	//getters and setters for GameBoard
	public String[][] getGameBoard() {
		return gameBoard;
	}


	public void setGameBoard(String[][] gameBoard) {
		this.gameBoard = gameBoard;
	}

	//getters and setters for UserName
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	//getters and setters for GameBoard
	public String[][] getSolutionBoard() {
		return solutionBoard;
	}


	public void setSolutionBoard(String[][] solutionBoard) {
		this.solutionBoard = solutionBoard;
	}
	
	//printing instructions
	public static void Instruction()
	{
		System.out.println("		INSTRUCTIONS		"
							+"\nGOAL: Enter numbers in a way that the sum of the row and columns equals the mentioned sum."
							+"\n1.Enter the position of the blank you want to fill in."
							+"\n2. The positions are numbered row wise.)"
							+"\n3. Enter the number you wish to fill.(11-20)"
							+"\n4. After 9 moves you will be asked to submit or continue."
							+"\n5. After a total of 15 moves, the game shall terminate and results will be displayed.");
	}
	
	//printing gameBoard
	public void printGameBoard()
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				System.out.print(gameBoard[i][j]);
			}
		
			System.out.println();
		}
	}
	
	public void printGameBoard(int position, int placeholder)
	{
		switch(position)
		{
		case 1:
			gameBoard[1][1] = Integer.toString(placeholder);
			break;
		case 2:
			gameBoard[1][3] = Integer.toString(placeholder);
			break;
		case 3:
			gameBoard[1][5] = Integer.toString(placeholder);
			break;
		case 4:
			gameBoard[3][1] = Integer.toString(placeholder);
			break;
		case 5:
			gameBoard[3][3] = Integer.toString(placeholder);
			break;
		case 6:
			gameBoard[3][5] = Integer.toString(placeholder);
			break;
		case 7:
			gameBoard[5][1] = Integer.toString(placeholder);
			break;
		case 8:
			gameBoard[5][3] = Integer.toString(placeholder);
			break;
		case 9:
			gameBoard[5][5] = Integer.toString(placeholder);
			break;	
		}
	
	}
	
	//comparing gameboards to solutionBoard
	public void compareBoards()
	{
		/*boolean exit;
		while(exit = true)
		{*/
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				//boolean check = gameBoard[i][j] == solutionBoard[i][j];
				//if(check = false)
				if(gameBoard[i][j] != solutionBoard[i][j]) 
					System.out.println("Oops! Better luck next time!");
					j = 10;
					i = 9;
					break;
					//exit = false;
			}
		if(i == 8)
			System.out.println("Good work, You did it!");
		}
		//System.out.println("Good work, You did it!");
		//}
		
	}

	
	
}
