package personas;

public class Personas extends Persona{
	
	private String CorreoRespaldo;

	public Personas(String rut, String Verificador, String nombre, String apellidoP, String apellidoM, String telefono,
			String celular, String correo, String empresa,String CorreoRespaldo) {
		super(rut, Verificador, nombre, apellidoP, apellidoM, telefono, celular, correo, empresa);
		
		this.CorreoRespaldo = CorreoRespaldo;
		// TODO Auto-generated constructor stub
	}

	public String getCorreoRespaldo() {
		return CorreoRespaldo;
	}

	public void setCorreoRespaldo(String correoRespaldo) {
		CorreoRespaldo = correoRespaldo;
	}
	
	
	

}
