package edu.indiana.cs.c212.gameMechanics;

public class OverwriteMove extends Move {

    
    public OverwriteMove(int x, int y) {
        super(x, y);
    }
    
    public String toString() {
        return "OVERWRITE" + super.toString();
    }
    
    public boolean equals(Object other) {
        if (other.getClass() == this.getClass()) {
            if (((OverwriteMove) other).getX() == super.getX() && ((OverwriteMove) other).getY() == super.getY()){
                return true;
            }
            else return false;
            
        }
        else return false;
    }

}