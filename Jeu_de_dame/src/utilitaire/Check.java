package utilitaire;

import objet.Pions; 
import lady.Game;

public class Check {
	
	static String[] checkList = new String[Game.lengthMapX*Game.lengthMapY+1];

	public static String[] checkMove(Pions pawn) {
		
		if ( pawn.getIco() == Game.equipe1 || pawn.getIco() == Game.equipe2 ) {
			
		}
		
	}

}
