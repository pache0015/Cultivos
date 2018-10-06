package clases;

public class Soja implements Cultivable {

	private Integer valor;
	
	public Soja() {
		valor = new Integer(500);
	}
	@Override
	public Integer getGanancia() {
		
		return valor;
	}

}
