
public class testMascota {

	public static void main(String[] args) {
		
		Mascota m1 = new Mascota();
		Persona p2 = new Persona();
			
		p2.setNombre("Macho");
		p2.setApellido("Duran");
						
		
		m1.setNombreMascota("Falcom");
		m1.setDue�oMascota(p2);
		System.out.println(m1.getNombreMascota());
		System.out.println(m1.getDue�oMascota().mostrarNombre());
		
		System.out.println(m1.presentacion());
		
		m1.setLatitudMascota(155);
		m1.setLongitudMascota(10);
		
		System.out.println("Mi ubicaciones es "+m1.getLatitudMascota()+"�latitud "+m1.getLongitudMascota()+"�longitud");
		
	}

}
