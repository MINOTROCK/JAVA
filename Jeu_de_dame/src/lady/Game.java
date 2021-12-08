package lady;

import objet.Pions;
import objet.IdPions;
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
	
	
	public static void game() {
		
		Function.createMap();
		Function.createPawn();
		Function.startGame() ;
		Function.menuGame();
		Function.endScreen();
		
	}
	
	
	public static char[][] map = new char[lengthMapX][lengthMapY] ;
	public static ArrayList<Pions> listPions = new ArrayList<Pions>();
	public static ArrayList<IdPions> idListPions = new ArrayList<IdPions>();
	public static String[] numList = {"A" ,"C" ,"D" ,"E" ,"F" ,"G" ,"H" ,"I" ,"I" ,"J" ,"K" ,"L" ,"M" ,"O" ,"P" ,"Q" ,"R" ,"S" ,"T" ,"U" ,"V" ,"W" ,"X" ,"Y" ,"Z" ,"0" ,"1" ,"2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" };
	public static String joueur1 ;
	public static String joueur2 ;

}
