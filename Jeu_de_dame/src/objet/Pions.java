package objet;

public class Pions {
	
		char ico ;
		int team ;
		int x ;
		int y ;
		int number;
		boolean queen;
		
		public Pions(char ico, int team, int x, int y, int number) {
			super();
			this.ico = ico;
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
			return "Pions [ico=" + ico + ", team=" + team + ", x=" + x + ", y=" + y + ", number=" + number + ", queen="
					+ queen + "]";
		}
		
}
