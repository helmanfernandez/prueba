package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelRPOpciones extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String SAL = " ";
	
	public static final String J ="jugar";
	
	private JButton bSal, bJ;
	
	private JLabel lbNum, lbrta;

	private Color grisEspecial, ocre, esmeralda;

	public PanelRPOpciones() {
		
		setLayout(null);
		grisEspecial = new Color(169, 167, 167);
		ocre = new Color(200, 197, 1);
		esmeralda = new Color(69, 214, 187);
		setBackground(grisEspecial);
		
		lbNum = new JLabel("<html><body>\n"
								+ "" 
								+ "<br>" 
								+ "es:" 
								+ "</body></html>");
		lbNum.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbNum.setForeground(Color.WHITE);
		lbNum.setBounds(50, 20, 200, 130);
		add(lbNum);	
		
		lbrta = new JLabel("num");
		lbrta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbrta.setForeground(Color.WHITE);
		lbrta.setBounds(50, 170, 200, 20);
		add(lbrta);

		

		bSal = new JButton("A saltar");
		bSal.setFont(new Font("Tahoma", Font.BOLD, 24));
		bSal.setBackground(Color.BLACK);
		bSal.setForeground(Color.WHITE);
		bSal.setBounds(20, 250, 180, 60);
		add(bSal);	
		
		bJ = new JButton("");
		bJ.setFont(new Font("Tahoma", Font.BOLD, 24));
		bJ.setBackground(Color.BLACK);
		bJ.setForeground(Color.WHITE);
		bJ.setBounds(20, 350, 180, 60);
		add(bJ);
		
		bSal.setActionCommand(SAL);
		bJ.setActionCommand(J);
		
	}

	public static String getSaltar() {
		return SAL;
	}

	public JButton getbSaltar() {
		return bSal;
	}

	public JLabel getLbNumSaltos() {
		return lbNum;
	}

	public JLabel getLbrta() {
		return lbrta;
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

	public JButton getbJugar() {
		return bJ;
	}

	public void setbJugar(JButton bJugar) {
		this.bJ = bJugar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getJugar() {
		return J;
	}

	public void setbSaltar(JButton bSaltar) {
		this.bSal = bSaltar;
	}

	public void setLbNumSaltos(JLabel lbNumSaltos) {
		this.lbNum = lbNumSaltos;
	}

	public void setLbrta(JLabel lbrta) {
		this.lbrta = lbrta;
	}

	public void setGrisEspecial(Color grisEspecial) {
		this.grisEspecial = grisEspecial;
	}

	public void setOcre(Color ocre) {
		this.ocre = ocre;
	}

	public void setEsmeralda(Color esmeralda) {
		this.esmeralda = esmeralda;
	}

	



}
