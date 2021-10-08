package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }

    /**
     * Checks if the game has ended either because a player has won, or if the game has ended as a tie.
     * If game hasn't ended the return string has to be "None",
     * If the game ends as tie, the return string has to be "Tie",
     * If the game ends because there's a winner, it should return "X wins" or "O wins" accordingly
     * @param grid 2D array of characters representing the game board
     * @return String indicating the outcome of the game: "X wins" or "O wins" or "Tie" or "None"
     */
    public String checkGameWinner(char [][]grid) {
        // None means the game continues
        String result = "None";
        
        //Student code goes here ...
        // setting the message of the end of the game
        String x = "X wins";
        String o = "O wins";
        
        // checks if there are three x vertically
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == 'x' && grid[i][1] == 'x' && grid[i][2] == 'x') {
                result = x;
                break;
            }
        }
        // checks if there are three x horizontally
        for (int j = 0; j < 3; j++) {
            if (grid[0][j] == 'x' && grid[1][j] == 'x' && grid[2][j] == 'x') {
                result = x;
                break;
            }
        }
        
        // checks there are three x in the first diagonal
        if (grid[0][0] == 'x' && grid[1][1] == 'x' && grid[2][2] == 'x') {
            result = x;
        }
        // checks there are three x in the second diagonal
        if (grid[2][0] == 'x' && grid[1][1] == 'x' && grid[0][2] == 'x') {
            result = x;
        }
        
        // this code up to line 68 does the same thing as the above, but with o
        for (int i2 = 0; i2 < 3; i2++) {
            if (grid[i2][0] == 'o' && grid[i2][1] == 'o' && grid[i2][2] == 'o') {
                result = o;
                break;
            }
        }
        for (int j2 = 0; j2 < 3; j2++) {
            if (grid[0][j2] == 'o' && grid[1][j2] == 'o' && grid[2][j2] == 'o') {
                result = o;
                break;
            }
        }
        if (grid[0][0] == 'o' && grid[1][1] == 'o' && grid[2][2] == 'o') {
            result = o;
        }
        if (grid[2][0] == 'o' && grid[1][1] == 'o' && grid[0][2] == 'o') {
            result = o;
        }
        
        // checks for non-empty spaces ('-'), and if there are 9 non-empty spaces
        // it means that the game is a tie
        int checkTieNum = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            for (int j3 = 0; j3 < 3; j3++) {
                if (grid[i3][j3] != '-') {
                    checkTieNum += 1;
                }
            }
        }
        if (checkTieNum == 9) {
            result = "It's a tie";
        }
        
        // return the display message of the end of the game
        return result;
    }
}
