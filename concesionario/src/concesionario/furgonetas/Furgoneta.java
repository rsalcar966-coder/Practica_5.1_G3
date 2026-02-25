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

	@Override
	public String toString() {
		return String.format("Coche [marca= %s, modelo= %s, matricula= %s, tipo= %s]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furgoneta other = (Furgoneta) obj;
		return super.equals(obj) && this.tipo == other.tipo;
	}
	
}
