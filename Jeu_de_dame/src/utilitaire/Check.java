package utilitaire;

import objet.*; 

import lady.Game;
import java.util.ArrayList;

public class Check {
	
	
	public static ArrayList<CheckType> checkList = new ArrayList<>();
	public static ArrayList<Pions> checkEat = new ArrayList<>();
	public static boolean endGame = false ;
	
			
	public static void checkMove(Pions pawn) {
		
		checkList.clear() ;
		int save = 0 ;
		
		if ( pawn.isQueen() == false  ) {
			
			if ( pawn.getX() + 1 <= Game.lengthMapX -1 && pawn.getY() + 1 <= Game.lengthMapY -1 ) {
				
				if ( Game.map[pawn.getX() + 1][pawn.getY() + 1] == Game.noir ) {
						
					checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() + 1 , pawn.getY() + 1, -1 ,-1)) ;
					save++ ;
					
				} else if ( pawn.getX() + 2  <= Game.lengthMapX -1 && pawn.getY() + 2 <= Game.lengthMapY -1 ) {
					
					if (  Game.map[pawn.getX() + 1][pawn.getY() + 1] == pawn.getIcoTarget() || Game.map[pawn.getX() + 1][pawn.getY() + 1] == pawn.getIcoTargetQueen() && Game.map[pawn.getX() + 2][pawn.getY() + 2] == Game.noir ) {
						
						checkList.add(new CheckType( Integer.toString(save) , pawn ,pawn.getX() + 2 , pawn.getY() + 2, pawn.getX() + 1 ,pawn.getY() + 1 )) ;
						save++ ;
						
					}
					
				}
				
			
			} 
			
			if ( pawn.getX() + 1 <= Game.lengthMapX -1 && pawn.getY() - 1 >= 0 ) {
							
				if ( Game.map[pawn.getX() + 1][pawn.getY() - 1] == Game.noir ) {
						
					checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() + 1 , pawn.getY() - 1, -1 ,-1)) ;
					save++ ;
					
				} else if ( pawn.getX() + 2  <= Game.lengthMapX - 1 && pawn.getY() - 2 >= 0 ) {
					
					if (  Game.map[pawn.getX() + 1][pawn.getY() - 1] == pawn.getIcoTarget() || Game.map[pawn.getX() + 1][pawn.getY() - 1] == pawn.getIcoTargetQueen() && Game.map[pawn.getX() + 2][pawn.getY() - 2] == Game.noir ) {
						
						checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() + 2 , pawn.getY() - 2 , pawn.getX() + 1 ,pawn.getY() - 1 )) ;
						save++ ;
						
					}
					
				}
				
			
			} 
			
			if ( pawn.getX() - 1 >= 0 && pawn.getY() - 1 >= 0 ) {
				
				if ( Game.map[pawn.getX() - 1][pawn.getY() - 1] == Game.noir ) {
						
					checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 1 , pawn.getY() - 1, -1 ,-1)) ;
					save++ ;
					
				} else if ( pawn.getX() - 2   >= 0 && pawn.getY() - 2 >= 0) {
					
					if (  Game.map[pawn.getX() - 1][pawn.getY() - 1] == pawn.getIcoTarget() || Game.map[pawn.getX() - 1][pawn.getY() - 1] == pawn.getIcoTargetQueen() && Game.map[pawn.getX() - 2][pawn.getY() - 2] == Game.noir ) {
						
						checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 2 , pawn.getY() - 2 , pawn.getX() - 1 ,pawn.getY() - 1 )) ;
						save++ ;
						
					}
					
				}
				
			
			}
			
			if ( pawn.getX() - 1 >= 0 && pawn.getY() + 1 <= Game.lengthMapY - 1 ) {
							
							if ( Game.map[pawn.getX() - 1][pawn.getY() + 1] == Game.noir ) {
									
								checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 1 , pawn.getY() + 1, -1 ,-1)) ;
								save++ ;
								
							} else if ( pawn.getX() - 2   >= 0 && pawn.getY() + 2 <= Game.lengthMapY - 1 ) {
								
								if (  Game.map[pawn.getX() - 1][pawn.getY() + 1] == pawn.getIcoTarget() || Game.map[pawn.getX() - 1][pawn.getY() + 1] == pawn.getIcoTargetQueen() && Game.map[pawn.getX() - 2][pawn.getY() + 2] == Game.noir ) {
									
									checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 2 , pawn.getY() + 2 , pawn.getX() - 1 ,pawn.getY() + 1 )) ;
									save++ ;
									
								}
								
							}
							
						
						}
			
		
			
			
			
		} // else Queen 
		
		
		
		
	}
	
	public static void checkEatPawn( char equipe ) {
		
		checkEat.clear() ;
		
		for (Pions element : Game.listPions ) {
			
			if ( element.getIco() == equipe ) {
				
				checkMove( element ) ;
			
				for ( CheckType checkElement : checkList ) {
					
					if ( checkElement.getEatX() != -1 ) {
						
						checkEat.add( element ) ;
					}
				}
			}
				
			
		}
	}
	
	public static void checkLady() {
		
		for ( Pions element : Game.listPions  ) {
			
			if ( element.getIco() == Game.equipe1 ) {
				
				if ( element.getY() == Game.lengthMapY ) {
					
					element.setQueen(true);
					element.setIco(Game.reineEquipe1);
					Game.map[element.getX()][element.getY()] = Game.reineEquipe1 ;
					
				}
				
			} else {
				
				if ( element.getY() == 0 ) {
					
					element.setQueen(true);
					element.setIco(Game.reineEquipe2);
					Game.map[element.getX()][element.getY()] = Game.reineEquipe2 ;
					
				}
				
			}
		}
	}

}
