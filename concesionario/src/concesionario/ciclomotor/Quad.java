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
	public String toString() {
		return String.format("Moto [marca= %s, modelo= %s, matricula= %s, cilindrada= %s, tamaño= %]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.getCilindrada(), this.tamaño);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quad other = (Quad) obj;
		return super.equals(obj) && this.tamaño == other.tamaño;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
	

}
