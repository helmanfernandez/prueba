package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelAutoInicio3 extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel lbMenuOPtimizado;
	
	private JTextArea taMenu;
	
	private JScrollPane spMenu;
	
	private Color naranjita, rojito;

	public PanelAutoInicio3() {
		
		setLayout(null);
		naranjita = new Color(251, 196, 132);
		rojito = new Color(229, 63, 82);
		setBackground(naranjita);
		
		lbMenuOPtimizado = new JLabel("<html><body>" 
												+ "<center>Tu Menú Optimizado" 
												+ "<br>" 
												+ "Sin Plato a Repetir Es:"  
												+ "</body></html>");
		lbMenuOPtimizado.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbMenuOPtimizado.setForeground(rojito);
		lbMenuOPtimizado.setBounds(250, 10, 400, 60);
		add(lbMenuOPtimizado);
		
		taMenu = new JTextArea();
		taMenu.setBackground(naranjita);
		taMenu.setFont(new Font("Tahoma", Font.BOLD, 24));
		taMenu.setForeground(rojito);
		taMenu.setBounds(80, 80, 600, 230);
		add(taMenu);
		
		spMenu = new JScrollPane(taMenu);
		spMenu.setBounds(80, 80, 600, 230);
		spMenu.getVerticalScrollBar().setBackground(rojito);
		spMenu.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(spMenu);
		
	}

	public JTextArea getTaMenuOptimizado() {
		return taMenu;
	}




}
