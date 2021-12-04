package objet;

public class Pions {
	
		char ico ;
		char queenIco ;
		char icoTarget ;
		char icoTargetQueen ;
		int team ;
		int x ;
		int y ;
		int number;
		boolean queen;
		
		public Pions(char ico, char queenIco, char icoTarget, char icoTargetQueen, int team, int x, int y, int number) {
			super();
			this.ico = ico;
			this.queenIco = queenIco;
			this.icoTarget = icoTarget;
			this.icoTargetQueen = icoTargetQueen;
			this.team = team;
			this.x = x;
			this.y = y;
			this.number = number;
			this.queen = false;
		}

		public char getIco() {
			return ico;
		}

		public void setIco(char ico) {
			this.ico = ico;
		}

		public char getQueenIco() {
			return queenIco;
		}

		public void setQueenIco(char queenIco) {
			this.queenIco = queenIco;
		}

		public char getIcoTarget() {
			return icoTarget;
		}

		public void setIcoTarget(char icoTarget) {
			this.icoTarget = icoTarget;
		}

		public char getIcoTargetQueen() {
			return icoTargetQueen;
		}

		public void setIcoTargetQueen(char icoTargetQueen) {
			this.icoTargetQueen = icoTargetQueen;
		}

		public int getTeam() {
			return team;
		}

		public void setTeam(int team) {
			this.team = team;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public boolean isQueen() {
			return queen;
		}

		public void setQueen(boolean queen) {
			this.queen = queen;
		}

		@Override
		public String toString() {
			return "Pions [ico=" + ico + ", queenIco=" + queenIco + ", icoTarget=" + icoTarget + ", icoTargetQueen="
					+ icoTargetQueen + ", team=" + team + ", x=" + x + ", y=" + y + ", number=" + number + ", queen="
					+ queen + "]";
		}
		
		
}
