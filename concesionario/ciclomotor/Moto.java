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
	
}
