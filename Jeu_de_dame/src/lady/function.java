package lady;

import objet.Pions; 

public class function {
	
	public static void createMap() {
		
		char save = Game.noir ;
		
		for(int j=0 ; j<Game.lengthMapY  ; j++) {
			for(int i=0 ; i<Game.lengthMapX ; i++) {
				
				if (save == Game.blanc) {
					Game.map[i][j] = Game.noir ;
					save = Game.noir ;
				}else {
					Game.map[i][j] = Game.blanc ;
					save = Game.blanc ;
				}	
			}
			
			if (save == Game.blanc) {
				save = Game.noir ;
			}else {
				save = Game.blanc ;
			}
		}	
	}
	
	public static void printMap() {
		
		for(int j=0 ; j<Game.lengthMapY  ; j++) {
			System.out.println() ;
			for(int i=0; i<Game.lengthMapX ; i++) {
				System.out.print( Game.map[i][j]); 	
			}
		}
		System.out.print("\n");
	}
	
	public static void createPawn() {
		
		int save = 0 ;
		
		for(int j=0 ; j<Game.numberOfRow ; j++) {
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				if(Game.map[i][j] == Game.noir ) {
					Game.listPions.add(new Pions(Game.equipe1, 1, i, j, save));
					Game.map[i][j] = Game.listPions.get(save).getIco();
					save++;
				}
			}
		}
		
		int saved = save;
		save = 0;
		
		for(int j=Game.lengthMapY - Game.numberOfRow ; j<Game.lengthMapY ; j++) {
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				if(Game.map[i][j] == Game.noir ) {
					Game.listPions.add(new Pions(Game.equipe2, 2, i, j, save));
					Game.map[i][j] = Game.listPions.get(saved).getIco();
					save++;
				}
			}
		}
	}
	
	public static void menu() {
		//
	}
	
	public static void endScreen() {
		//
	}
	
	public static void printMapId(char icoPion, char icoQueen) {
		
		for(int j=0 ; j<Game.lengthMapY  ; j++) {
			System.out.println() ;
			
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				if (Game.map[i][j] == icoPion || Game.map[i][j] == icoQueen) {
					
					for (Pions element : Game.listPions ) {
						
						if ( element.getX() == i && element.getY() == j) {
							System.out.print( element.getNumber());
						}
					}
				}else {
					System.out.print( Game.map[i][j]); 
				}
					
			}
		}
		System.out.print("\n");
	}
}
