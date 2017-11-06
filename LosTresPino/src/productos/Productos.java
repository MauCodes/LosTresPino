package productos;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class Productos {
	
	protected int Id;
	protected String Nombre;
	protected String Descripcion;
	protected int Cantidad;
	protected double PrecioUnitario;
	protected double PrecioTotal;
	protected Date Fecha_Ingreso;
	
	public Productos(int id, String nombre, String descripcion, double precioUnitario, int cantidad, Date fecha_Ingreso) {
		super();
		Id = id;
		Nombre = nombre;
		Descripcion = descripcion;
		this.setCantidad(cantidad);
		PrecioUnitario = precioUnitario;
		Fecha_Ingreso = fecha_Ingreso;
	}
	
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
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(null);
		ventana.setSize(380,200);
		
		ID.setBounds(10, 10, 50, 20);
		NOMBRE.setBounds(10, 30, 200, 20);
		DESCRIPCION.setBounds(10, 50, 300, 20);
		CANTIDAD.setBounds(10, 70, 200, 20);
		PRECIOUNITARIO.setBounds(10, 90, 200, 20);
		FECHA_INGRESO.setBounds(10, 130, 200, 20);
		PRECIOTOTAL.setBounds(10, 110, 200, 20);		
		ventana.add(ID);
		ventana.add(NOMBRE);
		ventana.add(DESCRIPCION);
		ventana.add(CANTIDAD);
		ventana.add(PRECIOUNITARIO);
		ventana.add(PRECIOTOTAL);
		ventana.add(FECHA_INGRESO);
		
		ventana.setVisible(true);
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		this.Cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		
		return PrecioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.PrecioUnitario = precioUnitario;
	}
	public double getPrecioTotal() {
		return PrecioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		PrecioTotal = precioTotal;
	}
	public Date getFecha_Ingreso() {
		return Fecha_Ingreso;
	}
	public void setFecha_Ingreso(Date fecha_Ingreso) {
		Fecha_Ingreso = fecha_Ingreso;
	}
	
	

}
