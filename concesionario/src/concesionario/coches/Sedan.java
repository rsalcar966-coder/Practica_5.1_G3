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
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}


}
