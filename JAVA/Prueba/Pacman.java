package Prueba;

import java.util.Scanner;

public class Pacman {
	/* FINALS AND STATICS */
	private static final int SIZE = 20;
	private static final char EMPTY = ' ';
	private static final char PACMAN = 'C';
	private static final char ENEMY = 'U';
	private static final char POINT = '·';

	private static char[][] board;
	private static int pacmanX, pacmanY;
	private static int[] enemyX = new int[3];
	private static int[] enemyY = new int[3];
	private static int score = 0;
	private static boolean gameOver = false;

	/* MAIN */
	public static void main(String[] args) {
		
		/*scaner y movidas*/
		Scanner sc = new Scanner(System.in);
		while (true) {
			initializeGame();
			while (!gameOver) {
				try {
					printBoard();
					System.out.println("Score: " + score);
					System.out.print("Move (WASD): ");
					char move = sc.nextLine().toUpperCase().charAt(0);
					movePacman(move);
					moveEnemies();
					checkCollision();
					checkWin();
				} catch (Exception e) {
					System.out.println("Bad...");
				}
			}
			System.out.println("Game Over! Final Score: " + score);
			System.out.print("Play Again? (Y/N): ");
			char playAgain = sc.nextLine().toUpperCase().charAt(0);
			if (playAgain != 'Y') {
				break;
			}
		}
		sc.close();
	}
	/**
	 * Initializes the game by placing elements on the board. Points are generated
	 * and PacMan and enemies are placed in initial positions.
	 */
	private static void initializeGame() {
		// Board initialization with points
		board = new char[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = POINT;
			}
		}

		// Place PacMan
		pacmanX = SIZE / 2;
		pacmanY = SIZE / 2;
		board[pacmanX][pacmanY] = PACMAN;

		// Place enemies
		for (int i = 0; i < 3; i++) {
			do {
				enemyX[i] = (int) (Math.random() * SIZE);
				enemyY[i] = (int) (Math.random() * SIZE);
			} while (board[enemyX[i]][enemyY[i]] != POINT);
			board[enemyX[i]][enemyY[i]] = ENEMY;
		}

		score = 0;
		gameOver = false;
	}

	/**
	 * Prints the current game board to the console. Each cell of the board is
	 * represented by its respective character (PacMan, enemy, point, or empty
	 * space). The board is displayed row by row, with each element separated by a
	 * space.
	 */
	private static void printBoard() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Moves PacMan on the board in the direction specified by the move parameter.
	 * The method updates PacMan's position on the board according to the specified
	 * direction. If PacMan eats a point, the player's score is incremented.
	 * 
	 * @param move The direction in which PacMan should move (W = up, A = left, S =
	 *             down, D = right).
	 */
	private static void movePacman(char move) {
		// Clear PacMan's current position on the board
		board[pacmanX][pacmanY] = EMPTY;

		// Move PacMan according to the specified direction
		switch (move) {
		case 'W':
			pacmanX = (pacmanX - 1 + SIZE) % SIZE;
			break;
		case 'A':
			pacmanY = (pacmanY - 1 + SIZE) % SIZE;
			break;
		case 'S':
			pacmanX = (pacmanX + 1) % SIZE;
			break;
		case 'D':
			pacmanY = (pacmanY + 1) % SIZE;
			break;
		}

		// If PacMan eats a point, increment the score
		if (board[pacmanX][pacmanY] == POINT) {
			score++;
		}

		// Place PacMan in its new position on the board
		board[pacmanX][pacmanY] = PACMAN;
	}

	/**
	 * Moves the enemies on the board. The method moves each enemy in a random
	 * direction (up, down, left, or right). If the new position of an enemy is a
	 * point or an empty space, the enemy moves to that position.
	 * 
	 * Assumes there are three enemies in the game.
	 */
	private static void moveEnemies() {
		for (int i = 0; i < 3; i++) {
			// Clear the current position of the enemy on the board
			board[enemyX[i]][enemyY[i]] = EMPTY;

			// Generate a random direction to move the enemy (0 = up, 1 = left, 2 = down, 3
			// = right)
			int direction = (int) (Math.random() * 4);
			switch (direction) {
			case 0:
				enemyX[i] = (enemyX[i] - 1 + SIZE) % SIZE;
				break;
			case 1:
				enemyY[i] = (enemyY[i] - 1 + SIZE) % SIZE;
				break;
			case 2:
				enemyX[i] = (enemyX[i] + 1) % SIZE;
				break;
			case 3:
				enemyY[i] = (enemyY[i] + 1) % SIZE;
				break;
			}

			// If the new position of the enemy is a point or an empty space, the enemy
			// moves to that position
			if (board[enemyX[i]][enemyY[i]] == POINT || board[enemyX[i]][enemyY[i]] == EMPTY) {
				board[enemyX[i]][enemyY[i]] = ENEMY;
			}
		}
	}

	/**
	 * Checks for collision between PacMan and enemies. If PacMan is in the same
	 * position as any of the enemies, the game is marked as over.
	 * 
	 * Assumes there are three enemies in the game.
	 */
	private static void checkCollision() {
		for (int i = 0; i < 3; i++) {
			if (pacmanX == enemyX[i] && pacmanY == enemyY[i]) {
				gameOver = true;
			}
		}
	}

	/**
	 * Checks if all points have been eaten by PacMan. If all points have been
	 * eaten, the game is marked as over, and a victory message along with the final
	 * score is displayed.
	 */
	private static void checkWin() {
		boolean allPointsEaten = true;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (board[i][j] == POINT) {
					allPointsEaten = false;
					break;
				}
			}
		}
		if (allPointsEaten) {
			gameOver = true;
			System.out.println("You Win! Final Score: " + score);
		}
	}

}
