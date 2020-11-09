package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelAutonicio extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final String AGREGAR_MAS = "Agregar otro ";
	
	public static final String INICIAR = "Iniciar";
	
	private JButton bAgrP, bIniciar;
	
	private JLabel lbMensajeInicial, lbPla, lbCalo;
	
	private JTextField txPl, txCalr;

	private Color naranjita, rojito;

	public PanelAutonicio() {
		
		setLayout(null);
		naranjita = new Color(251, 196, 132);
		rojito = new Color(229, 63, 82);
		setBackground(naranjita);
		
		lbMensajeInicial = new JLabel("<html><body>"
									+ "<center>Bienvenido"
									+ "<br>"
									+ "</body></html>");
		lbMensajeInicial.setFont(new Font("Tahoma", Font.BOLD, 28));
		lbMensajeInicial.setForeground(rojito);
		lbMensajeInicial.setBounds(130, 0, 700, 100);
		add(lbMensajeInicial);
		
		lbPla = new JLabel("P");
		lbPla.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbPla.setForeground(Color.WHITE);
		lbPla.setBounds(190, 100, 100, 50);
		add(lbPla);
		
		lbCalo = new JLabel("Calorías");
		lbCalo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbCalo.setForeground(Color.WHITE);
		lbCalo.setBounds(470, 100, 200, 50);
		add(lbCalo);
		
		txPl = new JTextField("");
		txPl.setFont(new Font("Tahoma", Font.BOLD, 30));
		txPl.setForeground(rojito);
		txPl.setBackground(Color.WHITE);
		txPl.setBounds(130, 150, 200, 33);
		add(txPl);
		
		txCalr = new JTextField("");
		txCalr.setFont(new Font("Tahoma", Font.BOLD, 30));
		txCalr.setForeground(rojito);
		txCalr.setBackground(Color.WHITE);
		txCalr.setBounds(430, 150, 200, 33);
		add(txCalr);
		
		bAgrP = new JButton(" o");
		bAgrP.setFont(new Font("Tahoma", Font.BOLD, 24));
		bAgrP.setBackground(rojito);
		bAgrP.setForeground(Color.WHITE);
		bAgrP.setBounds(180, 200, 400, 50);
		add(bAgrP);	
		
		bIniciar = new JButton("Iniciar");
		bIniciar.setFont(new Font("Tahoma", Font.BOLD, 24));
		bIniciar.setBackground(Color.WHITE);
		bIniciar.setForeground(rojito);
		bIniciar.setBounds(180, 280, 400, 50);
		add(bIniciar);
		bIniciar.setEnabled(false);
		
		bAgrP.setActionCommand(AGREGAR_MAS);
		bIniciar.setActionCommand(INICIAR);
		
	}

	public JButton getbAgrPlato() {
		return bAgrP;
	}

	public JButton getbIniciar() {
		return bIniciar;
	}

	public JTextField getTxPlato() {
		return txPl;
	}

	public JTextField getTxCalorias() {
		return txCalr;
	}

	


}
