package concesionario.furgonetas;

import concesionario.Vehiculo;

public abstract class Furgoneta extends Vehiculo {
	private TipoFurgoneta tipo;

	public Furgoneta(String marca, String modelo, String matricula, TipoFurgoneta tipo) {
		super(marca, modelo, matricula);
		this.tipo = tipo;
	}

	public TipoFurgoneta getTipo() {
		return tipo;
	}

	public void setTipo(TipoFurgoneta tipo) {
		this.tipo = tipo;
	}
	
	@Override
    public void acelerar(int cantidad) {
        int velocidad = cantidad;
        System.out.println("El coche acelera a " + velocidad + " km/h");
    }
	
}
