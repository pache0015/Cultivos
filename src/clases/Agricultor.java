package clases;

import java.util.ArrayList;
import java.util.List;

public class Agricultor {

	private List<Cultivable> cultivos;
	
	public Agricultor() {
		cultivos = new ArrayList<Cultivable>();
	}
	
	public Float calcularGanancia() {
		return (float) cultivos.stream().mapToInt(cultivable -> cultivable.getGanancia()).sum();
	}
}
