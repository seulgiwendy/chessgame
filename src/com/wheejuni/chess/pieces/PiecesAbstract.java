package com.wheejuni.chess.pieces;

import com.wheejuni.chess.domain.MovingPattern;
import com.wheejuni.chess.domain.Position;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public abstract class PiecesAbstract {
	
	Position position;
	MovingPattern pattern;
	Type type;
	Color color;
	
	public abstract MovingPattern getPattern();
	public abstract Position getPosition();
	public abstract Type getType();
	public abstract Color getColor();
	
}
