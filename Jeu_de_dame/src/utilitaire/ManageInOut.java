package utilitaire;

import java.util.Scanner;

public class ManageInOut {
	
	public static String error1 = "\nMauvaise saisie !!" ;
	public static String error2 = "\nAucune saisie !!" ;
	public static String error3 = "\nAucun mouvement possible !!" ;
	
	public static String log1 = "" ;
	public static String log2 = "" ;
	public static String log3 = "" ;
	public static String log4 = "" ;
	public static String log5 = "" ;
	public static String log6 = "" ;
	public static String log7 = "" ;
	public static String log8 = "" ;
	public static String log9 = "" ;
	
	public static String text1 = "Bienvenue dans le jeu de dame !!!\n\nQuel mode de jeu voulez vous choisir ?\n\n1) Robot\n2) 1 V 1\n";
	public static String text2 = "\n:";
	public static String text3 = "\nVeuillez choisir le nom du joueur 1 .\n\n:";
	public static String text4 = "\nVeuillez choisir le nom du joueur 2 .\n\n:";
	public static String text5 = "\n\n ";
	public static String text6 = " à gagné la partie en ";
	public static String text7 = " coups, les scores de victoires et de defaites ont été mis à jour .";
	public static String text8 = " à obtenu une reine, représentée sous cette forme ";
	public static String text9 = ", les reines peuvent se déplacer sur toutes leures diagonales \navec pour seule limite les bords du plateau";
	public static String text10 = "\n\nEntrée utilisateur\n\n:";
	public static String text11 = "";
	public static String text12 = "";
	public static String text13 = "";
	public static String text14 = "";
	public static String text15 = "";
	public static String text16 = "";
	public static String text17 = "";
	public static String text18 = "";
	public static String text19 = "";
	public static String text20 = "";
	public static String text21 = "";
	public static String text22 = "";
	public static String text23 = "";
	public static String text24 = "";
	public static String text25 = "";
	public static String text26 = "";
	public static String text27 = "";
	public static String text28 = "";
	public static String text29 = "";
	public static String text30 = "";
	

	public static String userString() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if ( s != "") {
			
			return s;
			
		}else {
			
			return "null";
		}
		
	}
	
	public static void log( String logsString ) {

	}
	
	public static void Victory( String joueurGagnant , String joueurPerdant ) {
		//
	}
}
