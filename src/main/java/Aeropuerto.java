import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	private String _nombre;
	private List<Piloto> _pilotos;
	private ArrayList<Vuelo> _vuelos;
	private ArrayList<Avion> _aviones;

	public Aeropuerto(String _nombre) {
		this._nombre = _nombre;
		this._pilotos = new ArrayList<>();
		this._vuelos = new ArrayList<>();
		this._aviones = new ArrayList<>();
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public ArrayList<Vuelo> getVuelos() {
		return this._vuelos;
	}

	public void crearVuelo(Vuelo vuelo) {
		this._vuelos.add(vuelo);
		System.out.println("Vuelo registrado: "+ vuelo.getIDVuelo());
	}

	public void registrarAviones(Avion avion) {
		this._aviones.add(avion);
		System.out.println("Avion registrado: "+ avion.getModelo());
	}

	public void registrarPiloto(Piloto piloto) {
		this._pilotos.add(piloto);
		System.out.println("Piloto registrado: "+ piloto.getNombre());
	}

	public ArrayList<Vuelo> buscarVuelosPorFecha(String fecha){
		ArrayList<Vuelo> vuelosFecha = new ArrayList<>();
		for (Vuelo vuelo : this._vuelos){
			if(vuelo.getFechaVuelo().equals(fecha)){
				vuelosFecha.add(vuelo);
			}
		}
		return vuelosFecha;
	}

	public void mostrarUsuariosVuelo(int idVuelo){
		for (Vuelo vuelo : this._vuelos){
			if (vuelo.getIDVuelo() == idVuelo){
				vuelo.mostrarPasajeros();
				return;
			}
		}
		System.out.println("Vuelo no encontrado");
	}

}