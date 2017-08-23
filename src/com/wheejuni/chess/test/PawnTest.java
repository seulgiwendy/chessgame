package com.wheejuni.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wheejuni.chess.pieces.Piece;

public class PawnTest {

	@Test
    public void create_기본생성자() throws Exception {
        Piece pawn = new Piece();
        assertEquals(Piece.WHITE_COLOR, pawn.getColor());
        assertEquals(Piece.WHITE_REPRESENTATION, pawn.getRepresentation());
    }

    @Test
    public void create() {
        verifyPawn(Piece.WHITE_COLOR, Piece.WHITE_REPRESENTATION);
        verifyPawn(Piece.BLACK_COLOR, Piece.BLACK_REPRESENTATION);
    }
    
    

    void verifyPawn(final String color, final char representation) {
        Piece pawn = new Piece(color, representation);
        assertEquals(color, pawn.getColor());
        assertEquals(representation, pawn.getRepresentation());
    }

}
