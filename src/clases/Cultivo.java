package clases;

import java.util.ArrayList;
import java.util.List;

public class Cultivo implements Cultivable {

	private List<Cultivable> cultivos = new ArrayList<Cultivable>();
	
	public Cultivo() {
		
	}
	
	@Override
	public Integer getGanancia() {
		Integer suma = new Integer(0);
		for(Cultivable cultivo:cultivos) {
			suma += cultivo.getGanancia();
		}
		return suma;
	}
	
	

}
