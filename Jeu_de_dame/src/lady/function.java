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
		
		int turnOf = 1 ;
		String choicePawnToMove ;
		String choiceMove ;
		boolean checkChoicePawnToMove ;
		boolean checkChar ;
		boolean checkChoiceMove ;
		int pawn ;
		int savePawn = 0 ;
		int saveMoveX = 0 ; 
		int saveMoveY = 0 ;
		int saveEatX = -1 ;
		int saveEatY = -1 ;
		
		
		do {
			do {
				checkChoicePawnToMove = false ;
				
					printMapId( Game.equipe1 , Game.reineEquipe1  ) ; //, Game.listPions
				
					do {
						
						checkChar = false ;
						
						System.out.print(ManageInOut.text5 + Game.joueur1 + ManageInOut.text10);
						choicePawnToMove  = ManageInOut.userString() ;
						
						if ( choicePawnToMove == "null" ) {
							
							System.out.print(ManageInOut.error2);
							
						} else {
							
							
							for ( IdPions elementSave : Game.idListPions ) {

								if ( elementSave.getCharId().equalsIgnoreCase(choicePawnToMove) ) {
									
									pawn =  0 ;
									
									for ( Pions element : Game.listPions ) {
										
										
										if ( element.getX() == elementSave.getX() && element.getY() == elementSave.getY() ) {
											
											savePawn = pawn ;
											checkChar = true ;
											
											
										}
										
										pawn++ ;
									}
									
								} 
								
							}
							
							
							if (checkChar  == true ) {
								
								Check.checkMove( Game.listPions.get(savePawn));
								
								if ( Check.checkList.size() == 0 ) {
									
									System.out.print(ManageInOut.error3);
									
									
								} else {
									
									checkChoicePawnToMove = true ;
								}
								
								
							}
							
							if ( checkChar == false ) {
								
								System.out.print(ManageInOut.error1);
								
							}
						}
						
					} while ( checkChoicePawnToMove == false ) ;
					
					
					printMove( Check.checkList ) ;
					
					do {
						checkChoiceMove = false ;
						checkChar = false ;
						System.out.print(ManageInOut.text11);
						choiceMove = ManageInOut.userString() ;
						
						if ( choiceMove == "null" ) {
							
							System.out.print(ManageInOut.error2);
							
						} else {
						
								for ( CheckType element :  Check.checkList ) {
									
									
									
									if (element.getIcoMove().equalsIgnoreCase(choiceMove) ) {
										
										checkChoiceMove = true ;
										checkChar = true ;
										saveMoveX = element.getNewX() ;
										saveMoveY = element.getNewY() ;
										saveEatX = element.getEatX() ;
										saveEatY = element.getEatY() ;
										
									} 
								}
							}
						
							if ( checkChar == false ) {
								
								System.out.print(ManageInOut.error1);
								
							}
						
						 
					} while ( checkChoiceMove == false ) ;
					movePawn(  Game.listPions.get(savePawn) , saveMoveY, saveMoveX  ) ;
					removePawn ( saveEatX , saveEatY ) ;
					
				do {
					
					Check.eatTwoOnce = false ;
					Check.checkEnd( 2 ) ;
					Check.checkLady() ;
					
					if ( saveEatX != -1  ) {
						
						Check.checkMove( Game.listPions.get(savePawn));
						printMove( Check.checkList ) ;
						System.out.print(ManageInOut.text10);
						choiceMove = ManageInOut.userString() ;
					
						for ( CheckType element :  Check.checkList ) {
								
							if (element.getIcoMove().equalsIgnoreCase(choiceMove) ) {
								
								checkChoiceMove = true ;
								checkChar = true ;
								saveMoveX = element.getNewX();
								saveMoveY = element.getNewY();
								saveEatX = element.getEatX();
								saveEatY = element.getEatY();
								savePawn-- ;
								
							} else if ( checkChar == false ) {
								
								System.out.print(ManageInOut.error1);
								
							}
						} 
					}
					movePawn(  Game.listPions.get(savePawn) , saveMoveY, saveMoveX  ) ;
					removePawn ( saveEatX , saveEatY ) ;
					System.out.print(saveEatX +" " + saveEatY);
					
				} while ( Check.eatTwoOnce == true ) ;
				
				
				turnOf = 2 ;
				
			} while ( turnOf == 1 ) ;
			
			if ( Check.endGame == true ) {
				
				break ;
			}
			
			do {
				checkChoicePawnToMove = false ;
					
					printMapId( Game.equipe2 , Game.reineEquipe2  ) ; //, Game.listPions
				
					do {
						
						checkChar = false ;
					
						System.out.print(ManageInOut.text5 + Game.joueur2 + ManageInOut.text10);
						choicePawnToMove  = ManageInOut.userString() ;
						
						if ( choicePawnToMove == "null" ) {
							
							System.out.print(ManageInOut.error2);
							
						} else {
							
							
							for ( IdPions elementSave : Game.idListPions ) {

								if ( elementSave.getCharId().equalsIgnoreCase(choicePawnToMove) ) {
									
									pawn =  0 ;
									
									for ( Pions element : Game.listPions ) {
										
										
										if ( element.getX() == elementSave.getX() && element.getY() == elementSave.getY() ) {
											
											savePawn = pawn ;
											checkChar = true ;
											
											
										}
										
										pawn++ ;
									}
									
								} 
								
							}
							
							
							if (checkChar  == true ) {
								
								Check.checkMove( Game.listPions.get(savePawn));
								
								if ( Check.checkList.size() == 0 ) {
									
									System.out.print(ManageInOut.error3);
									
									
								} else {
									
									checkChoicePawnToMove = true ;
								}
								
								
							}
							
							if ( checkChar == false ) {
								
								System.out.print(ManageInOut.error1);
								
							}
						}
						
					} while ( checkChoicePawnToMove == false ) ;
					
					
					printMove( Check.checkList ) ;
					
					do {
						checkChoiceMove = false ;
						checkChar = false ;
						System.out.print(ManageInOut.text11);
						choiceMove = ManageInOut.userString() ;
						
						if ( choiceMove == "null" ) {
							
							System.out.print(ManageInOut.error2);
							
						} else {
						
								for ( CheckType element :  Check.checkList ) {
									
									
									
									if (element.getIcoMove().equalsIgnoreCase(choiceMove) ) {
										
										checkChoiceMove = true ;
										checkChar = true ;
										saveMoveX = element.getNewX() ;
										saveMoveY = element.getNewY() ;
										saveEatX = element.getEatX() ;
										saveEatY = element.getEatY() ;
										
									} 
								}
							}
						
							if ( checkChar == false ) {
								
								System.out.print(ManageInOut.error1);
								
							}
						
						 
					} while ( checkChoiceMove == false ) ;
					
					movePawn(  Game.listPions.get(savePawn) , saveMoveY, saveMoveX  ) ;
					removePawn ( saveEatX , saveEatY ) ;
				do {
					
					Check.eatTwoOnce = false ;
					Check.checkEnd( 1 ) ;
					Check.checkLady() ;
					
					if ( saveEatX != -1  ) {
						
						Check.checkMove( Game.listPions.get(savePawn));
						printMove( Check.checkList ) ;
						System.out.print(ManageInOut.text11);
						choiceMove = ManageInOut.userString() ;
					
						for ( CheckType element :  Check.checkList ) {
								
							if (element.getIcoMove().equalsIgnoreCase(choiceMove) ) {
								
								checkChoiceMove = true ;
								checkChar = true ;
								saveMoveX = element.getNewX();
								saveMoveY = element.getNewY();
								saveEatX = element.getEatX();
								saveEatY = element.getEatY();
								savePawn-- ;
								
								
							} else if ( checkChar == false ) {
								
								System.out.print(ManageInOut.error1);
								
							}
						} 
					}
					movePawn(  Game.listPions.get(savePawn) , saveMoveY, saveMoveX  ) ;
					removePawn ( saveEatX , saveEatY ) ;
					
				} while ( Check.eatTwoOnce == true ) ;
				
				
				turnOf = 1 ;
				
			} while ( turnOf == 2 ) ;
			
				
			
		}while ( Check.endGame == false ) ;
		
	} 
	
	public static void endScreen() {
		
		ManageInOut.Victory( Check.winner , Check.loser ) ;
		System.out.print( ManageInOut.text5 + Check.winner + ManageInOut.text6 + Check.countMove + ManageInOut.text7 );
		
	}
	
	public static void printMapId( char icoPion, char icoQueen ) { //  , ArrayList<Pions> pawn 
		
		Game.idListPions.clear();
		
		for(int j=0 ; j<Game.lengthMapY  ; j++) {
			System.out.println() ;
			
			for(int i=0; i<Game.lengthMapX ; i++) {
				
				if (Game.map[i][j] == icoPion || Game.map[i][j] == icoQueen) {
					
					for (Pions element : Game.listPions ) {
						
						if ( element.getX() == i && element.getY() == j ) {
							
							if ( element.getNumber() < 35 ) {
								
								System.out.print( " " + Game.numList[element.getNumber()] );
								Game.idListPions.add( new IdPions ( Game.numList[element.getNumber()] , i , j )) ;
								
							} else {
								
								System.out.print( " " + ( element.getNumber() - 25 ));
								Game.idListPions.add( new IdPions ( Integer.toString(element.getNumber() - 25 ) , i , j )) ;
								
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
		pawn.setY(newX);
		pawn.setX(newY);
		Game.map[pawn.getX()][pawn.getY()] = pawn.getIco();
	}
	
	public static void startGame() {
		
		String saveTmp ;
		
		System.out.print(ManageInOut.text1);
		

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
		
		printMap() ;

		
		
	}
	
	public static void createFileLog() {

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
	
	public static void removePawn( int removeX , int removeY ) {
		
		int save = -1 ;
		if ( removeX == -1 || removeY == -1 ) {
			
			Check.eatTwoOnce = false ;
			
		} else {
			
			for ( Pions element : Game.listPions ) {
				
				if ( element.getX() == removeX && element.getY() == removeY ) {
					
					save = Game.listPions.indexOf(element) ;

					
				}
				
			}
			if ( save != -1 ) {
				
				Game.map[Game.listPions.get(save).getX()][Game.listPions.get(save).getY()] = Game.noir ;
				Game.listPions.remove(Game.listPions.get(save)) ;
				Check.eatTwoOnce = true ;
			}
		}
		
		
	}

}
	




