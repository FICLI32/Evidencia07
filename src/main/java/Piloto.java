import java.sql.Array;

public class Piloto {
	private String _nombre;
	private String _rut;
	private Vuelo _vuelo;
	private Aeropuerto _aeropuerto;

	public Piloto(String _nombre, String _rut) {
		this._nombre = _nombre;
		this._rut = _rut;
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
}