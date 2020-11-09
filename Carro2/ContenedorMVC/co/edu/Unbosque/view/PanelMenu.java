package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelMenu extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String LUXURY = "luxury";
	
	public static final String GUARDAR = "Guardar";
	
	public static final String COMPRAR = "comprar";
	
	private JButton bProgDin, bBackTr, bRama;

	private Color grisEspecial, ocre, esmeralda;

	public PanelMenu() {
		
		setLayout(null);
		grisEspecial = new Color(169, 167, 167);
		ocre = new Color(200, 197, 1);
		esmeralda = new Color(69, 214, 187);
		setBackground(Color.BLACK);
		

		bProgDin = new JButton("AUTO LUXURY ");
		bProgDin.setFont(new Font("Tahoma", Font.BOLD, 24));
		bProgDin.setBackground(ocre);
		bProgDin.setForeground(Color.WHITE);
		bProgDin.setBounds(180, 30, 400, 50);
		add(bProgDin);	
		
		bBackTr = new JButton("GUARDAR");
		bBackTr.setFont(new Font("Tahoma", Font.BOLD, 24));
		bBackTr.setBackground(esmeralda);
		bBackTr.setForeground(Color.WHITE);
		bBackTr.setBounds(180, 110, 400, 50);
		add(bBackTr);	
		
		bRama = new JButton("COMPRAR VEHICULO");
		bRama.setFont(new Font("Tahoma", Font.BOLD, 24));
		bRama.setBackground(grisEspecial);
		bRama.setForeground(Color.WHITE);
		bRama.setBounds(180, 190, 400, 50);
		add(bRama);	
		
		bProgDin.setActionCommand(LUXURY);
		
		bBackTr.setActionCommand(GUARDAR);
		
		bRama.setActionCommand(COMPRAR);
		
	}

	public JButton getbProgDin() {
		return bProgDin;
	}

	public void setbProgDin(JButton bProgDin) {
		this.bProgDin = bProgDin;
	}

	public JButton getbBackTr() {
		return bBackTr;
	}

	public void setbBackTr(JButton bBackTr) {
		this.bBackTr = bBackTr;
	}

	public JButton getbRamaPoda() {
		return bRama;
	}

	public void setbRamaPoda(JButton bRamaPoda) {
		this.bRama = bRamaPoda;
	}



}
