package tp2_ej4_establecimiento;

import java.time.LocalDate;

public class Turno {

	
	private Usuario usuario; 
	private Cancha cancha;
	private LocalDate fechaTurno;
	private double descuento;
	//private Usuario nombreUsuario;
	
	
	public Turno(Usuario usuario, LocalDate fechaTurno, Cancha cancha, double des) {
		this.usuario = usuario;
		this.fechaTurno = fechaTurno;
		this.cancha = cancha;
		this.descuento = des;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Cancha getCancha() {
		return cancha;
	}


	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}


	LocalDate getFechaTurno() {
		return fechaTurno;
	}


	public void setFechaTurno(LocalDate fechaTurno) {
		this.fechaTurno = fechaTurno;
	}
	
	
	
	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public int calcularPrecio() {
		int precio= cancha.getPrecio();
		if(usuario.esSocio()) {
			precio *=(1 - this.descuento);
		}
		return precio;
	}
	
}
