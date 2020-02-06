package pieces;
import java.util.ArrayList;


public interface Piece {
	
	char START = 'A';
	public ArrayList<String> searchPossibleMoves(String piecePosition);
	
	public static boolean isValidMove(int possibleRow, int possibleColumn) {
		if( possibleRow < 0 || possibleRow >= 8 )
				return false;
		if( possibleColumn < 0 || possibleColumn >= 8 )
			return false;
		return true;
	}
}
