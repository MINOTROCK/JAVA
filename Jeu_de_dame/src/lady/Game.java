package lady;

import objet.Pions;
import utilitaire.Check ;
import java.util.ArrayList;


public class Game {
	
	public static int lengthMapX = 10 ;
	public static int lengthMapY = 10 ;
	static int numberOfRow = 4;
	public static char blanc = 43;
	public static char noir = 32;
	public static char reineEquipe1 = 36;
	public static char reineEquipe2 = 37;
	public static char equipe1 = 66;
	public static char equipe2 = 78;
	public static char[][] map = new char[lengthMapX][lengthMapY] ;
	public static ArrayList<Pions> listPions = new ArrayList<Pions>();
	public static String[] numList = {"A" ,"C" ,"D" ,"E" ,"F" ,"G" ,"H" ,"I" ,"I" ,"J" ,"K" ,"L" ,"M" ,"O" ,"P" ,"Q" ,"R" ,"S" ,"T" ,"U" ,"V" ,"W" ,"X" ,"Y" ,"Z" ,"0" ,"1" ,"2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" };
	public static String joueur1 ;
	public static String joueur2 = "Robot" ;
	static int countMove = 0 ;

	public static void game() {
		Function.createMap();
		Function.createPawn();
		Function.namePlayers() ;
		Function.menuGame();
		Function.printMap();
		Function.printMapId(equipe1, reineEquipe1);
		Function.printMapId(equipe2, reineEquipe2);
//		Function.movePawn(listPions.get(4), 4, 3);
		Function.endScreen();
		listPions.add(new Pions(Game.equipe2,Game.reineEquipe2,Game.equipe2,Game.reineEquipe2, 1, 5, 4, 50));
		map[5][4] = equipe2 ;
		Check.checkMove(listPions.get(18));
		Function.printMap();
		Function.printMove(Check.checkList);
		


	}

}
