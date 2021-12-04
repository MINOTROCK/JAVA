package utilitaire;

import objet.*; 

import lady.Game;
import java.util.ArrayList;

public class Check {
	
	
	public static ArrayList<CheckType> checkList = new ArrayList<>();
	public static ArrayList<Pions> checkEat = new ArrayList<>();
	public static boolean endGame = false ;
	public static String winner ;
	public static String loser ;
	public static int countMove = 0 ;
	static boolean lady1 = false ;
	static boolean lady2 = false ;
	public static boolean eatTwoOnce = false ;
	public int newXID = 0 ;
	public int newYID = 0 ;
	
			
	public static void checkMove(Pions pawn) {
		
		checkList.clear() ;
		int save = 0 ;
		
		if ( pawn.isQueen() == false  ) {
			
			if ( pawn.getX() + 1 <= Game.lengthMapX -1 && pawn.getY() + 1 <= Game.lengthMapY -1 && pawn.getTeam() == 1) {
				
				if ( Game.map[pawn.getX() + 1][pawn.getY() + 1] == Game.noir ) {
						
					checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() + 1 , pawn.getY() + 1, -1 ,-1)) ;
					save++ ;

					
				} else if ( pawn.getX() + 2  <= Game.lengthMapX -1 && pawn.getY() + 2 <= Game.lengthMapY -1 ) {
					
					if ( ( Game.map[pawn.getX() + 1][pawn.getY() + 1] == pawn.getIcoTarget() || Game.map[pawn.getX() + 1][pawn.getY() + 1] == pawn.getIcoTargetQueen() ) && Game.map[pawn.getX() + 2][pawn.getY() + 2] == Game.noir ) {
						
						checkList.add(new CheckType( Integer.toString(save) , pawn ,pawn.getX() + 2 , pawn.getY() + 2, pawn.getX() + 1 ,pawn.getY() + 1 )) ;
						save++ ;

						
					}
					
				}
				
			
			} 
			
			if ( pawn.getX() + 1 <= Game.lengthMapX -1 && pawn.getY() - 1 >= 0 && pawn.getTeam() == 2) {
							
				if ( Game.map[pawn.getX() + 1][pawn.getY() - 1] == Game.noir ) {
						
					checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() + 1 , pawn.getY() - 1, -1 ,-1)) ;
					save++ ;

					
				} else if ( pawn.getX() + 2  <= Game.lengthMapX - 1 && pawn.getY() - 2 >= 0 ) {
					
					if ( ( Game.map[pawn.getX() + 1][pawn.getY() - 1] == pawn.getIcoTarget() || Game.map[pawn.getX() + 1][pawn.getY() - 1] == pawn.getIcoTargetQueen() ) && Game.map[pawn.getX() + 2][pawn.getY() - 2] == Game.noir ) {
						
						checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() + 2 , pawn.getY() - 2 , pawn.getX() + 1 ,pawn.getY() - 1 )) ;
						save++ ;
						
						
					}
					
				}
				
			
			} 
			
			if ( pawn.getX() - 1 >= 0 && pawn.getY() - 1 >= 0 && pawn.getTeam() == 2 ) {
				
				if ( Game.map[pawn.getX() - 1][pawn.getY() - 1] == Game.noir ) {
						
					checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 1 , pawn.getY() - 1, -1 ,-1)) ;
					save++ ;
					
				} else if ( pawn.getX() - 2   >= 0 && pawn.getY() - 2 >= 0) {
					
					if ( ( Game.map[pawn.getX() - 1][pawn.getY() - 1] == pawn.getIcoTarget() || Game.map[pawn.getX() - 1][pawn.getY() - 1] == pawn.getIcoTargetQueen() ) && Game.map[pawn.getX() - 2][pawn.getY() - 2] == Game.noir ) {
						
						checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 2 , pawn.getY() - 2 , pawn.getX() - 1 ,pawn.getY() - 1 )) ;
						save++ ;
						
					}
					
				}
				
			
			}
			
			if ( pawn.getX() - 1 >= 0 && pawn.getY() + 1 <= Game.lengthMapY - 1 && pawn.getTeam() == 1 ) {
							
							if ( Game.map[pawn.getX() - 1][pawn.getY() + 1] == Game.noir ) {
									
								checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 1 , pawn.getY() + 1, -1 ,-1)) ;
								save++ ;
								
								
							} else if ( pawn.getX() - 2   >= 0 && pawn.getY() + 2 <= Game.lengthMapY - 1 ) {
								
								if ( ( Game.map[pawn.getX() - 1][pawn.getY() + 1] == pawn.getIcoTarget() || Game.map[pawn.getX() - 1][pawn.getY() + 1] == pawn.getIcoTargetQueen() ) && Game.map[pawn.getX() - 2][pawn.getY() + 2] == Game.noir ) {
									
									checkList.add(new CheckType( Integer.toString(save) , pawn , pawn.getX() - 2 , pawn.getY() + 2 , pawn.getX() - 1 ,pawn.getY() + 1 )) ;
									save++ ;
									
								}	
							}
						}
			
		
			
			
			
		} // else Queen 
		
		
		
		
	}
	
	public static void checkEatPawn( int equipe ) {
		
		checkEat.clear() ;
		
		for (Pions element : Game.listPions ) {
			
			if ( element.getTeam() == equipe ) {
				
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
				
				if ( element.getY() == Game.lengthMapY - 1 ) {
					
					element.setQueen(true);
					element.setIco(Game.reineEquipe1);
					Game.map[element.getX()][element.getY()] = Game.reineEquipe1 ;
					
					if ( lady1 == false ) {
						
						lady1 = true ;
						System.out.print( ManageInOut.text5 + Game.joueur1 + ManageInOut.text8 + Game.reineEquipe1 + ManageInOut.text9 );
						
					}
					
				}
				
			} else {
				
				if ( element.getY() == 0 ) {
					
					element.setQueen(true);
					element.setIco(Game.reineEquipe2);
					Game.map[element.getX()][element.getY()] = Game.reineEquipe2 ;
					
					if ( lady2 == false ) {
						
						lady2 = true ;
						System.out.print( ManageInOut.text5 + Game.joueur2 + ManageInOut.text8 + Game.reineEquipe2 + ManageInOut.text9 );
						
					}
					
				}
				
			}
		}
	}
	
	public static void checkEnd( int equipe ) {
		
		int save = 0 ;
		
		for ( Pions element : Game.listPions ) {
			
			if ( element.getTeam() == equipe ) {
				
				save++ ;
			}
		}
		
		if ( save == 0 ) {
			
			endGame = true ;
			
			if ( equipe == 1 ) {
				
				winner = Game.joueur2 ;
				loser = Game.joueur1 ;
				
			} else {
				
				winner = Game.joueur1 ;
				loser = Game.joueur2 ;
			}
			
		}
	}

}
