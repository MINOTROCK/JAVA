package utilitaire;

import java.util.Scanner;

public class ManageInOut {
	
	public static String error1 = "Mauvaise saisie !!" ;
	public static String error2 = "Aucune saisie !!" ;
	
	public static String text1 = "Bienvenue dans le jeu de dame !!!\n\nQuel mode de jeu voulez vous choisir ?\n\n1) Robot\n2) 1 V 1\n";
	public static String text2 = "\n:";
	public static String text3 = "\nVeuillez choisir le nom du joueur 1\n\n:";
	public static String text4 = "\nVeuillez choisir le nom du joueur 2\n\n:";
	public static String text5 = "";
	public static String text6 = "";
	public static String text7 = "";
	public static String text8 = "";
	public static String text9 = "";
	public static String text10 = "";
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
}
