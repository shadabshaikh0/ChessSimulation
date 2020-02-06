package driver;

import pieces.King;

import java.util.ArrayList;

import pieces.Bishop;
import pieces.Horse;
import pieces.Pawn;
import pieces.Piece;
import pieces.Rook;
import pieces.Queen;
import resources.Stringconstants;

public class ChessSimulation {
	
	private Input inputDriver;

	
	public ChessSimulation(){
		inputDriver = new Input();
		inputDriver.takeInputFromConsole();
	}
	
	
	public void searchForPossibleMovements() {

		String pieceName = inputDriver.getPiece();
		String piecePosition = inputDriver.getPiecePosition();

		Piece piece = null;
		switch( pieceName ) {
			case Stringconstants.KING:
				piece = new King();
				break;
			case Stringconstants.BISHOP:
				piece = new Bishop();
				break;
			case Stringconstants.HORSE:
				piece = new Horse();
				break;
			case Stringconstants.PAWN:
				piece = new Pawn();
				break;
			case Stringconstants.QUEEN:
				piece = new Queen();
				break;
			case Stringconstants.ROOK:
				piece = new Rook();
				break;
			default:
				System.out.print("Wrong Input");
		}

		ArrayList<String> possibleMoves = new ArrayList<String>();
		possibleMoves = piece.searchPossibleMoves(piecePosition);
		for( String cell: possibleMoves ) {
			System.out.print(cell+" ");
		}
		
	}
	
	public static void main(String[] args) {
		ChessSimulation chessSimulation = new ChessSimulation();
		chessSimulation.searchForPossibleMovements();		
	}

}
