package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;

public class PanelLogo extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel imagen;
	private ImageIcon icono;
	private Color grisEspecial;

	public PanelLogo() {
		
		grisEspecial = new Color(169, 167, 167);
		
		setLayout(null);
		setBackground(grisEspecial);
		
		imagen = new JLabel();
		icono = new ImageIcon(PanelLogo.class.getResource("/util/Encabezado.png"));		
		icono.setImage(icono.getImage());
		imagen.setIcon(icono);
		imagen.setBounds(0, 0, 770, 200);		
		add(imagen);

	}

	public Color getGrisEspecial() {
		return grisEspecial;
	}
}
