package tp2_ej4_establecimiento;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario(4);
		Cancha canchaFutbol = new Cancha("Futbol", 400);
		Turno nuevoTurno = new Turno(usuario, LocalDate.now(), canchaFutbol, 0.2);
		
		usuario.agregarTurno(new Turno(usuario, LocalDate.now().minusMonths(6), canchaFutbol, 0.1));

		usuario.agregarTurno(new Turno(usuario,LocalDate.now().minusWeeks(3), canchaFutbol, 0.1));
		
		//mostrar el turno
		System.out.println("Fecha del turno: " + nuevoTurno.getFechaTurno());
		System.out.println("Cancha: " + nuevoTurno.getCancha().getTipoDeCancha());
		System.out.println("Precio del turno: " + nuevoTurno.calcularPrecio());
		System.out.println("Descuento aplicado: " + (nuevoTurno.getDescuento()*100) + "%");
	}

}
