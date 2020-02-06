package driver;

import java.util.Scanner;
public class Input {
	private String piece;
	private String piecePosition;
	private Scanner scaninput;
	
	public Input() {
		piece = new String();
		piecePosition = new String();
		scaninput = new Scanner(System.in);
	}
	
	public void takeInputFromConsole(){
		piece = scaninput.next();
		piecePosition = scaninput.next();
	}

	public String getPiece() {
		return piece;
	}

	public String getPiecePosition() {
		return piecePosition;
	}
	
}
