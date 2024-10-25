import java.util.Scanner;

class Sudoku_9x9 
{
    public boolean solveSudoku(int[][] board) 
    {
       return solve(board);
    }
    
    private boolean solve(int[][] board)
    {
      int[] emptySpot = findEmptySpot(board);
    
      if (emptySpot == null) 
      {
        return true;
      }
    
      int row = emptySpot[0];
      int col = emptySpot[1];
    
      for (int num = 1; num <= 9; num++) 
      {
        if (isValid(board, row, col, num)) 
        {
            board[row][col] = num;
    
            if (solve(board)) 
            {
                return true;
            }
        
            board[row][col] = 0;
        }
       }
            return false;
    }
    
     private int[] findEmptySpot(int[][] board) 
     {
        int[] result = new int[2];

         for (int row = 0; row < 9; row++) 
         {
           for (int col = 0; col < 9; col++) 
           {
                 if (board[row][col] == 0) 
                {
                    result[0] = row;
                    result[1] = col;
                    return result;
                }
           }
         }
            return null; 
        }
    
        private boolean isValid(int[][] board, int row, int col, int num) 
        {
            for (int i = 0; i < 9; i++) 
            {
                if (board[row][i] == num) 
                {
                    return false;
                }
            }
    
            for (int i = 0; i < 9; i++) 
            {
                if (board[i][col] == num) 
                {
                    return false;
                }
            }

            int boxStartRow = row - row % 3;
            int boxStartCol = col - col % 3;
            for (int i = boxStartRow; i < boxStartRow + 3; i++)
             {
                for (int j = boxStartCol; j < boxStartCol + 3; j++) 
                {
                    if (board[i][j] == num) 
                    {
                        return false;
                    }
                }
            }
    
            return true;
        }
    
        public void printBoard(int[][] board)
         {
            for (int i = 0; i < 9; i++) 
            {
                for (int j = 0; j < 9; j++) 
                {
                    System.out.print(board[i][j]+" ");
                }

                System.out.println();
            }
        }
    }

 class Sudoku_6x6 
{
    public boolean solveSudoku(int[][] board) 
    {
       return solve(board);
    }
    
    private boolean solve(int[][] board)
    {
      int[] emptySpot = findEmptySpot(board);
    
      if (emptySpot == null) 
      {
        return true;
      }
    
      int row = emptySpot[0];
      int col = emptySpot[1];
    
      for (int num = 1; num <= 6; num++) 
      {
        if (isValid(board, row, col, num)) 
        {
            board[row][col] = num;
    
            if (solve(board)) 
            {
                return true;
            }
        
            board[row][col] = 0;
        }
       }
            return false;
    }
    
     private int[] findEmptySpot(int[][] board) 
     {
        int[] result = new int[2];

         for (int row = 0; row < 6; row++) 
         {
           for (int col = 0; col < 6; col++) 
           {
                 if (board[row][col] == 0) 
                {
                    result[0] = row;
                    result[1] = col;
                    return result;
                }
           }
         }
            return null; 
        }
    
        private boolean isValid(int[][] board, int row, int col, int num) 
        {
            for (int i = 0; i < 6; i++) 
            {
                if (board[row][i] == num) 
                {
                    return false;
                }
            }
    
            for (int i = 0; i < 6; i++) 
            {
                if (board[i][col] == num) 
                {
                    return false;
                }
            }

            int boxStartRow = row - row % 2;
            int boxStartCol = col - col % 3;
            for (int i = boxStartRow; i < boxStartRow + 2; i++)
             {
                for (int j = boxStartCol; j < boxStartCol + 3; j++) 
                {
                    if (board[i][j] == num) 
                    {
                        return false;
                    }
                }
            }
    
            return true;
        }
    
