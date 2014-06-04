
public class Persona {

	private String nombre;
	private String apellido;
	private String calle;
	private int numero;
	private int piso;
	private char dpto;
	
	public void setNombre(String Name){
		nombre = Name;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNumero(int Number){
		numero = Number;
	}

	public int getNumero(){
		return numero;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getDpto() {
		return dpto;
	}

	public void setDpto(char dpto) {
		this.dpto = dpto;
	}
	
	public String mostrarNombre(){
		return apellido+", "+nombre;
	}
}
