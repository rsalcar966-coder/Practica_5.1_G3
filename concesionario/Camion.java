package concesionario;
public class Camion extends Vehiculo{
	private double capacidadCarga;

	public Camion(String marca, String modelo, String matricula, double capacidadCarga) {
		super(marca, modelo, matricula);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	public void descargar() {
		System.out.println("El camión está descargando la mercancía.");
	}
}
