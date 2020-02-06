package TestPieces;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import pieces.King;

public class KIngTest {

	@Test
	public void test() {
		King kingobject = new King();
		ArrayList<String> actualpossibleMoves,expectedpossibleMoves;
		actualpossibleMoves =  kingobject.searchPossibleMoves("B5");		
		expectedpossibleMoves = new ArrayList<String>( Arrays.asList( "A3","A4","B4","C4","C5","C6","B6","A6" ) );		
		Collections.sort(actualpossibleMoves);
		Collections.sort(expectedpossibleMoves);		
		assertEquals(expectedpossibleMoves, actualpossibleMoves);				
	}

}
