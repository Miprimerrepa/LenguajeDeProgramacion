
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu de opciones: \n1.-Multiplicar \n2.-Suma \n3.-Resta");
        String opcion = scanner.nextLine();
        int a,b;
        switch (opcion) {
            case "Multiplicar":
                System.out.println("Multiplicar");
                System.out.println("Ingresa un valor para a");
                a = scanner.nextInt();
                System.out.println("Ingresa el valor para b");
                b = scanner.nextInt();
                System.out.println("Resultado");
                System.out.println(a * b);
                break;
            case "Suma":
                System.out.println("Suma");
                System.out.println("Ingresa un valor para a");
                a = scanner.nextInt();
                System.out.println("Ingresa un valor para b");
                b = scanner.nextInt();
                System.out.println("Resultado");
                System.out.println(a + b);
                break;
            case "Resta":
                System.out.println("Resta");
                System.out.println("Ingresaun valor para a");
                a = scanner.nextInt();
                System.out.println("Ingresa un valor para b");
                b = scanner.nextInt();
                System.out.println("Resultado");
                System.out.println(a - b);
                break;
            default:
                System.out.println("Ninguno es correcto");
        }
    }
}