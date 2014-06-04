
public class Mascota {
	
	private String nombreMascota;
	private Persona dueñoMascota;
	private int latitudMascota;
	private int longitudMascota;
	
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public Persona getDueñoMascota() {
		return dueñoMascota;
	}
	public void setDueñoMascota(Persona dueñoMascota) {
		this.dueñoMascota = dueñoMascota;
	}
	
	public String presentacion(){
		return ("Soy "+nombreMascota+" y mi dueño es "+dueñoMascota.mostrarNombre());
	}
	public int getLatitudMascota() {
		return latitudMascota;
	}
	public void setLatitudMascota(int latitudMascota) {
		this.latitudMascota = latitudMascota;
	}
	public int getLongitudMascota() {
		return longitudMascota;
	}
	public void setLongitudMascota(int longitudMascota) {
		this.longitudMascota = longitudMascota;
	}

	 

}

