package co.edu.Unbosque.Model;

public class Vehiculo {
	
	private String Marca;
	private int anio;
	private String placa;
	private int nPuertas;
	private double capacidad;
	private String tipo;
	
	public Vehiculo(String pMarca, int pAnio, 
					String pPlaca, int pNPuertas,
					double pCapaciadad, String pTipo) {
		
		setMarca(pMarca);
		setAnio(pAnio);
		setPlaca(pPlaca);
		setnPuertas(pNPuertas);
		setCapacidad(pCapaciadad);
		setTipo(pTipo);
	
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}


	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPuerta() {
		// TODO Auto-generated method stub
		return nPuertas;
	}

}
