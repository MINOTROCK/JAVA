package lady;

import objet.Pions;
import java.util.ArrayList;

public class Game {
	
	static int lengthMapX = 10 ;
	static int lengthMapY = 10 ;
	static int numberOfRow = 4;
	static char blanc = 43;
	static char noir = 32;
	static char reineBlanche = 36;
	static char reineNoire = 37;
	static char equipe1 = 66;
	static char equipe2 = 78;
	static char[][] map = new char[lengthMapX][lengthMapY] ;
	public static ArrayList<Pions> listPions = new ArrayList<Pions>();
	

	public static void game() {
		function.createMap();
		function.createPawn();
		function.printMap();
		function.printMapId(equipe1, reineBlanche);
		function.menu();
		function.endScreen();

	}

}
