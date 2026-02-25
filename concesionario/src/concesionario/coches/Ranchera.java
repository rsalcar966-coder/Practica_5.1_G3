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

	//metodo agregado
	public void abrirMaletero() {
		System.out.println("El maletero de la ranchera se ha abierto.");
	}
	
	
	
	@Override
	public String toString() {
		return String.format("Ranchera [marca= %s, modelo= %s, matricula= %s, capacidadMaletero= %f]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.capacidadMaletero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ranchera other = (Ranchera) obj;
		return super.equals(obj) && this.capacidadMaletero == other.capacidadMaletero;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	
}