        public void printBoard(int[][] board)
         {
            for (int i = 0; i < 6; i++) 
            {
                for (int j = 0; j < 6; j++) 
                {
                    System.out.print(board[i][j]+" ");
                }

                System.out.println();
            }
        }
    }

    class Sudoku_4x4 
    {
        public boolean solveSudoku(int[][] board) 
        {
           return solve(board);
        }
        
        private boolean solve(int[][] board)
        {
          int[] emptySpot = findEmptySpot(board);
        
          if (emptySpot == null) 
          {
            return true;
          }
        
          int row = emptySpot[0];
          int col = emptySpot[1];
        
          for (int num = 1; num <= 4; num++) 
          {
            if (isValid(board, row, col, num)) 
            {
                board[row][col] = num;
        
                if (solve(board)) 
                {
                    return true;
                }
            
                board[row][col] = 0;
            }
           }
                return false;
        }
        
         private int[] findEmptySpot(int[][] board) 
         {
            int[] result = new int[2];
    
             for (int row = 0; row < 4; row++) 
             {
               for (int col = 0; col < 4; col++) 
               {
                     if (board[row][col] == 0) 
                    {
                        result[0] = row;
                        result[1] = col;
                        return result;
                    }
               }
             }
                return null; 
            }
        
            private boolean isValid(int[][] board, int row, int col, int num) 
            {
                for (int i = 0; i < 4; i++) 
                {
                    if (board[row][i] == num) 
                    {
                        return false;
                    }
                }
        
                for (int i = 0; i < 4; i++) 
                {
                    if (board[i][col] == num) 
                    {
                        return false;
                    }
                }
    
                int boxStartRow = row - row % 2;
                int boxStartCol = col - col % 2;
                for (int i = boxStartRow; i < boxStartRow + 2; i++)
                 {
                    for (int j = boxStartCol; j < boxStartCol + 2; j++) 
                    {
                        if (board[i][j] == num) 
                        {
                            return false;
                        }
                    }
                }
        
                return true;
            }
        
            public void printBoard(int[][] board)
             {
                for (int i = 0; i < 4; i++) 
                {
                    for (int j = 0; j < 4; j++) 
                    {
                        System.out.print(board[i][j]+" ");
                    }
    
                    System.out.println();
                }
            }
        }    
    

public class SudokuSolver2
   {    
    public static void main(String[] args) 
    {
            Scanner s = new Scanner(System.in);

            System.out.print("\n1.4x4 Sudoku\n2.6x6 Sudoku\n3.9x9 Sudoku\n\nEnter your choice: ");
            int choice = s.nextInt();

            switch(choice)
            {
                case 1: Sudoku_4x4 solver1 = new Sudoku_4x4();
                        int[][] board1 = new int[4][4]; 
                
                        System.out.println("\nEnter the Sudoku here (enter '0' for the empty space): ");

                        for(int i=0;i<4;i++)
                        {
                         for(int j=0;j<4;j++)
                         {
                           board1[i][j] = s.nextInt();
                         }
                        }

                        if (solver1.solveSudoku(board1))
                        {
                          System.out.println("\nThe solution for the given sudoku is:\n");
                          solver1.printBoard(board1);
                        } 
                
                        else 
                        {
                          System.out.println("The solution for the provided Sudoku does not exist!");
                        }
                        break;

                case 2: Sudoku_6x6 solver2 = new Sudoku_6x6();
                        int[][] board2 = new int[6][6]; 
                        
                        System.out.println("\nEnter the Sudoku here (enter '0' for the empty space): ");

                        for(int i=0;i<6;i++)
                        {
                            for(int j=0;j<6;j++)
                            {
                                board2[i][j] = s.nextInt();
                            }
                        }
                        if (solver2.solveSudoku(board2))
                        {
                            System.out.println("\nThe solution for the given sudoku is:\n");
                            solver2.printBoard(board2);
                        } 
                        
                        else 
                        {
                            System.out.println("The solution for the provided Sudoku does not exist!");
                        }
                        break;

                case 3:  Sudoku_9x9 solver3 = new Sudoku_9x9();
                         int[][] board3 = new int[9][9]; 
                
                         System.out.println("\nEnter the Sudoku here (enter '0' for the empty space): ");

                         for(int i=0;i<9;i++)
                         {
                           for(int j=0;j<9;j++)
                           {
                             board3[i][j] = s.nextInt();
                           }
                         }
                
                          if (solver3.solveSudoku(board3))
                          {
                            System.out.println("\nThe solution for the given sudoku is:\n");
                            solver3.printBoard(board3);
                          } 
                
                          else 
                          {
                            System.out.println("The solution for the provided Sudoku does not exist!");
                          }
                          break;       
            }
            s.close();
        }
    }
