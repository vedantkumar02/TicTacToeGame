import java.util.*;

class Main {
  public static void main(String[] args) {
    char[][] board = new char[3][3];
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }
    char player = 'x';
    boolean gameover = false;
    Scanner sc = new Scanner(System.in);
    int moves = 0;

    while (!gameover) {
      printboard(board);
      System.out.println("player " + player + " enter: ");
      int row = sc.nextInt();
      int col = sc.nextInt();

      if (row >= 0 && row < board.length && col >= 0 && col < board[row].length && board[row][col] == ' ') {
        board[row][col] = player;
        moves++;
        gameover = haveWon(board, player) || moves == 9;
        if (gameover) {
          if (moves == 9) {
            System.out.println("Tie game!");
          } else {
            System.out.println("player " + player + " has won!");
          }
        } else {
          player = (player == 'x') ? 'o' : 'x';
        }
      } else {
        System.out.println("Invalid move. Try again.");
      }
    }
  }

  public static boolean haveWon(char[][] board, char player) {
    for (int row = 0; row < board.length; row++) {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
        return true;
      }
    }

    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
        return true;
      }
    }

    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }
    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
      return true;
    }
    return false;

  }

  public static void printboard(char[][] board) {
    System.out.println("+---+---+---+");
    for (int row = 0; row < board.length; row++) {
      System.out.print("| ");
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " | ");
      }
      System.out.println("\n+---+---+---+");
    }
  }
}