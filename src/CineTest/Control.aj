package CineTest;

public aspect Control {
	
	after (int money):
		call (void CineLogic.sellTicket(int)) && args(money) {
			System.out.println("Se vendieron entradas a $"+money);
		}
	
	pointcut buyFilm(int cost):
		call(* CineLogic.buyFilm(int)) && args(cost);
	
	before(int cost) : buyFilm(cost){
		System.out.println("Se solicito una compra de $"+cost);
	}
	
	after(int cost) returning(boolean state): buyFilm(cost){
		if(state)
			System.out.println("Se pudo realizar la compra");
		else
			System.out.println("No se pudo realizar la compra");
	}
	
	
}
