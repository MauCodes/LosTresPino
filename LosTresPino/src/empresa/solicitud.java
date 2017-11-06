package empresa;

import productos.Productos;

public interface solicitud {
	
	
	
	public boolean compruebaProducto(Productos Prod);
	public void AgregaProducto(Productos Prod);
	public void BuscarProductos(int ID);
}
