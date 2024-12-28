import java.util.Scanner;

public class TicTacToe 
{
    static final int size = 3;
    static char[][] board = new char[size][size];
    static char player = 'X';
    public static void main(String[] args) 
	{
        initializeBoard();
        boolean game = true;
        Scanner s = new Scanner(System.in);
        while (game) 
		{
            printBoard();
            System.out.println("player " + player + ", enter your move: ");
            int row = s.nextInt()-1;
            int col = s.nextInt()-1;
            if (validMove(row,col)) 
			{
                board[row][col] = player;
                if (checkWin()) 
				{
                    printBoard();
                    System.out.println("player " + player + " wins");
                    game = false;
                } 
				else if (boardFull()) 
				{
                    printBoard();
                    System.out.println("game is a draw");
                    game = false;
                } 
				else 
				{
                    player=(player=='X')?'O':'X';
                }
            } 
			else 
			{
                System.out.println("move is invalid please try again");
            }
        }
        s.close();
    }
    static void initializeBoard() 
	{
        for (int i=0;i<size;i++) 
		{
            for (int j=0;j<size;j++) 
			{
                board[i][j]='*';
            }
        }
    }
    static void printBoard() 
	{
        for (int i=0;i<size;i++) 
		{
            for (int j=0;j<size;j++) 
			{
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean validMove(int row, int col) 
	{
        return row>=0&&row<size&&col>=0&&col<size&&board[row][col]=='*';
    }
    static boolean checkWin() 
	{
        for (int i=0;i<size;i++) 
		{
            if (board[i][0]==player&&board[i][1]==player&&board[i][2]==player) 
			{
                return true;
            }
        }

        for (int i=0;i<size;i++) 
		{
            if (board[0][i]==player&&board[1][i]==player&&board[2][i]==player) 
			{
                return true;
            }
        }

        if (board[0][0]==player&&board[1][1]==player&&board[2][2]==player) 
		{
            return true;
        }

        if (board[0][2]==player&&board[1][1]==player&&board[2][0]==player) 
		{
            return true;
        }

        return false;
    }
    static boolean boardFull() 
	{
        for (int i=0;i<size;i++) 
		{
            for (int j=0;j<size;j++) 
			{
                if (board[i][j]=='*') 
				{
                    return false;
                }
            }
        }
        return true;
    }
}
