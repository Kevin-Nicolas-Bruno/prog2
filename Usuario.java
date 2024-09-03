package tp2_ej4_establecimiento;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
	
	private ArrayList<Turno> turnos;
	private int reservasMinimas;
	
	
	public Usuario(int reservasMinimas) {
		this.turnos = new ArrayList<>();
		this.reservasMinimas = reservasMinimas;
	}
	
	public boolean esSocio() {
		long reservasRecientes =  this.turnos.stream().filter(turno -> turno.getFechaTurno().isAfter(LocalDate.now().minusMonths(2))).count();	
	return reservasRecientes >= reservasMinimas;

	}
	
	public void agregarTurno(Turno nuevoTurno) {
		turnos.add(nuevoTurno);
	}
}
