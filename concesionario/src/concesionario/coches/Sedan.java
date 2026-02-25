package concesionario.coches;

public class Sedan extends Coche{

	private int puertas;

	public Sedan(String marca, String modelo, String matricula, String combustible, int puertas) {
		super(marca, modelo, matricula, combustible);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	@Override
	public String toString() {
		return String.format("Ranchera [marca= %s, modelo= %s, matricula= %s, puertas= %d]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.puertas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
		Sedan other = (Sedan) obj;
		return super.equals(obj) && this.puertas == other.puertas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}


}
