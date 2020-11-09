package co.edu.Unbosque.Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Campo {
	
	private int filas; 
	private int columnas;
	private int dPrincipal;
	private int distanciaS;
	private int direccionPrimerMov; 
	private int xFin, yFin;
	private int lo;
	private Xy lie;
	
	
	
	ArrayList<Integer> xanteriores = new ArrayList<Integer>();
	ArrayList<Integer> yanteriores = new ArrayList<Integer>();
	
	int contador = 0;
	
	private boolean pID=false, pAA=false;

	
	private boolean mP = true, mS = false, uno = true, dos = true, tres = true, cuatro = true,cinco=true, seis = true, siete = true, ocho = true;
	
	private boolean posDer=true, posIzq=true, posAba=true, posArriba=true;
	
	private int[][] tablero;
	
	public Campo(int f, int c, int dP, int dS, int dM, int xC, int yC, int xF, int yF) {
		setFilas(f);
		setColumnas(c);
		setDistanciaPrincipal(dP);
		setDistanciaSecun(dS);
		setDireccionPrimerMov(dM);
		setxFin(xF);
		setyFin(yF);
		lie = new Xy(xC, yC);		
		tablero = new int[f][c];
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = 0; 
			}
		}
		
		tablero[xC][yC] = 2;  
		tablero[xF][yF] = 3;  
		
		posiblesMov();
	}
	
	public void posiblesMov() {
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[lie.getxInicial()][lie.getyInicial()] == tablero[0][i]) {
				posArriba = false;
			}
			if (tablero[lie.getxInicial()][lie.getyInicial()] == tablero[tablero.length-1][i]) {
				posAba = false;
			}
		}
		
		for (int i = 0; i < tablero[0].length; i++) {
			if (tablero[lie.getxInicial()][lie.getyInicial()] == tablero[i][0]) {
				posIzq = false;
			}
			if (tablero[lie.getxInicial()][lie.getyInicial()] == tablero[i][tablero.length-1]) {
				posDer = false;
			}
		}
	}
	//________________________________
	public boolean posMovArribaPM() {
		lie.moverArriba(dPrincipal);
		int xF = lie.getxInicial();
		for (int i = 0; i < xanteriores.size(); i++) {
			if (xF==xanteriores.get(i)) {
				ocho = false;
			}
		}
		if (xF < 0||ocho==false) {
			System.out.println("no");
			lie.moverAbajo(dPrincipal);
			return false;
		} else {
			lie.moverAbajo(dPrincipal);
			ocho=true;
			return true;
		}
	}
	
	public boolean posMovAbajoPM() {
		lie.moverAbajo(dPrincipal);
		int xF = lie.getxInicial();
		for (int i = 0; i < xanteriores.size(); i++) {
			if (xF==xanteriores.get(i)) {
				siete = false;
			}
		}
		if (xF >= tablero[0].length||siete==false) {
			System.out.println("no");
			lie.moverArriba(dPrincipal);
			return false;
		} else {
			lie.moverArriba(dPrincipal);
			siete=true;
			return true;
		}
	}
	
	public boolean posMovDerPM() {
		lie.moverDerecha(dPrincipal);
		int yF = lie.getyInicial();
		for (int i = 0; i < yanteriores.size(); i++) {
			if (yF==yanteriores.get(i)) {
				seis = false;
			}
		}
		if (yF>= tablero.length||seis==false) {
			System.out.println("no");
			lie.moverIzquierda(dPrincipal);
			return false;
		} else {
			lie.moverIzquierda(dPrincipal);
			seis=true;
			return true;
		}
	}
	
	public boolean posMovIzqPM() {
		lie.moverIzquierda(dPrincipal);
		int yF = lie.getyInicial();
		for (int i = 0; i < yanteriores.size(); i++) {
			if (yF==yanteriores.get(i)) {
				cinco = false;
			}
		}
		if (yF<0|| cinco==false) {
			System.out.println("no ");
			lie.moverDerecha(dPrincipal);
			return false;
		} else {
			lie.moverDerecha(dPrincipal);
			cinco=true;
			return true;
		}
	}
	//_____________________________________
	public boolean posMovArribaPS() {
		lie.moverArriba(distanciaS);
		int xF = lie.getxInicial();
		for (int i = 0; i < xanteriores.size(); i++) {
			if (xF==xanteriores.get(i)) {
				cuatro = false;
			}
		}
		if (xF < 0|| cuatro==false) {
			System.out.println("no ");
			lie.moverAbajo(distanciaS);
			return false;
		} else {
			lie.moverAbajo(distanciaS);
			cuatro=true;
			return true;
		}
	}
	
	public boolean posMovAbajoPS() {
		lie.moverAbajo(distanciaS);
		int xF = lie.getxInicial();
		for (int i = 0; i < xanteriores.size(); i++) {
			if (xF==xanteriores.get(i)) {
				tres = false;
			}
		}
		if (xF >= tablero[0].length||tres==false) {
			System.out.println("no se puede para abajo");
			lie.moverArriba(distanciaS);
			return false;
		} else {
			lie.moverArriba(distanciaS);
			tres=true;
			return true;
		}
	}
	
	public boolean posMovDerPS() {
		lie.moverDerecha(distanciaS);
		int yF = lie.getyInicial();
		for (int i = 0; i < yanteriores.size(); i++) {
			if (yF==yanteriores.get(i)) {
				dos = false;
			}
		}
		if (yF>= tablero.length || dos==false) {
			System.out.println("no se puede para arriba");
			lie.moverIzquierda(distanciaS);
			return false;
		} else {
			lie.moverIzquierda(distanciaS);
			dos=true;
			return true;
		}
	}
	
	public boolean posMovIzqPS() {
		lie.moverIzquierda(distanciaS);
		int yF = lie.getyInicial();
		for (int i = 0; i < yanteriores.size(); i++) {
			if (yF==yanteriores.get(i)) {
				uno = false;
			}
		}
		if (yF<0 || uno==false) {
			System.out.println("no se puede para arriba");
			lie.moverDerecha(distanciaS);
			return false;
		} else {
			lie.moverDerecha(distanciaS);
			uno = true;
			return true;
		}
	}
	
	public void jugar() {
		


		if (lie.getxInicial()!=xFin && lie.getyInicial()!=yFin) {
			if (mP) {
				if (pID) {
					if (posMovIzqPM()) {
						lie.moverIzquierda(dPrincipal);
						System.out.println("Sal: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=false;
						mS=true;
						pID=false;
						pAA=true;
						contador++;
					} 
					if (posMovDerPM()) {
						lie.moverDerecha(dPrincipal);
						System.out.println("Sal: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=false;
						mS=true;
						pID=false;
						pAA=true;
						contador++;
					}
					else {
						System.out.println("Camino equivocado, número de saltos hasta ahora: "+contador);
					}
					
				}
				if (pAA) {

					if (posMovAbajoPM()) {
						lie.moverAbajo(dPrincipal);
						System.out.println("Sal: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=false;
						mS=true;
						pID=true;
						pAA=false;
						contador++;
						
					
					}
					
					if (posMovArribaPM()) {
						lie.moverArriba(dPrincipal);
						System.out.println("Sal : ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=false;
						mS=true;
						pID=true;
						pAA=false;
						contador++;
					} 
					else {
						System.out.println(" equivocado  "+contador);
					}
				}
				
			} 
			if (mS) {
				if (pID) {
					if (posMovIzqPS()) {
						lie.moverIzquierda(distanciaS);
						System.out.println("Sal: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=true;
						mS=false;
						pID=false;
						pAA=true;
						contador++;
					} 
					if (posMovDerPS()) {
						lie.moverDerecha(distanciaS);
						System.out.println("Sal: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=true;
						mS=false;
						pID=false;
						pAA=true;
						contador++;
					}
					else {
						System.out.println("número  "+contador);
					}
					
				}
				if (pAA) {
					if (posMovArribaPS()) {
						lie.moverArriba(distanciaS);
						System.out.println("Saltos: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=true;
						mS=false;
						pID=true;
						pAA=false;
						contador++;
					} 
					if (posMovAbajoPS()) {
						lie.moverAbajo(distanciaS);
						System.out.println("Saltos: ["+lie.getxInicial()+"]["+lie.getyInicial()+"]");
						mP=true;
						mS=false;
						pID=true;
						pAA=false;
						contador++;
					}
					else {
						System.out.println(" número "+contador);
					}
				}
			}	
		}
		
		
	}
	
	public void primerMov() {		
		
		if (direccionPrimerMov == 1 && posMovAbajoPM()) {
			lie.moverAbajo(dPrincipal);
			mP = false;
			mS = true;
			pID = true;
			pAA = false;
			xanteriores.add(lie.getxInicial());
			yanteriores.add(lie.getyInicial());
		} 
		else {
			if (direccionPrimerMov == 2 && posMovArribaPM()) {
				lie.moverArriba(dPrincipal);
				mP = false;
				mS = true;
				pID = true;
				pAA = false;
				xanteriores.add(lie.getxInicial());
				yanteriores.add(lie.getyInicial());
			} 
			else {
				if (direccionPrimerMov == 3 && posMovIzqPM()) {
					lie.moverIzquierda(dPrincipal);
					mP = false;
					mS = true;
					pAA = true;
					pID = false;
					xanteriores.add(lie.getxInicial());
					yanteriores.add(lie.getyInicial());
				} 
				else {
					if (direccionPrimerMov == 4 && posMovDerPM()) {
						lie.moverDerecha(dPrincipal);
						mP = false;
						mS = true;
						pAA = true;
						pID = false;
						xanteriores.add(lie.getxInicial());
						yanteriores.add(lie.getyInicial());
					}
					else {
						JOptionPane.showMessageDialog(null, "No ");
					}
				}
				
			}
			
		}
	
	}
	
	public void esperar() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	
	
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	public int getDistanciaPrincipal() {
		return dPrincipal;
	}
	public void setDistanciaPrincipal(int distanciaPrincipal) {
		this.dPrincipal = distanciaPrincipal;
	}
	public int getDistanciaSecun() {
		return distanciaS;
	}
	public void setDistanciaSecun(int distanciaSecun) {
		this.distanciaS = distanciaSecun;
	}
	public int getDireccionPrimerMov() {
		return direccionPrimerMov;
	}
	public void setDireccionPrimerMov(int direccionPrimerMov) {
		this.direccionPrimerMov = direccionPrimerMov;
	}
	public int getxFin() {
		return xFin;
	}
	public void setxFin(int xFin) {
		this.xFin = xFin;
	}
	public int getyFin() {
		return yFin;
	}
	public void setyFin(int yFin) {
		this.yFin = yFin;
	}
	public int getSaltos() {
		return lo;
	}
	public void setSaltos(int saltos) {
		this.lo = saltos;
	}

	public Xy getL() {
		return lie;
	}

	public void setLiebre(Xy liebre) {
		this.lie = liebre;
	}

	public boolean isPosDer() {
		return posDer;
	}

	public void setPosDer(boolean posDer) {
		this.posDer = posDer;
	}

	public boolean isPosIzq() {
		return posIzq;
	}

	public void setPosIzq(boolean posIzq) {
		this.posIzq = posIzq;
	}

	public boolean isPosAba() {
		return posAba;
	}

	public void setPosAba(boolean posAba) {
		this.posAba = posAba;
	}

	public boolean isPosArriba() {
		return posArriba;
	}

	public void setPosArriba(boolean posArriba) {
		this.posArriba = posArriba;
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	

}
