package main;

import productos.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import empresa.*;
public class Main implements ActionListener{
	
	private JFrame Ventana;
	private int Altura;
	private int Anchura;
	private String NOMBRE = "Los Tres Pino Fac";
	private JMenuBar menuBar;
	private JMenu menu1,menu2,menu3,menu4;
	private JMenuItem menu1Item1,menu1Item2,menu1Item3,menu1Item4,menu1Item5;
	private JMenuItem menu4Item1,menu4Item2,menu4Item3,menu4Item4,menu4Item5;
	private JOptionPane ingresoDatos;
	
	public Main() {
		inicializarGUI();
		configurarGUI();
		componentesGUI();
		Ventana.setVisible(true);
	}
	private void inicializarGUI() {
		// TODO Auto-generated method stub
		//se inicializan
		Ventana = new JFrame(NOMBRE);
		menuBar = new JMenuBar();menu1 = new JMenu("Menu");menu2 = new JMenu("Clientes");menu3 = new JMenu("Productos");
		menu4 = new JMenu("Buscar");
		//se termina la inicializacion del menu
		
		//inicializa los Item del Menu mas los ActionsListenner
		menu1Item1 = new JMenuItem("Ingresar");
		menu1Item2 = new JMenuItem("Salir");
		menu1Item2.addActionListener(this);
		//finalizar los Item del Menu 1
		
		//Se Inicializa Item del menu 4 mas los Actions
		menu4Item1 = new JMenuItem("Buscar Pedido");
		menu4Item2 = new JMenuItem("Buscar Persona");
		menu4Item3 = new JMenuItem("Buscar Arriendos");
		menu4Item4 = new JMenuItem("Buscar Eventos");
		menu4Item5 = new JMenuItem("Buscar ID Productos");
		menu4Item1.addActionListener(this);
		menu4Item2.addActionListener(this);
		menu4Item3.addActionListener(this);
		menu4Item4.addActionListener(this);
		menu4Item5.addActionListener(this);
		//finalizar los Item del Menu 4
		
		ingresoDatos = new JOptionPane();
		
	}
	private void configurarGUI() {
		// TODO Auto-generated method stub
		Altura = 600; Anchura = 800;
		
		//Config de Ventana
		Ventana.setSize(Anchura, Altura);
		Ventana.setForeground(Color.orange);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.setResizable(false);
		Ventana.setLayout(null);
		//Fin Config de ventana
		
		//Congig de Munu1
		menuBar.setBounds(1,1,Anchura,20);
		
	}
	private void componentesGUI() {
		// TODO Auto-generated method stub
		
		menu1.add(menu1Item1);
		menu1.add(menu1Item2);//fin Config menu1
		
		//Congig de Munu4
		menu4.add(menu4Item1);
		menu4.add(menu4Item2);
		menu4.add(menu4Item3);
		menu4.add(menu4Item4);
		menu4.add(menu4Item5);//fin Config menu4
		
		//Se Agrega Menu a la Barra de Menus
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		
		Ventana.add(menuBar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource()==menu1Item5) {
			System.err.close();
		}else if(arg0.getSource() == menu4Item5) {
			String mensaje;
			ingresoDatos.showInputDialog("Indicame el Id del Producto:");
			mensaje = (String) ingresoDatos.toString();
			 System.out.println(mensaje);
		}
		
	}
}
