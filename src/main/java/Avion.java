import java.util.ArrayList;

public class Avion {
	private int _capacidadPasajeros;
	private String _modelo;
	private ArrayList<Vuelo> _vuelos;

	public Avion(int _capacidadPasajeros, String _modelo) {
		this._capacidadPasajeros = _capacidadPasajeros;
		this._modelo = _modelo;
		this._vuelos = new ArrayList<>();
	}

	public int getCapacidadPasajeros() {
		return this._capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int aCapacidadPasajeros) {
		this._capacidadPasajeros = aCapacidadPasajeros;
	}

	public String getModelo() {
		return this._modelo;
	}

	public void setModelo(String aModelo) {
		this._modelo = aModelo;
	}

	public ArrayList<Vuelo> getVuelos() {
		throw new UnsupportedOperationException();
	}

	public void setVuelos(ArrayList<Vuelo> aVuelos) {
		throw new UnsupportedOperationException();
	}
}