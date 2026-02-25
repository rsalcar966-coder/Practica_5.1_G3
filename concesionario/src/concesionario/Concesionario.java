package concesionario;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

	  private List<Vehiculo> listaVehiculos;

	  public Concesionario() {
	        listaVehiculos = new ArrayList<>();
	    }
  
	  public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	  }

	  public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		  this.listaVehiculos = listaVehiculos;
	  }

	  public void anadirVehiculo(Vehiculo v) {
	        if (v != null) {
	            listaVehiculos.add(v);
	        }
	  }
	  
	  public boolean eliminarVehiculo(Vehiculo v) {
	        return listaVehiculos.remove(v);
	  }
	
}
