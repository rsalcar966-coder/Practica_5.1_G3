package concesionario.coches;

import concesionario.Vehiculo;

public abstract class Coche extends Vehiculo {
	private String combustible;

	public Coche(String marca, String modelo, String matricula, String combustible) {
		super(marca, modelo, matricula);
		this.combustible = combustible;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
}
