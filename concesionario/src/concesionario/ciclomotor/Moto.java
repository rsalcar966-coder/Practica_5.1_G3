package concesionario.ciclomotor;

public class Moto extends Ciclomotor{
	private String tipo;

	public Moto(String marca, String modelo, String matricula, String cilindrada, String tipo) {
		super(marca, modelo, matricula, cilindrada);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	@Override
	public String toString() {
		return String.format("Moto [marca= %s, modelo= %s, matricula= %s, cilindrada= %s, tipo= %s]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.getCilindrada(), this.tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moto other = (Moto) obj;
		return super.equals(obj) && this.tipo.equals(other.tipo);
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}
	
}
