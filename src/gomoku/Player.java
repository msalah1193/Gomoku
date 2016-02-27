/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gomoku;

/**
 * class player have all infos about the player 
 * the type 1,2 one for human and two for computer.. the priorty 1,2 .. the color 1,2 one for black and two for white 
 * the setters and getters 
 */

class Player {
    
    private int type;
    private int priorty;
    private int color;

    public Player(int type) {
        this.type = type;
    }
    
    public void setPriorty(int priorty){
        this.priorty = priorty;
    }
    
    public void setColor(int priorty){
        this.color = color;
    }
    
    public int getColor() {
        return color;
    }

    public int getType() {
        return type;
    }

    public int getPriorty() {
        return priorty;
    }
}
