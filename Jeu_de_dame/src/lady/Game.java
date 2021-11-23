package lady;

import objet.Pions;
import java.util.ArrayList;

public class Game {
	
	public static int lengthMapX = 10 ;
	public static int lengthMapY = 10 ;
	static int numberOfRow = 4;
	static char blanc = 43;
	static char noir = 32;
	static char reineBlanche = 36;
	static char reineNoire = 37;
	static char equipe1 = 66;
	static char equipe2 = 78;
	static char[][] map = new char[lengthMapX][lengthMapY] ;
	public static ArrayList<Pions> listPions = new ArrayList<Pions>();
	static String[] numList = {"0" ,"1" ,"2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"A" ,"B" ,"C" ,"D" ,"E" ,"F" ,"G" ,"H" ,"I" ,"I" ,"J" ,"K" ,"L" ,"M" ,"N" ,"O" ,"P" ,"Q" ,"R" ,"S" ,"T" ,"U" ,"V" ,"W" ,"X" ,"Y" ,"Z"};
	static String joueur1 ;
	static String joueur2 = "Robot" ;

	public static void game() {
		Function.createMap();
//		function.printMap();
//		function.printMapId(equipe1, reineBlanche);
		Function.createPawn();
//		function.printMap();
//		function.printMapId(equipe2, reineNoire);
//		function.movePawn(listPions.get(4), 4, 3);
//		function.printMap();
//		function.printMapId(equipe1, reineBlanche);
//		function.menu();
//		function.endScreen();
//		System.out.println(listPions) ;
		Function.namePlayers() ;
		Function.menuGame();
	}

}
