package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.chess.domain.PieceBuilder;
import com.wheejuni.chess.domain.piecesfactory.BlackPawnCreator;
import com.wheejuni.chess.domain.piecesfactory.PieceTypeFactory;
import com.wheejuni.chess.domain.piecesfactory.WhiteBishopCreator;
import com.wheejuni.chess.pieces.Piece;
import com.wheejuni.chess.pieces.Piece.Color;
import com.wheejuni.chess.pieces.Piece.Type;

public class PieceTest {

	PieceTypeFactory ptf;

	@Test
	public void create_기본생성자() throws Exception {
		Piece pawn = new Piece();
		assertEquals(Piece.Color.WHITE.getColor(), pawn.getColor());
		assertEquals(Piece.Type.PAWN_WHITE.getRepresentation(), pawn.getRepresentation());
	}

	@Test
	public void create() {
		verifyPawn(Piece.Color.WHITE, Piece.Type.PAWN_WHITE);
		verifyPawn(Piece.Color.BLACK, Piece.Type.PAWN_BLACK);
	}

	@Test
	public void createByInterface() {
		Piece piece = newBlackPawn();
		//System.out.println(piece.getColor());
		assertEquals(piece.getColor(), Piece.Color.BLACK.getColor());
	}

	@Test
	public void createByInterfaceWhiteBishop() {
		Piece piece = newWhiteBishop();
		assertEquals(piece.getRepresentation(), Piece.Type.BISHOP.getRepresentation());

	}
	
	@Test
	public void equalColor() {
		Piece piece = new Piece(Color.BLACK, Type.BISHOP);
		assertTrue(piece.equalColor(Color.BLACK));
	}
	
	@Test
	public void equalPiece() {
		Piece piece = newWhiteBishop();
		assertTrue(piece.equalType(Type.BISHOP));
	}

	void verifyPawn(Color color, Type type) {
		Piece pawn = new Piece(color, type);
		assertEquals(color.getColor(), pawn.getColor());
		assertEquals(type.getRepresentation(), pawn.getRepresentation());
	}

	Piece newBlackPawn() {
		PieceBuilder pb = new PieceBuilder();
		pb.setPieceType(new BlackPawnCreator());
		return pb.buildPiece();
	}

	Piece newWhiteBishop() {
		PieceBuilder pb = new PieceBuilder();
		pb.setPieceType(new WhiteBishopCreator());
		return pb.buildPiece();

	}

}
