package notaaprobado;
import java.util.Scanner;
public class NotaAprobado {
    public void notaaprobado(){
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca nota a analizar:");
        nota = entrada.nextInt();
        if (nota > 5) {
            System.out.println("Prueba superada ");
        }
    }
    public static void main(String[] args) {
        NotaAprobado notaaprobado = new NotaAprobado();
        notaaprobado.notaaprobado();
    } 
}
