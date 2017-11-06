package empresa;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import productos.*;


public class Empresas implements solicitud{
	
	
	private ArrayList<Productos> Empresa;
	private Iterator<Productos> itr;
	private Productos Productos;
	
	public Empresas() {
		Empresa = new ArrayList<Productos>();
		itr = Empresa.iterator();
		
	}

	@Override
	public boolean compruebaProducto(productos.Productos Prod) {
		// TODO Auto-generated method stub
		itr = Empresa.iterator();
		while(itr.hasNext()) {
			Productos = (Productos)itr.next();
			
			if(Productos.getId() == Prod.getId()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void AgregaProducto(productos.Productos Prod) {
		// TODO Auto-generated method stub
		
		boolean comprueba = compruebaProducto(Prod);
		
		if(comprueba == false) {
			Empresa.add(Prod);
			System.out.println("Se Agreg0 Correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "Lo Lamento el Codigo: "+Prod.getId()+" Nombre: "+Prod.getNombre()+" ya Existe.");
		}
	}

	@Override
	public void BuscarProductos(int ID) {
		// TODO Auto-generated method stub
		itr = Empresa.iterator();
		while(itr.hasNext()) {
			Productos = (Productos)itr.next();
			if(Productos.getId() == ID) {
				Productos.Info();
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "No Se Encuentra el Producto: "+ID);
		
	}
	
}
