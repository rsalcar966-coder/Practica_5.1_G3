package concesionario.furgonetas;

public class Camper extends Furgoneta {
	private String descripcion;

	public Camper(String marca, String modelo, String matricula, TipoFurgoneta tipo, String descripcion) {
		super(marca, modelo, matricula, tipo);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
    public void acelerar(int cantidad) {
        int velocidad = cantidad;
        System.out.println("El coche acelera a " + velocidad + " km/h");
    }
	
	// metodo agregado
	public void desplegarCama() {
		System.out.println("La cama de la camper se ha desplegado.");
	}

	
	@Override
	public String toString() {
		return String.format("Coche [marca= %s, modelo= %s, matricula= %s, descripcion= %s]", this.getMarca(), this.getModelo(), 
				this.getMatricula(), this.descripcion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camper other = (Camper) obj;
		return super.equals(obj) && this.descripcion.equals(other.descripcion);
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
		
	}
	
}
