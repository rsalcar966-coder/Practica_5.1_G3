package concesionario.ciclomotor;

public class Quad extends Ciclomotor{
	private double tamaño;

	public Quad(String marca, String modelo, String matricula, String cilindrada, double tamaño) {
		super(marca, modelo, matricula, cilindrada);
		this.tamaño = tamaño;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}
	

}
