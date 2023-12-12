package switch_1;

public class switch_1 {

	public static void main(String[] args) {
		int dia = 3;
		String diaDeLaSemana = switch (dia) {
		    case 1 -> "Lunes";
		    case 2 -> "Martes";
		    case 3 -> "Miércoles";
		    case 4 -> "Jueves";
		    case 5 -> "Viernes";
		    case 6 -> "Sábado";
		    case 7 -> "Domingo";
		    default -> "Número inválido";
		};

		System.out.println("El día de la semana es: " + diaDeLaSemana);
	}

}
