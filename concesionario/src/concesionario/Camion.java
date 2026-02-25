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

	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}

	
}
