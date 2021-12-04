package lady;

import objet.Pions;
import objet.IdPions;
import utilitaire.Check ;
import java.util.ArrayList;
//import java.util.Arrays;


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
//		Function.removePawn( 5 , 2 ) ;
//		Function.removePawn( 7 , 2 ) ;

		Function.printMap();
		Function.startGame() ;
		
		
//		Check.checkMove( listPions.get(18)) ;
		
//		System.out.print(Check.checkList.toString()) ;
//		Function.printMap();
//		System.out.print(listPions);
//		Function.movePawn( listPions.get(0) , 5 , 2 )  ;
//		Function.removePawn( 1 , 6 ) ;
//		Function.removePawn( 3 , 6 ) ;
//		System.out.print(listPions);
//		Function.printMap();
//		Function.movePawn(  Game.listPions.get(18) , 5, 4  ) ;
		Function.menuGame();
		Function.endScreen();
		
//		Function.printMap();
//		Function.printMapId(equipe1, reineEquipe1);
//		Function.printMapId(equipe2, reineEquipe2);
//		Function.movePawn(listPions.get(4), 4, 3);
//		Function.endScreen();
//		listPions.add(new Pions(Game.equipe2,Game.reineEquipe2,Game.equipe2,Game.reineEquipe2, 1, 5, 4, 50));
//		map[5][4] = equipe2 ;
//		Check.checkMove(listPions.get(18));
//		Function.printMap();
//		Function.printMove(Check.checkList);
		
	}
	
	
	public static char[][] map = new char[lengthMapX][lengthMapY] ;
	public static ArrayList<Pions> listPions = new ArrayList<Pions>();
	public static ArrayList<IdPions> idListPions = new ArrayList<IdPions>();
	public static String[] numList = {"A" ,"C" ,"D" ,"E" ,"F" ,"G" ,"H" ,"I" ,"I" ,"J" ,"K" ,"L" ,"M" ,"O" ,"P" ,"Q" ,"R" ,"S" ,"T" ,"U" ,"V" ,"W" ,"X" ,"Y" ,"Z" ,"0" ,"1" ,"2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" };
	public static String joueur1 ;
	public static String joueur2 = "Robot" ;

}
