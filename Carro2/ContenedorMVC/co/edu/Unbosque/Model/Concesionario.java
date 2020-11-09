package co.edu.Unbosque.Model;

import java.util.ArrayList;

public class Concesionario {
	
	ArrayList<Vehiculo> carros;
	
	public Concesionario() {
		
		carros = new ArrayList<Vehiculo>();
		carros.add(new Vehiculo("Mazda", 2020,
					"ABC001", 4, 2000, "Camioneta"));
		carros.add(new Vehiculo("Volkswagen", 2019,
								"CDX707", 4, 1500, "Camioneta"));
		carros.add(new Vehiculo("Nissan", 2017,
				"ABC002", 3, 1000, "Automovil"));
		carros.add(new Vehiculo("Lexus", 2021,
							"CAX707", 6, 1500, "Suv"));
		carros.add(new Vehiculo("Toyota", 2020,
				"ABC003", 4, 1500, "Auto"));
		
		carros.add(new Vehiculo("Infinite", 2020,
				"ABC004", 6, 1500, "Suv"));
		carros.add(new Vehiculo("Kia", 2021,
				"ABC005", 6, 1500, "Camioneta"));
		
		
	}
	
	public ArrayList<Vehiculo> compAnio(int fAnio) {
		ArrayList<Vehiculo> carrosFAnio = new ArrayList<Vehiculo>();
		for (int i = 0; i < carros.size(); i++) {
			if (carros.get(i).getAnio()==fAnio) {
				carrosFAnio.add(carros.get(i));
			}
		}
		return carrosFAnio;		
	}
	
	public ArrayList<Vehiculo> compMarca(String fMarca) {
		ArrayList<Vehiculo> carrosFMarca = new ArrayList<Vehiculo>();
		for (int i = 0; i < carros.size(); i++) {
			if (carros.get(i).getMarca().equalsIgnoreCase(fMarca)) {
				carrosFMarca.add(carros.get(i));
			}
		}
		return carrosFMarca;		
	}
	

public ArrayList<Vehiculo> compPuerta(int fPuerta) {
	ArrayList<Vehiculo> carrosFPuerta = new ArrayList<Vehiculo>();
	for (int i = 0; i < carros.size(); i++) {
		if (carros.get(i).getPuerta()==fPuerta) {
			carrosFPuerta.add(carros.get(i));
		}
	}
	return carrosFPuerta;		
}

	public ArrayList<Vehiculo> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Vehiculo> carros) {
		this.carros = carros;
	}
		
	
	
	

}
