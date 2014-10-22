package resource;

public class Basket implements Resource {

	private static int cpt = 0 ;
	private int num ; 
	
	public Basket() {this.num = cpt++ ;}
	@Override
	public String description() {
		return "Panier-" + num;
	}
	

}
