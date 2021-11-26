package objet;

public class CheckType {

	String icoMove ;
	Pions checkPawn ;
	int newX ;
	int newY ;
	int eatX ;
	int eatY ;
	
	
	
	public CheckType(String icoMove, Pions checkPawn, int newX, int newY, int eatX, int eatY) {
		super();
		this.icoMove = icoMove;
		this.checkPawn = checkPawn;
		this.newX = newX;
		this.newY = newY;
		this.eatX = eatX;
		this.eatY = eatY;
	}
	public String getIcoMove() {
		return icoMove;
	}
	public void setIcoMove(String icoMove) {
		this.icoMove = icoMove;
	}
	public Pions getCheckPawn() {
		return checkPawn;
	}
	public void setCheckPawn(Pions checkPawn) {
		this.checkPawn = checkPawn;
	}
	public int getNewX() {
		return newX;
	}
	public void setNewX(int newX) {
		this.newX = newX;
	}
	public int getNewY() {
		return newY;
	}
	public void setNewY(int newY) {
		this.newY = newY;
	}
	public int getEatX() {
		return eatX;
	}
	public void setEatX(int eatX) {
		this.eatX = eatX;
	}
	public int getEatY() {
		return eatY;
	}
	public void setEatY(int eatY) {
		this.eatY = eatY;
	}
	
}
