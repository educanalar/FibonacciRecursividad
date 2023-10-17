import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("POR FAVOR ESCRIBE UN NUMERO: ");
        numero = scanner.nextInt();
        scanner.close();
        for (int i = 0; i<numero; i++){
            System.out.print(" " + fibonnaci(i));
        }
    }
    public static int fibonnaci( int numero ){
        //caso base
        if((numero==0)|| numero==1)
            return numero;
        // llamada recursiva
        else
            return fibonnaci(numero -1) + fibonnaci(numero - 2);
    }
}