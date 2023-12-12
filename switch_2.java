
package switch_2;

public class switch_2 {
    public static void main(String[] args) {
        int diasEnLaSemana = 7;

        for (int dia = 1; dia <= diasEnLaSemana; dia++) {
            String nombreDelDia;

            switch (dia) {
                case 1:
                    nombreDelDia = "Lunes";
                    break;
                case 2:
                    nombreDelDia = "Martes";
                    break;
                case 3:
                    nombreDelDia = "Miércoles";
                    break;
                case 4:
                    nombreDelDia = "Jueves";
                    break;
                case 5:
                    nombreDelDia = "Viernes";
                    break;
                case 6:
                    nombreDelDia = "Sábado";
                    break;
                case 7:
                    nombreDelDia = "Domingo";
                    break;
                default:
                    nombreDelDia = "Día no válido";
                    break;
            }

            System.out.println("Día " + dia + ": " + nombreDelDia);
        }
    }
}