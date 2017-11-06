package personas;

public class Persona implements Verficiacion {
	
	
	protected String Rut;
	protected String Verificador;
	protected String Nombre;
	protected String ApellidoP;
	protected String ApellidoM;
	protected String Telefono;
	protected String Celular;
	protected String Correo;
	protected String Empresa;
	
	public Persona(String rut,String Verificador, String nombre, String apellidoP, String apellidoM, String telefono, String celular,
			String correo, String empresa) {
		super();
		Rut = rut;
		this.setVerificador(Verificador);
		Nombre = nombre;
		ApellidoP = apellidoP;
		ApellidoM = apellidoM;
		Telefono = telefono;
		this.setCelular(celular);
		Correo = correo;
		Empresa = empresa;
	}
	

	protected String getVerificador() {
		return Verificador;
	}


	protected void setVerificador(String verificador) {
		
		try {
			if(verificador.length() == 1) {
				Verificador = verificador;	
			}	
		}catch (Exception e) {
			System.out.println("Error Verificador");
		}
	}


	protected String getRut() {
		return Rut;
	}

	protected void setRut(String rut) {
		Rut = rut;
	}

	protected String getNombre() {
		return Nombre;
	}

	protected void setNombre(String nombre) {
		Nombre = nombre;
	}

	protected String getApellidoP() {
		return ApellidoP;
	}

	protected void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}

	protected String getApellidoM() {
		return ApellidoM;
	}

	protected void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}

	protected String getTelefono() {
		return Telefono;
	}

	protected void setTelefono(String telefono) {
		Telefono = telefono;
	}

	protected String getCelular() {
		return Celular;
	}

	protected void setCelular(String celular) {
		
		try {
			if (celular.length() == 8) {
				Celular = celular;			
			}
		}catch(Exception e){
			System.out.println("Error Verificador");
		}
	}

	protected String getCorreo() {
		return Correo;
	}

	protected void setCorreo(String correo) {
		Correo = correo;
	}

	protected String getEmpresa() {
		return Empresa;
	}

	protected void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	@Override
	public void VerificaRut(String Rut) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VerificaNumero(String Numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VerificaCelu(String Celulu) {
		// TODO Auto-generated method stub
		
	}

	

}
