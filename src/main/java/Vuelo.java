import java.util.ArrayList;

public class Vuelo {
	private String _ciudadOrigen;
	private String _fechaVuelo;
	private int _iDVuelo;
	private ArrayList<Pasajero> _pasajeros;
	public Ciudad _destino;
	private Avion _avion;
	private Piloto _piloto;

	public Vuelo(String _ciudadOrigen, String _fechaVuelo, int _iDVuelo, Ciudad _destino, Avion _avion, Piloto _piloto) {
		this._ciudadOrigen = _ciudadOrigen;
		this._fechaVuelo = _fechaVuelo;
		this._iDVuelo = _iDVuelo;
		this._pasajeros = new ArrayList<>();
		this._destino = _destino;
		this._avion = _avion;
		this._piloto = _piloto;
	}

	public String getCiudadOrigen() {
		return this._ciudadOrigen;
	}

	public void setCiudadOrigen(String aCiudadOrigen) {
		this._ciudadOrigen = aCiudadOrigen;
	}

	public String getFechaVuelo() {
		return this._fechaVuelo;
	}

	public void setFechaVuelo(String aFechaVuelo) {
		this._fechaVuelo = aFechaVuelo;
	}

	public int getIDVuelo() {
		return this._iDVuelo;
	}

	public void setIDVuelo(int aIDVuelo) {
		this._iDVuelo = aIDVuelo;
	}

	public ArrayList<Pasajero> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public void setPasajeros(ArrayList<Pasajero> aPasajeros) {
		throw new UnsupportedOperationException();
	}

	public void registrarPasajero(Pasajero pasajero) {
		if(pasajero.get_pasaporte().esValido()){
			this._pasajeros.add(pasajero);
			System.out.println("pasaporte registrado: "+ pasajero.getNombre());
		}else{
			System.out.println("Pasaporte invalido: "+ pasajero.getNombre());
		}
	}

	public void mostrarPasajeros() {
		System.out.println("Pasajeros de el vuelo" + this._iDVuelo + ":");
		for (Pasajero pasajero : this._pasajeros) {
			System.out.println(pasajero.getNombre() + "-" + pasajero.getRut());
		}
	}



}