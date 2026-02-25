package concesionario.coches;

public class Ranchera extends Coche{
	private double capacidadMaletero;

	public Ranchera(String marca, String modelo, String matricula, String combustible, double capacidadMaletero) {
		super(marca, modelo, matricula, combustible);
		this.capacidadMaletero = capacidadMaletero;
	}

	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
	
}
