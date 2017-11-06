package personas;

public interface Verficiacion {
	
	final String CARACTERMAYUSCULA = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	final String CARACTERMINUSCULA = "abcdefghijklmnñopqrstuvwxyz";
	final String NUMERALES = "123456789";
	final int contraseña = 46141941;
	public void VerificaRut(String Rut);
	public void VerificaNumero(String Numero);
	public void VerificaCelu(String Celulu);

}
