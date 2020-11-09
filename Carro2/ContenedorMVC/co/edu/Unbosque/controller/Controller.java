package co.edu.Unbosque.controller;

import co.edu.Unbosque.Model.Campo;
import co.edu.Unbosque.Model.Concesionario;
import co.edu.Unbosque.Model.Programacion;
import co.edu.Unbosque.Model.Vehiculo;
import co.edu.Unbosque.view.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Controller implements ActionListener {

	private View IG;	
	
	private Programacion programacionAuto;
	
	private Campo campoL;
	

	
	private Concesionario concesionario;
	
	PanelRamaPodaColFil pRP = new PanelRamaPodaColFil();

	public Controller() {
		
		IG = new View(this);

		IG.setVisible(true);
		
		programacionAuto = new Programacion();
		
		concesionario = new Concesionario();
		
		pRP = IG.getPanRamaPodaColFil();

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("luxury")) {
			IG.getPanLogo().setVisible(false);
			IG.getPanMenu().setVisible(false);
			
			IG.getPanLogoRestaurante().setVisible(true);
			IG.getPanResauranteInicio().setVisible(false);
			IG.getInicio2().setVisible(true);
			
			ArrayList<String> ma = new ArrayList<String>();
			ArrayList<Integer> an = new ArrayList<Integer>();
			String m = "Marca__Anio__Placa__Cap__NPuertas__Tipo\n\n";
			String o = "__";
			
			for (int i = 0; i < concesionario.getCarros().size(); i++) {
				ma.add(concesionario.getCarros().get(i).getMarca());
				an.add(concesionario.getCarros().get(i).getAnio());
				m+= ma.get(i)+o+an.get(i)+"\n"; 
			}
			
			IG.getInicio2().getTaMenu().setText(m);

		}					
		
		if (e.getActionCommand().equals("Iniciar")) {
			
			IG.getPanResauranteInicio().setVisible(false);
			
			IG.getInicio2().setVisible(true);
			
			ArrayList<String> ma = new ArrayList<String>();
			ArrayList<Integer> an = new ArrayList<Integer>();
			String m = "Marca__Anio__Placa__Cap__NPuertas__Tipo\n\n";
			String o = "__";
			
			for (int i = 0; i < concesionario.getCarros().size(); i++) {
				ma.add(concesionario.getCarros().get(i).getMarca());
				an.add(concesionario.getCarros().get(i).getAnio());
				an.add(concesionario.getCarros().get(i).getAnio());
				an.add(concesionario.getCarros().get(i).getAnio());
				m+= ma.get(i)+o+an.get(i)+"\n"; 
			}
			
			IG.getInicio2().getTaMenu().setText(m);		
			
		}
		
		if (e.getActionCommand().equals("Conoce tu menu óptimo")) {
			
			ArrayList<String> ma = new ArrayList<String>();
			ArrayList<Integer> an = new ArrayList<Integer>();
			String m = "Marca__Anio__Placa__Cap__NPuertas__Tipo\n\n";
			String o = "__";
			
			ArrayList<Vehiculo> compAnio = concesionario.compAnio(Integer.parseInt(IG.getInicio2().getTxMin().getText()));
			
			for (int i = 0; i <compAnio.size(); i++) {
				ma.add(compAnio.get(i).getMarca());
				an.add(compAnio.get(i).getAnio());
				an.add(compAnio.get(i).getAnio());
				m+= ma.get(i)+o+an.get(i)+"\n"; 
			}
			
			IG.getInicio2().getTaMenu().setText(m);

			
			programacionAuto.setMin(Integer.parseInt(IG.getInicio2().getTxMin().getText()));
			
			String out = programacionAuto.calcular();
			
			IG.getPanResauranteInicio3().getTaMenuOptimizado().setText(out);
			
		}
		
		if (e.getActionCommand().equals("comprar")) {
			IG.getPanLogo().setVisible(false);
			IG.getPanMenu().setVisible(false);
			IG.getPanRamaPodaColFil().setVisible(true);
		}
		
	 
		
		
		if (e.getActionCommand().equals("")) {
			
			IG.getPanTablero().getmCasillas()[campoL.getL().getxInicial()][ campoL.getL().getyInicial()].setIcon(null);
			
			
			
			campoL.primerMov();
			
			
			
			
			IG.getPanTablero().agregar(campoL.getL().getxInicial(), campoL.getL().getyInicial());
			
			
		
			
		}
		
		
	}

}
