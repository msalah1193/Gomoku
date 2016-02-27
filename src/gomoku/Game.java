/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gomoku;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kito
 */
public class Game {

    public Player p1, p2;
    public static int[][] board, lastVersion;
    public int type, levelOfDiff;
    public int count, lastRow, lastCol;


    /**
     * the constructor to set player 1 and player 2
     * set array board with initial zero value
     * 
     */
    public Game(Player p1, Player p2) {
        this.count = 0;
        this.p1 = p1;
        this.p2 = p2;
        board = new int[14][14];
        lastVersion = new int[14][14];
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                board[i][j] = 0;
                lastVersion[i][j] = 0;
            }
        }
    }

   /**
    * 
    * @param row
    * @param col
    * @return the value of this index in the array 
    */
    public int getAtIndex(int row, int col) {
        return board[row][col];
    }

   /**
    * 
    * @param player
    * @param x
    * @param y
    * @return true if the player has five stones in row,col,diagonal
    */
    public boolean check_win(int player, int x, int y) {
        int cleft = 0, cup = 0, cdown = 0, cright = 0;
        int cupR = 0, cupL = 0, cdownR = 0, cdownL = 0;
        for (int i = x - 1, j = y + 1; i >= 0 && j < 14; i--, j++) {
            if (board[i][j] == player) {
                cupR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == player) {
                cupL++;
            } else {
                break;
            }
        }
        /////////////////////////////////

        for (int i = x + 1, j = y + 1; i < 14 && j < 14; i++, j++) {
            if (board[i][j] == player) {
                cdownR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x + 1, j = y - 1; i < 14 && j >= 0; i++, j--) {
            if (board[i][j] == player) {
                cdownL++;
            } else {
                break;
            }
        }
        ///////////////////////////////////
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == player) {
                cleft++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = y + 1; i < 14; i++) {
            if (board[x][i] == player) {
                cright++;
            } else {
                break;
            }
        }
        //////////////////////////////////////////////////
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == player) {
                cup++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = x + 1; i < 14; i++) {
            if (board[i][y] == player) {
                cdown++;
            } else {
                break;
            }
        }

        if (cright == 4 || cleft == 4 || cup == 4 || cdown == 4 || cupR == 4
                || cupL == 4 || cdownR == 4 || cdownL == 4) {
            return true;
        } else if (cright + cleft == 4 || cup + cdown == 4 || cupR + cdownL == 4 || cupL + cdownR == 4) {
            return true;
        } else {
            return false;
        }

    }

   /**
    * 
    * @param x
    * @param y
    * @return true if the value of this index is zero
    */
    public boolean allow(int x, int y) {

        if (board[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param player
     * @param x
     * @param y 
     * set the player value in this index 
     */
    public void play(int player, int x, int y) {
        board[x][y] = player;
    }

    /**
     * 
     * @param x
     * @param y 
     * plays in the direction of the least stones 
     */
    public void easy(int x, int y) {

        int cleft = 0, cup = 0, cdown = 0, cright = 0;
        int cupR = 0, cupL = 0, cdownR = 0, cdownL = 0;

        for (int i = x - 1, j = y + 1; i >= 0 && j < 14; i--, j++) {
            if (board[i][j] == 1) {
                cupR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                cupL++;
            } else {
                break;
            }
        }
        /////////////////////////////////

        for (int i = x + 1, j = y + 1; i < 14 && j < 14; i++, j++) {
            if (board[i][j] == 1) {
                cdownR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x + 1, j = y - 1; i < 14 && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                cdownL++;
            } else {
                break;
            }
        }
        ///////////////////////////////////
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == 1) {
                cleft++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = y + 1; i < 14; i++) {
            if (board[x][i] == 1) {
                cright++;
            } else {
                break;
            }
        }
        //////////////////////////////////////////////////
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 1) {
                cup++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = x + 1; i < 14; i++) {
            if (board[i][y] == 1) {
                cdown++;
            } else {
                break;
            }
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(cdown);
        nums.add(cup);
        nums.add(cleft);
        nums.add(cright);
        nums.add(cdownR);
        nums.add(cupR);
        nums.add(cdownL);
        nums.add(cupL);
        Integer mx = Collections.max(nums);
        Integer mn = Collections.min(nums);
        int indxmn = 0, indxmx = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == mx) {
                indxmx = i;
            }

            if (nums.get(i) == mn) {
                indxmn = i;
            }
        }
        int min = nums.get(indxmn);
        int max = nums.get(indxmx);

        if (min == cright && (y + cright + 1) < 14) {
            board[x][y + cright + 1] = 2;
            lastRow = x;
            lastCol = y + cright + 1;
        } else if (min == cleft && (y - cleft - 1) >= 0) {
            board[x][y - cleft - 1] = 2;
            lastRow = x;
            lastCol = y - cleft - 1;
        } else if (min == cup && (x - cup - 1) < 14) {
            board[x - cup - 1][y] = 2;
            lastRow = x - cup - 1;
            lastCol = y;
        } else if (min == cdown && (x + cdown + 1) >= 0) {
            board[x + cdown + 1][y] = 2;
            lastRow = x + cdown + 1;
            lastCol = y;
        } else if (min == cupR && (x - cupR - 1) >= 0 && (y + cupR + 1) < 14) {
            board[x - cupR - 1][y + cupR + 1] = 2;
            lastRow = x - cupR - 1;
            lastCol = y + cupR + 1;
        } else if (min == cupL && (x - cupL - 1) >= 0 && (y - cupL - 1) >= 0) {
            board[x - cupR - 1][y - cupR - 1] = 2;
            lastRow = x - cupR - 1;
            lastCol = y - cupR - 1;
        } else if (min == cdownR && (x + cdownR + 1) < 14
                && (y + cdownR + 1) < 14) {
            board[x + cdownR + 1][y + cdownR + 1] = 2;
            lastRow = x + cdownR + 1;
            lastCol = y + cdownR + 1;
        } else if (min == cdownL && (x + cdownL + 1) < 14
                && (y - cdownL - 1) >= 0) {
            board[x + cdownL + 1][y - cdownL - 1] = 2;
            lastRow = x + cdownL + 1;
            lastCol = y - cdownL - 1;
        }
    }

    /**
     * 
     * @param x
     * @param y 
     * plays in the direction of the most stones 
     */
    public void hard(int x, int y) {

        int cleft = 0, cup = 0, cdown = 0, cright = 0;
        int cupR = 0, cupL = 0, cdownR = 0, cdownL = 0;

        for (int i = x - 1, j = y + 1; i >= 0 && j < 14; i--, j++) {
            if (board[i][j] == 1) {
                cupR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                cupL++;
            } else {
                break;
            }
        }
        /////////////////////////////////

        for (int i = x + 1, j = y + 1; i < 14 && j < 14; i++, j++) {
            if (board[i][j] == 1) {
                cdownR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x + 1, j = y - 1; i < 14 && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                cdownL++;
            } else {
                break;
            }
        }
        ///////////////////////////////////
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == 1) {
                cleft++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = y + 1; i < 14; i++) {
            if (board[x][i] == 1) {
                cright++;
            } else {
                break;
            }
        }
        //////////////////////////////////////////////////
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == 1) {
                cup++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = x + 1; i < 14; i++) {
            if (board[i][y] == 1) {
                cdown++;
            } else {
                break;
            }
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(cdown);
        nums.add(cup);
        nums.add(cleft);
        nums.add(cright);
        nums.add(cdownR);
        nums.add(cupR);
        nums.add(cdownL);
        nums.add(cupL);
        Integer mx = Collections.max(nums);
        Integer mn = Collections.min(nums);
        int indxmn = 0, indxmx = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == mx) {
                indxmx = i;
            }

            if (nums.get(i) == mn) {
                indxmn = i;
            }
        }
        int min = nums.get(indxmn);
        int max = nums.get(indxmx);

        if (max == cright && (y + cright + 1) < 14) {
            if (board[x][y + cright + 1] == 0) {
                board[x][y + cright + 1] = 2;
            } else {
                board[x][y - 1] = 2;
            }
            lastRow = x;
            lastCol = y + cright + 1;
        } else if (max == cleft && (y - cleft - 1) >= 0) {
            if (board[x][y - cleft - 1] == 0) {
                board[x][y - cleft - 1] = 2;
            } else {
                board[x][y + 1] = 2;
            }
            lastRow = x;
            lastCol = y - cleft - 1;
        } else if (max == cup && (x - cup - 1) < 14) {
            if (board[x - cup - 1][y] == 0) {
                board[x - cup - 1][y] = 2;
            } else {
                board[x + 1][y] = 2;
            }
            lastRow = x - cup - 1;
            lastCol = y;
        } else if (max == cdown && (x + cdown + 1) >= 0) {
            if (board[x + cdown + 1][y] == 0) {
                board[x + cdown + 1][y] = 2;
            } else {
                board[x - 1][y] = 2;
            }
            lastRow = x + cdown + 1;
            lastCol = y;
        } else if (max == cupR && (x - cupR - 1) >= 0 && (y + cupR + 1) < 14) {
            if (board[x - cupR - 1][y + cupR + 1] == 0) {
                board[x - cupR - 1][y + cupR + 1] = 2;
            } else {
                board[x + 1][y - 1] = 2;
            }
            lastRow = x - cupR - 1;
            lastCol = y + cupR + 1;
        } else if (max == cupL && (x - cupL - 1) >= 0 && (y - cupL - 1) >= 0) {
            if (board[x - cupL - 1][y - cupL - 1] == 0) {
                board[x - cupL - 1][y - cupL - 1] = 2;
            } else {
                board[x + 1][y + 1] = 2;
            }
            lastRow = x - cupR - 1;
            lastCol = y - cupR - 1;
        } else if (max == cdownR && (x + cdownR + 1) < 14
                && (y + cdownR + 1) < 14) {
            if (board[x + cdownR + 1][y + cdownR + 1] == 0) {
                board[x + cdownR + 1][y + cdownR + 1] = 2;
            } else {
                board[x - 1][y - 1] = 2;
            }
            lastRow = x + cdownR + 1;
            lastCol = y + cdownR + 1;
        } else if (max == cdownL && (x + cdownL + 1) < 14
                && (y - cdownL - 1) >= 0) {
            if (board[x + cdownL + 1][y - cdownL - 1] == 0) {
                board[x + cdownL + 1][y - cdownL - 1] = 2;
            } else {
                board[x - 1][y + 1] = 2;
            }
            lastRow = x + cdownL + 1;
            lastCol = y - cdownL - 1;
        }
    }

    /**
     * 
     * @param x
     * @param y
     * if the count odd plays easy else plays hard
     */
    public void medium(int x, int y) {
        count++;
        if (count % 2 == 0) {
            easy(x, y);
        } else {
            hard(x, y);
        }
    }

    /**
     * 
     * @param player
     * @param x
     * @param y
     * set 3 in the expected index
     */
    public void hints(int player, int x, int y) {
        int cleft = 0, cup = 0, cdown = 0, cright = 0;
        int cupR = 0, cupL = 0, cdownR = 0, cdownL = 0;
        for (int i = x - 1, j = y + 1; i >= 0 && j < 14; i--, j++) {
            if (board[i][j] == player) {
                cupR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == player) {
                cupL++;
            } else {
                break;
            }
        }
        /////////////////////////////////

        for (int i = x + 1, j = y + 1; i < 14 && j < 14; i++, j++) {
            if (board[i][j] == player) {
                cdownR++;
            } else {
                break;
            }
        }
        ////////////////////////////////
        for (int i = x + 1, j = y - 1; i < 14 && j >= 0; i++, j--) {
            if (board[i][j] == player) {
                cdownL++;
            } else {
                break;
            }
        }
        ///////////////////////////////////
        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == player) {
                cleft++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = y + 1; i < 14; i++) {
            if (board[x][i] == player) {
                cright++;
            } else {
                break;
            }
        }
        //////////////////////////////////////////////////
        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == player) {
                cup++;
            } else {
                break;
            }
        }
        ///////////////////////////////////////////////////		
        for (int i = x + 1; i < 14; i++) {
            if (board[i][y] == player) {
                cdown++;
            } else {
                break;
            }
        }

        if (cright == 3) {
            if ((y + cright + 1) < 14) {
                if ((board[x][y + cright + 1] != 1 || board[x][y + cright + 1] != 2)
                        && board[x][y + cright + 1] == 0) {
                    board[x][y + cright + 1] = 3;
                }
                if ((board[x][y - 1] != 1 || board[x][y - 1] != 2)
                        && board[x][y - 1] == 0) {
                    board[x][y - 1] = 3;
                }
            }
            /*else {
             board[x][y - 1] = 3; 
             }*/
        } else if (cleft == 3) {
            if ((y - cleft - 1) >= 0) {
                if ((board[x][y - cleft - 1] != 1 || board[x][y - cleft - 1] != 2)
                        && board[x][y - cleft - 1] == 0) {
                    board[x][y - cleft - 1] = 3;
                }
                if ((board[x][y + 1] != 1 || board[x][y + 1] != 2)
                        && board[x][y + 1] == 0) {
                    board[x][y + 1] = 3;
                }
            }

            /*else {
             board[x][y + 1] = 3;
             }*/
        } else if (cup == 3) {
            if ((x - cup - 1) >= 0) {
                if ((board[x - cup - 1][y] != 1 || board[x - cup - 1][y] != 2)
                        && board[x - cup - 1][y] == 0) {
                    board[x - cup - 1][y] = 3;
                }
                if ((board[x + 1][y] != 1 || board[x + 1][y] != 2)
                        && board[x + 1][y] == 0) {
                    board[x + 1][y] = 3;
                }
            } /*else {
             board[x + 1][y] = 3;
             }*/
        } else if (cdown == 3) {
            if ((x + cdown + 1) < 14) {
                if ((board[x + cdown + 1][y] != 1 || board[x + cdown + 1][y] != 2)
                        && board[x + cdown + 1][y] == 0) {
                    board[x + cdown + 1][y] = 3;
                }
                if ((board[x - 1][y] != 1 || board[x - 1][y] != 2)
                        && board[x - 1][y] == 0) {
                    board[x - 1][y] = 3;
                }
            } /*else {
             board[x - 1][y] = 3;
             }*/
        } else if (cupR == 3) {
            if ((x - cupR - 1) >= 0 && (y + cupR + 1) < 14) {
                if ((board[x - cupR - 1][y + cupR + 1] != 1 || board[x - cupR
                        - 1][y + cupR + 1] != 2)
                        && board[x - cupR - 1][y + cupR + 1] == 0) {
                    board[x - cupR - 1][y + cupR + 1] = 3;
                }
                if ((board[x + 1][y - 1] != 1 || board[x + 1][y - 1] != 2)
                        && board[x + 1][y - 1] == 0) {
                    board[x + 1][y - 1] = 3;
                }
            }

        } else if (cupL == 3 && (x - cupL - 1) >= 0 && (y - cupL - 1) >= 0) {
            if ((board[x - cupL - 1][y - cupL - 1] != 1 || board[x - cupL - 1][y
                    - cupL - 1] != 2)
                    && board[x - cupL - 1][y - cupL - 1] == 0) {
                board[x - cupL - 1][y - cupL - 1] = 3;
            }
            if ((board[x + 1][y + 1] != 1 || board[x + 1][y + 1] != 2)
                    && board[x + 1][y + 1] == 0) {
                board[x + 1][y + 1] = 3;
            }
        } else if (cdownR == 3 && (x + cdownR + 1) < 14
                && (y + cdownR + 1) < 14) {
            if ((board[x + cdownR + 1][y + cdownR + 1] != 1 || board[x + cdownR
                    + 1][y + cdownR + 1] != 2)
                    && board[x + cdownR + 1][y + cdownR + 1] == 0) {
                board[x + cdownR + 1][y + cdownR + 1] = 3;
            }
            if ((board[x - 1][y - 1] != 1 || board[x - 1][y - 1] != 2)
                    && board[x - 1][y - 1] == 0) {
                board[x - 1][y - 1] = 3;
            }
        } else if (cdownL == 3 && (x + cdownL + 1) < 14
                && (y - cdownL - 1) >= 0) {
            if ((board[x + cdownL + 1][y - cdownL - 1] != 1 || board[x + cdownL
                    + 1][y - cdownL - 1] != 2)
                    && board[x + cdownL + 1][y - cdownL - 1] == 0) {
                board[x + cdownL + 1][y - cdownL - 1] = 3;
            }
            if ((board[x - 1][y + 1] != 1 || board[x - 1][y + 1] != 2)
                    && board[x - 1][y + 1] == 0) {
                board[x - 1][y + 1] = 0;
            }
        }
    }

    /**
     * reset all indeces with value 3 to 0
     */
    public void resetBoard() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
            }
        }
    }

    /**
     * save the board in array lastVersion
     */
    public void saveBoard() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                lastVersion[i][j] = board[i][j];
            }
        }
    }

   /**
    * load the board from array last version 
    */
    public void loadBoard() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                board[i][j] = lastVersion[i][j];
            }
        }
    }
}
