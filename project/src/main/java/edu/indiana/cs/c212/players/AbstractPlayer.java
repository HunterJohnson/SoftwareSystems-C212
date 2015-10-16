package edu.indiana.cs.c212.players;

import edu.indiana.cs.c212.gameMechanics.PlayerColor;

public abstract class AbstractPlayer implements Player {

	protected PlayerColor color;

	public AbstractPlayer(PlayerColor c) {
		this.color = c;
	}

	public PlayerColor getColor() {
		return this.color;
	}

	public abstract String getName();

}
