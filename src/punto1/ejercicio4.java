package punto1;
import java.util.*;
public class ejercicio4 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca primer n�mero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo n�mero: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer n�mero: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);
            } else {
                System.out.println("el mayor es: " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }
    }
}
