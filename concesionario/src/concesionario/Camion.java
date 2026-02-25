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
	
	@Override
    public void acelerar(int cantidad) {
        int velocidad = cantidad;
        System.out.println("El coche acelera a " + velocidad + " km/h");
    }

	// Metodo agregado
	public void descargar() {
		System.out.println("El camión está descargando la mercancía.");
	}
	
	
	
	@Override
	public String toString() {
		return String.format("Coche [marca= %s, modelo= %s, matricula= %s, capacidadCarga= %f]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.capacidadCarga);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camion other = (Camion) obj;
		return super.equals(obj) && this.capacidadCarga == other.capacidadCarga;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}

	
}
