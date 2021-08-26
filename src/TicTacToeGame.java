

public class TicTacToeGame {

public static char[] board= new char[10];  
	
	public void createBoard() {
		for(int i=1;i<board.length;i++)
		{
			board[i]=' ';
		}
		
	}
	public static void main(String[] args) {
		System.out.println("welcome to tictactoe");
		TicTacToeGame t=new TicTacToeGame();
		t.createBoard();
	}

}
