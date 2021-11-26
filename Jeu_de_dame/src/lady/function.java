package lady;

import java.util.ArrayList;

import objet.*;  
import utilitaire.*;

public class Function {
	
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
				System.out.print(" " + Game.map[i][j]); 	
			}
		}
		System.out.print("\n");
	}
	
	public static void createPawn() {
		
		int save = 0 ;
		
		for(int j=0 ; j<Game.numberOfRow ; j++) {
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				if(Game.map[i][j] == Game.noir ) {
					Game.listPions.add(new Pions(Game.equipe1,Game.reineEquipe1,Game.equipe2,Game.reineEquipe2, 1, i, j, save));
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
					Game.listPions.add(new Pions(Game.equipe2,Game.reineEquipe2,Game.equipe1,Game.reineEquipe1, 2, i, j, save));
					Game.map[i][j] = Game.listPions.get(saved).getIco();
					save++;
				}
			}
		}
	}
	
	public static void menuGame() {
		//
	}
	
	public static void endScreen() {
		
	}
	
	public static void printMapId(char icoPion, char icoQueen) {
		
		for(int j=0 ; j<Game.lengthMapY  ; j++) {
			System.out.println() ;
			
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				if (Game.map[i][j] == icoPion || Game.map[i][j] == icoQueen) {
					
					for (Pions element : Game.listPions ) {
						
						if ( element.getX() == i && element.getY() == j) {
							
							if ( element.getNumber() < 35 ) {
								
								System.out.print( " " + Game.numList[element.getNumber()] );
								
							} else {
								
							System.out.print( " " + ( element.getNumber() - 25 ));
							
							}
						}
					}
				}else {
					System.out.print(" " + Game.map[i][j]); 
				}
					
			}
		}
		System.out.print("\n");
	}
	
	public static void movePawn(Pions pawn, int newX, int newY) {
		Game.map[pawn.getX()][pawn.getY()] = Game.noir;
		pawn.setX(newY);
		pawn.setY(newX);
		Game.map[pawn.getX()][pawn.getY()] = pawn.getIco();
	}
	
	public static void namePlayers() {
		
		boolean checkChoicePlayerMode = false ;
		String saveTmp ;
		
		System.out.print(ManageInOut.text1);
		
		do {
			
			System.out.print(ManageInOut.text2);
			String choicePlayerMode = ManageInOut.userString();
			
			switch(choicePlayerMode) {
			case "1": 
				checkChoicePlayerMode = true;
				
				do {
					System.out.print(ManageInOut.text3);
					saveTmp = utilitaire.ManageInOut.userString() ;
					saveTmp = saveTmp.toUpperCase().substring(0, 1) +  saveTmp.substring(1);
					Game.joueur1 = saveTmp;
				} while( Game.joueur1 == "Null") ;
				break;
			case "2":
				checkChoicePlayerMode = true;
				
				do {
					System.out.print(ManageInOut.text3);
					saveTmp = utilitaire.ManageInOut.userString() ;
					saveTmp = saveTmp.toUpperCase().substring(0, 1) +  saveTmp.substring(1);
					Game.joueur1 = saveTmp;
					
					System.out.print(ManageInOut.text4);
					saveTmp = utilitaire.ManageInOut.userString() ;
					saveTmp = saveTmp.toUpperCase().substring(0, 1) +  saveTmp.substring(1);
					Game.joueur2 = saveTmp;
				} while( Game.joueur1 == "Null" || Game.joueur2 == "Null" ) ;
				
				System.out.print(Game.joueur1 + Game.joueur2);
				break;
			case "null" :
				System.out.println(ManageInOut.error2);
				break;
			default:
				System.out.println(ManageInOut.error1);
			}
		}while(checkChoicePlayerMode == false);
		
	}
	
	public static void printMove( ArrayList<CheckType> pawnMove ) {
		
		boolean save = false ;
		
		for(int j=0 ; j<Game.lengthMapY  ; j++) {
			System.out.println() ;
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				for ( CheckType element : pawnMove ) {
					
					if ( element.getNewX() == i && element.getNewY() == j ) {
						
						System.out.print(" " + element.getIcoMove() );
						save = true ;
						
					}
				}
				
				if ( save == false ) {
					System.out.print(" " + Game.map[i][j]); 	
				}
				
				save = false ;	
				
			}
		}
		System.out.print("\n");
	}
	
	public static void removePawn( Pions pawn ) {
		
		Game.map[pawn.getX()][pawn.getY()] = Game.noir ;
		Game.listPions.remove(pawn) ;
		
	}

}
	




