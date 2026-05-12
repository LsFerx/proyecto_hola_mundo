import java.util.Scanner;

public class ProyectoHolaMundo{
    public static void main(String [] args){
    System.out.println("Hola Mundo");
    System.out.println("Bienvenidos a Java ");
    System.out.println("Y a git/github");

    Scanner scanner = new Scanner(System.in);

    int n1;
    int n2;
    int r;

    System.out.println("Ingrese el Primer Numero");
    n1 = scanner.nextInt();

    System.out.println("Ingrese el Segundo Numero");
    n2 = scanner.nextInt();

    r = n1 + n2;
    System.out.println("El Resultado es: " + r);
    scanner.close();
    

    }
}
