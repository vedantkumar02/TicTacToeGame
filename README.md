<h1>Tic Tac Toe Game</h1>
This is a Java program that allows two players to play the classic game of tic-tac-toe. The game is played on a 3x3 board, and the players take turns marking their symbol ('x' or 'o') on the board until one player gets three in a row (horizontally, vertically, or diagonally), or the board is full and there is no winner (tie game).

<h3>Running the Game</h3>
To run the game, simply compile and run the Main.java file. The program will prompt the players to enter the row and column of the cell they want to mark. Players enter their moves by entering the row and column indices separated by a space.

<h3>Game Rules</h3>
The game is played on a 3x3 grid.
Players take turns placing their symbol ('x' or 'o') on the grid.
The first player to get three in a row (horizontally, vertically, or diagonally) wins.
If all the cells are filled and no player has three in a row, the game ends in a tie.

<h3>Code Structure</h3>
The code is structured into four methods: main, haveWon, printboard, and checkMove.
The main method initializes the game board, player 'x', and other necessary variables. It uses a while loop to keep the game running until it is over.
The haveWon method checks whether the player has won the game by checking all the possible win combinations.
The printboard method prints the current state of the game board.
The checkMove method checks whether the player's move is valid or not.

<h3>Improvements</h3>
This code can be further improved by implementing an AI opponent that can play against the user. It can also be extended to allow players to choose their symbols or to play on a larger board.
