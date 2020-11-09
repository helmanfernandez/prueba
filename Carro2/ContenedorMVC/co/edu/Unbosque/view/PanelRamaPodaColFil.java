package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelRamaPodaColFil extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String INGRESAR_CONDICIONES = "Generar";
	
	private JButton bIngresarCondiciones;
	
	private JLabel lbIngresarFilas, lbIngresarColumnas, lbIngresarDistInicial, lbIngresarDistSecun, lbIngrPrimerMov, lbPos, lbPosObj;
	
	private JTextField txIngrFilas, txIngrCol, txIngDisIni, txIngDisSec, txIngPrimMov, txXCon, txYCon, txXObj, txYObj;

	private Color grisEspecial, ocre, esmeralda;

	public PanelRamaPodaColFil() {
		
		setLayout(null);
		grisEspecial = new Color(169, 167, 167);
		ocre = new Color(200, 197, 1);
		esmeralda = new Color(69, 214, 187);
		setBackground(grisEspecial.darker());
		
		lbIngresarFilas = new JLabel("INGRESA EL MODELO");
		lbIngresarFilas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbIngresarFilas.setForeground(Color.WHITE);
		lbIngresarFilas.setBounds(0, 0, 800, 20);
		add(lbIngresarFilas);	
		
		lbIngresarColumnas = new JLabel("INGRESA PUERTAS");
		lbIngresarColumnas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbIngresarColumnas.setForeground(Color.WHITE);
		lbIngresarColumnas.setBounds(0, 60, 800, 20);
		add(lbIngresarColumnas);
		
		lbIngresarDistInicial = new JLabel("INGRESAR CAPACIDAD");
		lbIngresarDistInicial.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbIngresarDistInicial.setForeground(Color.WHITE);
		lbIngresarDistInicial.setBounds(0, 120, 800, 20);
		add(lbIngresarDistInicial);
		
		lbIngresarDistSecun = new JLabel("INGRESE MARCA ");
		lbIngresarDistSecun.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbIngresarDistSecun.setForeground(Color.WHITE);
		lbIngresarDistSecun.setBounds(0, 180, 800, 20);
		add(lbIngresarDistSecun);
		
		 
		
		 
		 
 
		
		txIngrFilas = new JTextField("");
		txIngrFilas.setFont(new Font("Tahoma", Font.BOLD, 18));
		txIngrFilas.setForeground(Color.BLACK);
		txIngrFilas.setBounds(20, 30, 50, 20);
		add(txIngrFilas);
		
		txIngrCol = new JTextField("");
		txIngrCol.setFont(new Font("Tahoma", Font.BOLD, 18));
		txIngrCol.setForeground(Color.BLACK);
		txIngrCol.setBounds(20, 90, 50, 20);
		add(txIngrCol);
		
		txIngDisIni = new JTextField("");
		txIngDisIni.setFont(new Font("Tahoma", Font.BOLD, 18));
		txIngDisIni.setForeground(Color.BLACK);
		txIngDisIni.setBounds(20, 150, 50, 20);
		add(txIngDisIni);
		
		txIngDisSec = new JTextField("");
		txIngDisSec.setFont(new Font("Tahoma", Font.BOLD, 18));
		txIngDisSec.setForeground(Color.BLACK);
		txIngDisSec.setBounds(20, 210, 50, 20);
		add(txIngDisSec);
		
	 
	 
		
		 
		
	 
		

		bIngresarCondiciones = new JButton("COMPRAR ");
		bIngresarCondiciones.setFont(new Font("Tahoma", Font.BOLD, 24));
		bIngresarCondiciones.setBackground(grisEspecial);
		bIngresarCondiciones.setForeground(Color.WHITE);
		bIngresarCondiciones.setBounds(20, 450, 400, 60);
		add(bIngresarCondiciones);	
		
		bIngresarCondiciones.setActionCommand(INGRESAR_CONDICIONES);
		
	}

	public JButton getbIngresarCondiciones() {
		return bIngresarCondiciones;
	}

	public JLabel getLbIngresarFilas() {
		return lbIngresarFilas;
	}

	public JLabel getLbIngresarColumnas() {
		return lbIngresarColumnas;
	}

	public JLabel getLbIngresarDistInicial() {
		return lbIngresarDistInicial;
	}

	public JLabel getLbIngresarDistSecun() {
		return lbIngresarDistSecun;
	}

	public JLabel getLbIngrPrimerMov() {
		return lbIngrPrimerMov;
	}

	public JLabel getLbPosConejo() {
		return lbPos;
	}

	public JLabel getLbPosObj() {
		return lbPosObj;
	}

	public JTextField getTxIngrFilas() {
		return txIngrFilas;
	}

	public JTextField getTxIngrCol() {
		return txIngrCol;
	}

	public JTextField getTxIngDisIni() {
		return txIngDisIni;
	}

	public JTextField getTxIngDisSec() {
		return txIngDisSec;
	}

	public JTextField getTxIngPrimMov() {
		return txIngPrimMov;
	}

	public JTextField getTxXCon() {
		return txXCon;
	}

	public JTextField getTxYCon() {
		return txYCon;
	}

	public JTextField getTxXObj() {
		return txXObj;
	}

	public JTextField getTxYObj() {
		return txYObj;
	}

	public Color getGrisEspecial() {
		return grisEspecial;
	}

	public Color getOcre() {
		return ocre;
	}

	public Color getEsmeralda() {
		return esmeralda;
	}

	



}
