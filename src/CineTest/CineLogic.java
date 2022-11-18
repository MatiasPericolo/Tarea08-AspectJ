package CineTest;

public class CineLogic {

	private int savedMoney;
	
	public CineLogic(int money) {
		savedMoney=money;
	}

	public int getSavedMoney() {
		return savedMoney;
	}

	public void sellTicket(int cost) {
		savedMoney += cost;
	}
	
	public boolean buyFilm(int cost) {
		
		if(cost<savedMoney) {
			savedMoney -= cost;
			return true;
		}else{
			return false;
		}
		
	}
	
}
