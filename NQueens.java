import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NQueens 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of board: ");
        int n = s.nextInt();
        List<List<String>> sols = solveProb(n);
        printSol(sols);
        s.close();
    }
    public static List<List<String>> solveProb(int n) 
    {
        List<List<String>> sols = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++) 
        {
            for (int j=0;j<n;j++) 
            {
                board[i][j] = '*';
            }
        }
        solve(0, board, sols);
        return sols;
    }
    private static void solve(int row, char[][] board, List<List<String>> sols) 
    {
        int n = board.length;
        if (row==n) 
        {
            sols.add(constructSol(board));
            return;
        }
        for (int col=0;col<n;col++) 
        {
            if (isSafe(board, row, col)) 
            {
                board[row][col] = 'Q';
                solve(row + 1, board, sols); 
                board[row][col] = '*';
            }
        }
    }
    private static boolean isSafe(char[][] board, int row, int col) 
    {
        int n = board.length;
        for (int i=0;i<row;i++) 
        {
            if (board[i][col] == 'Q') 
            {
                return false;
            }
        }
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) 
        {
            if (board[i][j] == 'Q') 
            {
                return false;
            }
        }
        for (int i=row-1,j=col+1;i>=0&&j<n;i--,j++) 
        {
            if (board[i][j] == 'Q') 
            {
                return false;
            }
        }
        return true;
    }
    private static List<String> constructSol(char[][] board) 
    {
        List<String> sol = new ArrayList<>();
        for (char[] row : board) 
        {
            sol.add(new String(row));
        }
        return sol;
    }
    private static void printSol(List<List<String>> sols) 
    {
        for (int i=0;i<sols.size();i++) 
        {
            System.out.println("solution " + (i + 1) + ":");
            for (String row : sols.get(i)) 
            {
                System.out.println(row);
            }
            System.out.println();
        }
        System.out.println("total solutions: " + sols.size());
    }
}
