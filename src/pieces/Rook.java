package pieces;

import java.util.ArrayList;

public class Rook implements Piece{
	int rowdirections[] = { 0,0,-1,1};
	int columndirections[] = { -1,1,0,0};
	int DIRECTION_SIZE = 4;
	public Rook() {
	}
	
	public String getPossibleCell( int possibleRow,int possibleColumn ) {
		char row = (char) ((7 - possibleRow) + 'A'); 
		char column = (char)((possibleColumn+1) + '0');
		StringBuffer cellbuffer = new StringBuffer();
		cellbuffer.append(row);
		cellbuffer.append(column);
		return cellbuffer.toString();
	}
	
	@Override
	public ArrayList<String> searchPossibleMoves(String piecePosition) {
		char rowCharacter = piecePosition.charAt(0);
		char columnCharacter = piecePosition.charAt(1);
		
		int rowNumber = 7 - ( rowCharacter - START);
		int columnNumber = Integer.valueOf(columnCharacter-'0')-1;
		
		ArrayList<String> possibleMoves = new ArrayList<String>();

		for( int i=0;i<DIRECTION_SIZE;i++ ) {

			int possibleRow = rowNumber + rowdirections[i];
			int possibleColumn = columnNumber + columndirections[i];
						
			while( Piece.isValidMove( possibleRow,possibleColumn ) == true  ) {	
				String cell = getPossibleCell( possibleRow,possibleColumn );
				possibleMoves.add(cell);
				possibleRow = possibleRow + rowdirections[i];
				possibleColumn = possibleColumn + columndirections[i];
			}
						
		}			
		return possibleMoves;
	}
}
