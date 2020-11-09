package co.edu.Unbosque.Model;

public class Pl {
	
	private String mdelo;
	
	private int calr;
	
	public Pl(String modelo, int calr) {
		setNombre(modelo);
		setCalorias(calr);
	}

	public String getNombre() {
		return mdelo;
	}

	public void setNombre(String cars) {
		this.mdelo = cars;
	}

	public int getCalrs() {
		return calr;
	}

	public void setCalorias(int carl) {
		this.calr = carl;
	}

}
