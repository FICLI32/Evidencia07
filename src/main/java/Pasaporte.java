public class Pasaporte {
	private int _iDPasaporte;
	private String _nacionalidad;
	private int _cantidadHojas;
	private int _fechaExpiracion;
	private Pasajero _pasajero;

	public Pasaporte(int _iDPasaporte, String _nacionalidad, int _cantidadHojas, int _fechaExpiracion) {
		this._iDPasaporte = _iDPasaporte;
		this._nacionalidad = _nacionalidad;
		this._cantidadHojas = _cantidadHojas;
		this._fechaExpiracion = _fechaExpiracion;
	}

	public int getIDPasaporte() {
		return this._iDPasaporte;
	}

	public void setIDPasaporte(int aIDPasaporte) {
		this._iDPasaporte = aIDPasaporte;
	}

	public String getNacionalidad() {
		return this._nacionalidad;
	}

	public void setNacionalidad(String aNacionalidad) {
		this._nacionalidad = aNacionalidad;
	}

	public int getCantidadHojas() {
		return this._cantidadHojas;
	}

	public void setCantidadHojas(int aCantidadHojas) {
		this._cantidadHojas = aCantidadHojas;
	}

	public int getFechaExpiracion() {
		return this._fechaExpiracion;
	}

	public void setFechaExpiracion(int aFechaExpiracion) {
		this._fechaExpiracion = aFechaExpiracion;
	}

	public boolean esValido(){
		int anioActual = 2024;
		return this._fechaExpiracion > anioActual && this._cantidadHojas >0;
	}
}
