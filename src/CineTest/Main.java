package CineTest;

public class Main {

	public static void main(String args[]) {
		CineLogic cine= new CineLogic(1000);
		cine.sellTicket(100);
		cine.buyFilm(600);
		cine.buyFilm(600);	
	}
	
}
