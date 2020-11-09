package co.edu.Unbosque.Model;

import java.util.List;
import java.util.ArrayList;

public class Programacion {
	
/**
Diseñar una aplicación que siga el patrón MVC sencilla (MODELO + CONTROLADOR + TEST). Las características que debe tener su solución son:

Los vehículos tienen Marca, Modelo o Anio, Placa (única), # Puertas, Capacidad y Tipo. Su solución debe lograr comparar y vender automóviles que se encuentren en una lista de administración:

Agregar
Buscar
Eliminar
Comparar por Modelo/Anio
Comparar por Marca
Comparar por Placa
Comparar por Capacidad
Comparar por # Puertas
Comparar por Tipo
Deben persistir la información en un archivo binario mediante procesos de serialización.

Su proyecto solución debe Verificar Invariantes y debe tener creado un "Source Folder": test/src, en donde se representen las clases Test (extendiendo TestCase).
 */
	public static int I = Integer.MAX_VALUE; //Infinito
	
	private ArrayList<Pl> car;
	
	private int min;
	
	private ArrayList<Pl> menu;
	
	public Programacion() {
		
		car = new ArrayList<Pl>();
		menu = new ArrayList<Pl>();
		
	}
	
	public void agregarCars(String nombre, int calorias) {
		
		Pl platoNuevo = new Pl(nombre, calorias);
		
		car.add(platoNuevo);
		
	}
	
	public void agregarMenu(Pl elegido) {
		
		menu.add(elegido);
	}
	
	public static int min(int a, int b) {
		return (b < a) ? b: a;
	}
	
	public String calcular(){
		
		int maxElem = car.size()+1;
		int maxCant = min+1;
		
		int[][] tabla = new int[maxElem][maxCant];
		
	     for(int i = 0; i < maxElem; i++) {
	         tabla[i][0] = 0;
	     }
	     
	     for(int i = 1; i < maxCant; i++) {
	         tabla[0] [i] = I;
	     }
	     
	     int a, b;
	     
	     for (int i = 1; i < maxElem; i++) {
			for (int j = 1; j < maxCant; j++) {
				a=tabla[i-1][j];
				if (car.get(i-1).getCalrs()<=j) {
					b = tabla[i-1][j-car.get(i-1).getCalrs()];
					if (b<I) b+=car.get(i-1).getCalrs();
				} else {
					b=car.get(i-1).getCalrs();
				}
				if(b>=j) {
					tabla[i][j] = min(a, b);
				} else {
					tabla[i][j] = I;
				}
			}
		}
	    
	    List<Integer> rr = new ArrayList<Integer>();
	    int i = car.size();
	    int j = min;
	    
	    while (i>0 && j>0) {
			if (tabla[i][j]==tabla[i-1][j]) {
				i--;
			} else {
				rr.add(i-1);
				j -= car.get(i-1).getCalrs();
				i--;
			}
		}
	    
	    Object[] r = rr.toArray();	     
		
	    String out=" : "+min+" calr.\n";
	     
	    int suma=0;
	   
	    for (int k = 0; k < r.length; k++) {
	    	 int valor = (Integer)r[k];
	    	 menu.add(car.get(valor));
	    	 out+=menu.get(k).getNombre()+" "+menu.get(k).getCalrs()+"\n";
	    	 suma+=car.get(valor).getCalrs();
		}
	     
	     out+="Total : "+suma+ " car";
		return out;
	}

	public ArrayList<Pl> getCar() {
		return car;
	}

	public void setCarta(ArrayList<Pl> carta) {
		this.car = carta;
	}

	public int getMinCalorias() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public ArrayList<Pl> getMenuOptimo() {
		return menu;
	}

	public void setMenuOptimo(ArrayList<Pl> menu) {
		this.menu = menu;
	}
	
	
	

}
