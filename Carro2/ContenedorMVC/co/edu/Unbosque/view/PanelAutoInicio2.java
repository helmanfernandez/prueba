package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelAutoInicio2 extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String CONOCE_MENU = "Conoce tu menu óptimo";
	
	private JButton bMenuOp;
 
	
	private JLabel lbCar;
	
	private JTextArea taMenu;
	
	private JScrollPane spMenu;
	
	private JLabel lbMin;
	
	private JTextField txMin;
	
	private Color naranjita, rojito;

	public PanelAutoInicio2() {
		
		setLayout(null);
		naranjita = new Color(251, 196, 132);
		rojito = new Color(229, 63, 82);
		setBackground(naranjita);
		
		lbCar = new JLabel("AUTOS DISPONIBLES");
		lbCar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbCar.setForeground(rojito);
		lbCar.setBounds(200, 0, 200, 50);
		add(lbCar);
		
		taMenu = new JTextArea();
		taMenu.setBackground(naranjita);
		taMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		taMenu.setForeground(Color.WHITE);
		taMenu.setBounds(30, 0, 300, 280);
		add(taMenu);
		
		spMenu = new JScrollPane(taMenu);
		spMenu.setBounds(30, 50, 305, 280);
		spMenu.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		spMenu.getVerticalScrollBar().setBackground(rojito);
		spMenu.getVerticalScrollBar().setForeground(naranjita);
		add(spMenu);
		
		lbMin = new JLabel("<html><body>"
								+ "<center>Comparacion "
								+ "<br>"
								+ "de "
								+ "Autos"
								+ "<br>"
								+ "</body></html>");
		lbMin.setFont(new Font("Tahoma", Font.BOLD, 28));
		lbMin.setForeground(rojito);
		lbMin.setBounds(450, 50, 300, 100);
		add(lbMin);
		
		txMin = new JTextField("");
		txMin.setFont(new Font("Tahoma", Font.BOLD, 30));
		txMin.setForeground(rojito);
		txMin.setBackground(Color.WHITE);
		txMin.setBounds(500, 170, 230, 33);
		add(txMin);
		
		bMenuOp = new JButton("AÑO");
		bMenuOp.setFont(new Font("Tahoma", Font.BOLD, 20));
		bMenuOp.setBackground(rojito);
		bMenuOp.setForeground(Color.WHITE);
		bMenuOp.setBounds(390, 90, 90, 100);
		add(bMenuOp);	
		 
		
		
		bMenuOp.setActionCommand(CONOCE_MENU);
		
	}

	public JButton getbMenu() {
		return bMenuOp;
	}

	public JTextArea getTaMenu() {
		return taMenu;
	}

	public JTextField getTxMin() {
		return txMin;
	}

	

	


}
