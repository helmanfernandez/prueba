package co.edu.Unbosque.view;

import java.awt.*;
import javax.swing.*;
import co.edu.Unbosque.controller.*;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private PanelLogo panLogo;	
	private PanelMenu panMenu;
	private PanelLogoAuto panLogoAuto;
	private PanelAutonicio panAutoInicio;
	private PanelAutoInicio2 panAutoInicio2;
	private PanelAutoInicio3 panAutoInicio3;
	private PanelTablero panTablero;
	private PanelRamaPodaColFil panRamaPodaColFil;
	private PanelRPOpciones panRPOpciones;
	
	public View(Controller controlador){
		
		setSize(800, 600);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/util/logoBosque.png")));
		setTitle("Taller Pruebas Unitarias");		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		panLogo = new PanelLogo();
		this.getContentPane().setBackground(Color.black);
		panLogo.setBounds(0, 0, 800, 200);
		add(panLogo);
		panLogo.setVisible(false);
		
		panMenu = new PanelMenu();
		panMenu.setBounds(0, 0, 800, 600);
		add(panMenu);
		panMenu.setVisible(true);
		
		panLogoAuto = new PanelLogoAuto();
		this.getContentPane().setBackground(Color.black);
		panLogoAuto.setBounds(0, 0, 800, 200);
		add(panLogoAuto);
		panLogoAuto.setVisible(false);
		
		panAutoInicio = new PanelAutonicio();
		panAutoInicio.setBounds(0, 200, 800, 400);
		add(panAutoInicio);
		panAutoInicio.setVisible(false);
		
		panAutoInicio2 = new PanelAutoInicio2();
		panAutoInicio2.setBounds(0, 200, 800, 400);
		add(panAutoInicio2);
		panAutoInicio2.setVisible(false);
		
		panAutoInicio3 = new PanelAutoInicio3();
		panAutoInicio3.setBounds(0, 200, 800, 400);
		add(panAutoInicio3);
		panAutoInicio3.setVisible(false);
		
		panRamaPodaColFil = new PanelRamaPodaColFil();
		panRamaPodaColFil.setBounds(0, 0, 800, 600);
		add(panRamaPodaColFil);
		panRamaPodaColFil.setVisible(false);
		
		panRPOpciones = new PanelRPOpciones();
		panRPOpciones.setBounds(565, 0, 235, 600);
		add(panRPOpciones);
		panRPOpciones.setVisible(false);
		
		panRamaPodaColFil.getbIngresarCondiciones().addActionListener(controlador);
		
		panMenu.getbProgDin().addActionListener(controlador);
		panMenu.getbBackTr().addActionListener(controlador);
		panMenu.getbRamaPoda().addActionListener(controlador);
		
		panAutoInicio.getbAgrPlato().addActionListener(controlador);
		panAutoInicio.getbIniciar().addActionListener(controlador);
		
		panAutoInicio2.getbMenu().addActionListener(controlador);
		
		panRPOpciones.getbSaltar().addActionListener(controlador);
		panRPOpciones.getbJugar().addActionListener(controlador);
		
	}

	public PanelMenu getPanMenu() {
		return panMenu;
	}

	public PanelAutonicio getPanResauranteInicio() {
		return panAutoInicio;
	}

	public PanelLogoAuto getPanLogoRestaurante() {
		return panLogoAuto;
	}

	public PanelLogo getPanLogo() {
		return panLogo;
	}

	public PanelAutoInicio2 getInicio2() {
		return panAutoInicio2;
	}

	public PanelAutoInicio3 getPanResauranteInicio3() {
		return panAutoInicio3;
	}

	public PanelTablero getPanTablero() {
		return panTablero;
	}

	public PanelRamaPodaColFil getPanRamaPodaColFil() {
		return panRamaPodaColFil;
	}

	public PanelRPOpciones getPanRPOpciones() {
		return panRPOpciones;
	}

	public void setPanTablero(PanelTablero panTablero) {
		this.panTablero = panTablero;
	}

}
