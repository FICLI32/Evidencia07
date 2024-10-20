import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Pruebas {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Juan Carlos","12345678-9");
        Piloto piloto2 = new Piloto("Carlos Juan","12345679-0");

        Avion avion1 = new Avion(150, "Boieng 737");
        Avion avion2 = new Avion(200, "Airbus A320");

        Ciudad ciudadOrigen = new Ciudad("Santiago");
        Ciudad ciudadDestino = new Ciudad("Buenos Aires");

        Pasaporte pasaporte1 = new Pasaporte(12345,"Chilena",5,2025);
        Pasaporte pasaporte2 = new Pasaporte(67891,"Argentina",0,2024);

        Pasajero pasajero1 = new Pasajero("Oscar","63587223-5",pasaporte1);
        Pasajero pasajero2 = new Pasajero("Messi", "98436636-8",pasaporte2);

        Vuelo vuelo1 = new Vuelo("Santiago","10-04-2024",101,ciudadDestino,avion1,piloto1);

        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto bakan");

        aeropuerto.registrarPiloto(piloto1);
        aeropuerto.registrarAviones(avion1);

        aeropuerto.crearVuelo(vuelo1);

        vuelo1.registrarPasajero(pasajero1);
        vuelo1.registrarPasajero(pasajero2);

        ArrayList<Vuelo> vuelosPorFecha = aeropuerto.buscarVuelosPorFecha("10-04-2024");
        for (Vuelo vuelo : vuelosPorFecha){
            System.out.println("vuelo id:" + vuelo.getIDVuelo());
        }

        aeropuerto.mostrarUsuariosVuelo(101);

    }
}
