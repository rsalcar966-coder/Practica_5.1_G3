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

	@Override
	public String toString() {
		return String.format("Ciclomotor [marca= %s, modelo= %s, matricula= %s, cilindrada= %s]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.cilindrada );
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciclomotor other = (Ciclomotor) obj;
		return super.equals(obj) && this.cilindrada.equals(other.cilindrada);
	}
	
	
}
