package concesionario.furgonetas;

public class Camper extends Furgoneta {
	private String descripcion;

	public Camper(String marca, String modelo, String matricula, TipoFurgoneta tipo, String descripcion) {
		super(marca, modelo, matricula, tipo);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void desplegarCama() {
		System.out.println("La cama de la camper se ha desplegado.");
	}
	
}
