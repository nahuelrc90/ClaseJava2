
public class Mascota {
	
	private String nombreMascota;
	private Persona due�oMascota;
	private int latitudMascota;
	private int longitudMascota;
	
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public Persona getDue�oMascota() {
		return due�oMascota;
	}
	public void setDue�oMascota(Persona due�oMascota) {
		this.due�oMascota = due�oMascota;
	}
	
	public String presentacion(){
		return ("Soy "+nombreMascota+" y mi due�o es "+due�oMascota.mostrarNombre());
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

