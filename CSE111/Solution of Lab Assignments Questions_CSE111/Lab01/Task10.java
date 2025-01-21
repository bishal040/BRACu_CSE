import java.util.Scanner;
public class Task10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}};
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    for(int i = 0;i<row;i++)
    {
      for(int j = 0; j< col;j++)
      {
        if(arr2D[i][j]==7)
        {
          row_pos = i;
          col_pos = j;
          break;
        }
      }
    }
    int new_row = row_pos, new_col = col_pos;
    int turns = 5;
    while (turns > 0) {
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      if(inp.equals("RIGHT") || inp.equals("right"))
      { if(new_col==col-1)
        {
          System.out.println("Player fell outside the playing area. Game over!");
          break;
        }
        else
        {
          new_col++;
        }
        if(arr2D[new_row][new_col]==-1)
        {
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
        else if(arr2D[new_row][new_col]==10)
        {
          System.out.println("Treasure found. You win!");
          arr2D[new_row][new_col]=7;
          arr2D[new_row][new_col-1]=0;
          System.out.println("Final state:");
          printMap(arr2D);
          break;
        }
        else
        {
          arr2D[new_row][new_col]=7;
          arr2D[new_row][new_col-1]=0;
        }
      }
      else if(inp.equals("LEFT") || inp.equals("left"))
      {
        if(new_col==0)
        {          
          System.out.println("Player fell outside the playing area. Game over!");
          break;
        }
        else
        {
          new_col--;
        }
         if(arr2D[new_row][new_col]==-1)
        {
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
        else if(arr2D[new_row][new_col]==10)
        {
          System.out.println("Treasure found. You win!");
          arr2D[new_row][new_col]=7;
          arr2D[new_row][new_col+1]=0;
          System.out.println("Final state:");
          printMap(arr2D);
          break;
        }
        else
        {
          arr2D[new_row][new_col]=7;
          arr2D[new_row][new_col+1]=0;
        }
      }
      else if(inp.equals("UP") || inp.equals("up"))
      {
        if(new_row==0)
        {
          System.out.println("Player fell outside the playing area. Game over!");
          break;
        }
        else
        {
          new_row--;
        }
        if(arr2D[new_row][new_col]==-1)
        {
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
        else if(arr2D[new_row][new_col]==10)
        {
          System.out.println("Treasure found. You win!");
          arr2D[new_row][new_col]=7;
          arr2D[new_row+1][new_col]=0;
          System.out.println("Final state:");
          printMap(arr2D);
          break;
        }
        else
        {
          arr2D[new_row][new_col]=7;
          arr2D[new_row+1][new_col]=0;
        }
      }
      else if(inp.equals("DOWN") || inp.equals("down"))
      {
        if(new_row==row-1)
        {
          System.out.println("Player fell outside the playing area. Game over!");
          break;
        }
        else
        {
          new_row++;
        }
        if(arr2D[new_row][new_col]==-1)
        {
          System.out.println("Player stepped on mine. Game Over!");
          break;
        }
        else if(arr2D[new_row][new_col]==10)
        {
          System.out.println("Treasure found. You win!");
          arr2D[new_row][new_col]=7;
          arr2D[new_row-1][new_col]=0;
          System.out.println("Final state:");
          printMap(arr2D);
          break;
        }
        else
        {
          arr2D[new_row][new_col]=7;
          arr2D[new_row-1][new_col]=0;
        }
       
      }
      else
      {
        System.out.println("Wrong Input!Start Again...");
        break;
      }
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
  }
  public static void printMap(int[][] arr2D)
    {
    for(int i = 0;i<arr2D.length;i++)
    {
      for(int j = 0; j< arr2D[0].length; j++)
      {
          System.out.print(arr2D[i][j] + " ");
      }
      System.out.println("");
    }
  }
}