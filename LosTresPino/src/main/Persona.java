package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import personas.*;

public class Persona extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel Rut, NOMBRE, Apellidos, ApellidoM, Celular, Correo, Telefono;
	private JButton aceptar, salir;
	private JTextField field1,field2,field3,field4,field5,field6,field7;
	public Persona() {

		configureGUI();
		this.setVisible(true);
	}
	
	public Persona(String string, String string2, String string3, String string4, String string5, String string6,
			String string7) {
		// TODO Auto-generated constructor stub
	}

	private void configureGUI() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,190);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		
		Rut = new JLabel("Rut: ");
		NOMBRE = new JLabel("Nombre: ");
		Apellidos = new JLabel("Apellido Paterno: ");
		ApellidoM = new JLabel("Apellido Materno: ");
		Celular = new JLabel("Celular: ");
		Correo = new JLabel("Correo: ");
		Telefono = new JLabel("Telefono: ");
		
		aceptar = new JButton("Aceptar");
		salir = new JButton("Salir");
		
		field1 = new JTextField();
		field2 = new JTextField();
		field3 = new JTextField();
		field4 = new JTextField();
		field5 = new JTextField();
		field6 = new JTextField();
		field7 = new JTextField();
		
		
		Rut.setBounds(10, 10, 50, 20);
		NOMBRE.setBounds(10, 30, 200, 20);
		Apellidos.setBounds(10, 50, 300, 20);
		ApellidoM.setBounds(10, 70, 200, 20);
		Celular.setBounds(10, 90, 200, 20);
		Telefono.setBounds(10, 110, 200, 20);
		Correo.setBounds(10, 130, 200, 20);
		
		
		field1.setBounds(135, 10, 200, 20);
		field2.setBounds(135, 30, 200, 20);
		field3.setBounds(135, 50, 200, 20);
		field4.setBounds(135, 70, 200, 20);
		field5.setBounds(135, 90, 200, 20);
		field6.setBounds(135, 110, 200, 20);
		field7.setBounds(135, 130, 200, 20);
		
		
		aceptar.setBounds(10,160,100,20);
		salir.setBounds(110,160,100,20);
		
		aceptar.addActionListener(this);
		salir.addActionListener(this);
		
		
		this.add(Rut);
		this.add(NOMBRE);
		this.add(Apellidos);
		this.add(ApellidoM);
		this.add(Celular);
		this.add(Telefono);
		this.add(Correo);
		this.add(aceptar);
		this.add(salir);
		
		this.add(field1);
		this.add(field2);
		this.add(field3);
		this.add(field4);
		this.add(field5);
		this.add(field6);
		this.add(field7);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getSource() == salir ) {
			this.dispose();
		}else if (arg0.getSource() == aceptar) {
			String[] insertar = {field1.getText(),field2.getText(),field3.getText(),field4.getText(),field5.getText(),field6.getText(),field7.getText()};
			Persona pero =new Persona(insertar[0],insertar[1],insertar[2],insertar[3],insertar[4],insertar[5],insertar[6]);
			
		}
	}
	

}
