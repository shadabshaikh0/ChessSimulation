package TestPieces;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import pieces.Pawn;

public class PawnTest {

	@Test
	public void test() {
		Pawn pawnobject = new Pawn();
		ArrayList<String> actualpossibleMoves,expectedpossibleMoves;
		actualpossibleMoves =  pawnobject.searchPossibleMoves("B5");		
		expectedpossibleMoves = new ArrayList<String>( Arrays.asList( "C5" ) );		
		Collections.sort(actualpossibleMoves);
		Collections.sort(expectedpossibleMoves);		
		assertEquals(expectedpossibleMoves, actualpossibleMoves);				
	}

}
