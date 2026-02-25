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
	
	@Override
    public void acelerar(int cantidad) {
        int velocidad = cantidad;
        System.out.println("El coche acelera a " + velocidad + " km/h");
    }

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}
	
}
