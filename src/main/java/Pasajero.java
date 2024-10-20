public class Pasajero {
	private String _nombre;
	private String _rut;
	private Pasaporte _pasaporte;

	public Pasajero(String _nombre, String _rut, Pasaporte _pasajero) {
		this._nombre = _nombre;
		this._rut = _rut;
		this._pasaporte = _pasajero;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getRut() {
		return this._rut;
	}

	public void setRut(String aRut) {
		this._rut = aRut;
	}

	public Pasaporte get_pasaporte() {
		return _pasaporte;
	}

	public void set_pasaporte(Pasaporte _pasaporte) {
		this._pasaporte = _pasaporte;
	}
}