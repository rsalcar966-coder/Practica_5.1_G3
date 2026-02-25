package concesionario.ciclomotor;

import concesionario.Vehiculo;

public abstract class Ciclomotor extends Vehiculo{
	private String cilindrada;

	public Ciclomotor(String marca, String modelo, String matricula, String cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
    public void acelerar(int cantidad) {
        int velocidad = cantidad;
        System.out.println("El coche acelera a " + velocidad + " km/h");
    }
	
}
