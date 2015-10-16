package edu.indiana.cs.c212.gameMechanics;

public class Move {
	
	private int x;
	private int y;
	
	public Move(int x, int y){
		this.x = x;
		this.y = y;	
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "Move: (x=" + x + ", y=" + y + ")";
	}
	
	@Override
	public boolean equals(java.lang.Object other) {
		if(this.getClass() != other.getClass())
			return false;
		else if(this.getX() == ((Move) other).getX() && (this.getY() == ((Move) other).getY()))
				return true;
		else
			return false;
		
	}


	
	

}
