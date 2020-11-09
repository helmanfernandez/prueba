package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelTablero extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton[][] mCas = null;

	private int numFilas;
	private int numColumnas;


	public PanelTablero(int numFilas, int numColumnas) {

		setLayout(null);
		setSize(600, 600);
		setBackground(new Color(169, 167, 167));

		this.numFilas = numFilas;
		this.numColumnas = numColumnas;

		inicializar();
		ordenar();

	}

	public void ordenar() {

		int anchoCasilla = 565 / numColumnas;
		int altoCasillas = 565 / numFilas;

		for (int fila = 0; fila < mCas.length; fila++) {
			for (int columna = 0; columna < mCas.length; columna++) {

				JButton temp = mCas[fila][columna];
				temp.setForeground(Color.WHITE);

				temp.setBounds(columna * anchoCasilla, fila * altoCasillas, anchoCasilla, altoCasillas);
			}
		}
	}

	public void inicializar() {

		mCas = new JButton[numFilas][numColumnas];

		for (int fila = 0; fila < mCas.length; fila++) {
			for (int columna = 0; columna < mCas.length; columna++) {

				JButton temp = new JButton();
				temp.setBorderPainted(false);
				temp.setText("(" + fila + "," + columna + ")");

				if ((fila + columna + 1) % 2 == 0) {

					temp.setBackground(Color.GRAY);

				} else {

					temp.setBackground(Color.BLUE.darker());

				}

				add(temp);

				mCas[fila][columna] = temp;
			}

		}

	}

	public void agregar(int x, int y) {

		mCas[x][y].setIcon(liebre("/util/Liebre.png", mCas[x][y]));

	}
	
	public void agregarObjetivo(int x, int y) {

		mCas[x][y].setIcon(objetivo("/util/Zanahoria.png", mCas[x][y]));

	}

	
	public Icon liebre(String url, JButton liebre) {

		ImageIcon icon = new ImageIcon(getClass().getResource(url));

		int anchoTotal = this.getWidth();
		int altoTotal = this.getHeight();
		int anchoCasilla = anchoTotal / numColumnas;
		int altoCasillas = altoTotal / numFilas;

		ImageIcon icono = new ImageIcon(
				icon.getImage().getScaledInstance(anchoCasilla, altoCasillas, Image.SCALE_DEFAULT));

		return icono;
	}
	
	public Icon objetivo(String url, JButton objetivo) {

		ImageIcon icon = new ImageIcon(getClass().getResource(url));

		int anchoTotal = this.getWidth();
		int altoTotal = this.getHeight();
		int anchoCasilla = anchoTotal / numColumnas;
		int altoCasillas = altoTotal / numFilas;

		ImageIcon icono = new ImageIcon(
				icon.getImage().getScaledInstance(anchoCasilla, altoCasillas, Image.SCALE_DEFAULT));

		return icono;
	}

	public JButton[][] getmCasillas() {
		return mCas;
	}

	public void setmCasillas(JButton[][] mCasillas) {
		this.mCas = mCasillas;
	}

}
