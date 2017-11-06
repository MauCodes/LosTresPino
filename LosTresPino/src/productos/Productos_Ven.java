package productos;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Productos_Ven extends Productos{
	
	
	private Date Vencimiento;


	
	public Productos_Ven(int id, String nombre, String descripcion, double precioUnitario, int cantidad,
			Date fecha_Ingreso,Date Vencimiento) {
		super(id, nombre, descripcion, precioUnitario, cantidad, fecha_Ingreso);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Info() {
		
		if(this.getCantidad() >= 2) {
			this.setPrecioTotal(this.getPrecioUnitario() * this.getCantidad());
		}else if (this.getCantidad() == 1) {this.setPrecioTotal(this.PrecioUnitario);}
		JFrame ventana = new JFrame("Producto: "+this.getNombre()+" Cantidad:"+this.getCantidad());
		JLabel ID = new JLabel("ID: "+this.getId());
		JLabel NOMBRE = new JLabel("Nombre: "+this.getNombre());
		JLabel DESCRIPCION = new JLabel("Descripcion: "+this.getDescripcion());
		JLabel CANTIDAD = new JLabel("Cantidad: "+this.getCantidad());
		JLabel PRECIOUNITARIO = new JLabel("Precio Unitario: "+this.getPrecioUnitario());
		JLabel PRECIOTOTAL = new JLabel("Precio Total: "+this.getPrecioTotal());
		JLabel FECHA_INGRESO = new JLabel("Fecha Ingreso: "+this.getFecha_Ingreso());
		JLabel FECHA_VENCIMIENTO = new JLabel("Fecha Vencimiento: "+this.getVencimiento());
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null);
		ventana.setSize(380,230);
		
		ID.setBounds(10, 10, 50, 20);
		NOMBRE.setBounds(10, 30, 200, 20);
		DESCRIPCION.setBounds(10, 50, 300, 20);
		CANTIDAD.setBounds(10, 70, 200, 20);
		PRECIOUNITARIO.setBounds(10, 90, 200, 20);
		FECHA_INGRESO.setBounds(10, 130, 200, 20);
		PRECIOTOTAL.setBounds(10, 110, 200, 20);	
		FECHA_VENCIMIENTO.setBounds(10, 150, 200, 20);
		ventana.add(ID);
		ventana.add(NOMBRE);
		ventana.add(DESCRIPCION);
		ventana.add(CANTIDAD);
		ventana.add(PRECIOUNITARIO);
		ventana.add(PRECIOTOTAL);
		ventana.add(FECHA_INGRESO);
		ventana.add(FECHA_VENCIMIENTO);
		
		ventana.setVisible(true);
	}




	public Date getVencimiento() {
		return Vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		Vencimiento = vencimiento;
	}
	

}
