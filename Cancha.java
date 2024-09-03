package tp2_ej4_establecimiento;

public class Cancha {
	
	private String tipoDeCancha;
	private int precio;
	
	
	public Cancha(String tipoDeCancha, int precio) {
		this.tipoDeCancha = tipoDeCancha;
		this.precio = precio;
	}


	public String getTipoDeCancha() {
		return tipoDeCancha;
	}


	public void setTipoDeCancha(String tipoDeCancha) {
		this.tipoDeCancha = tipoDeCancha;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	

}
