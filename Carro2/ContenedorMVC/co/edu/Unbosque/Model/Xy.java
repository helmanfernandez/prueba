package co.edu.Unbosque.Model;

public class Xy {
	
	int xInicial, yInicial;
	
	
	public Xy(int xInicial, int yInicial) {
		this.xInicial = xInicial;
		this.yInicial = yInicial;
	}

	
	public void moverArriba(int distancia) {
		setxInicial(getxInicial()-distancia);
	}
	
	public void moverAbajo(int distancia) {
		setxInicial(getxInicial()+distancia);
	}
	
	public void moverDerecha(int distancia) {
		setyInicial(getyInicial()+distancia);
	}
	
	public void moverIzquierda(int distancia) {
		setyInicial(getyInicial()-distancia);
	}

	public int getxInicial() {
		return xInicial;
	}


	public void setxInicial(int xInicial) {
		this.xInicial = xInicial;
	}


	public int getyInicial() {
		return yInicial;
	}


	public void setyInicial(int yInicial) {
		this.yInicial = yInicial;
	}

}
