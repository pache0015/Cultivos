package clases;

public class Trigo implements Cultivable {

	private Integer valor;
	
	public Trigo() {
		valor = new Integer(300);
	}
	@Override
	public Integer getGanancia() {
		return valor;
	}

	public void cambiarValor(Integer valor) {
		this.valor = valor;
	}
}
