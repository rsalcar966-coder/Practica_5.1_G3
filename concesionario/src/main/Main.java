package main;

import concesionario.Concesionario;
import concesionario.Camion;
import concesionario.Vehiculo;

import concesionario.ciclomotor.Moto;
import concesionario.ciclomotor.Quad;

import concesionario.coches.Sedan;
import concesionario.coches.Ranchera;

import concesionario.furgonetas.Camper;
import concesionario.furgonetas.TipoFurgoneta;

public class Main {

	public static void main(String[] args) {

		Concesionario concesionario = new Concesionario();

		Moto moto = new Moto("Yamaha", "R1", "1111AAA", "1000cc", "Deportiva");
		Quad quad = new Quad("Honda", "TRX", "2222BBB", "450cc", 1.5);

		Sedan sedan = new Sedan("Toyota", "Corolla", "3333CCC", "Gasolina", 4);
		Ranchera ranchera = new Ranchera("Ford", "Focus", "4444DDD", "Diesel", 550);

		Camion camion = new Camion("Mercedes", "Actros", "5555EEE", 18000);

		Camper camper = new Camper(
				"Volkswagen",
				"California",
				"6666FFF",
				TipoFurgoneta.L2H2,
				"Cama, fregadero y placas solares"
		);

		concesionario.anadirVehiculo(moto);
		concesionario.anadirVehiculo(quad);
		concesionario.anadirVehiculo(sedan);
		concesionario.anadirVehiculo(ranchera);
		concesionario.anadirVehiculo(camion);
		concesionario.anadirVehiculo(camper);

		for (Vehiculo v : concesionario.getListaVehiculos()) {
			v.mostrarDatos();
		}

		for (Vehiculo v : concesionario.getListaVehiculos()) {
			v.acelerar(120);
		}
	}
}