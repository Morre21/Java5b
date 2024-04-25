
/*
import java.util.ArrayList;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
    	ArrayList<Integer> mayores = new ArrayList<>();
    	System.out.print("Ingrese un num inicial: ");
        Scanner lector = new Scanner(System.in);
        int numIni = lector.nextInt(); //nextInt para que sea entero si o si
        
        System.out.println("Ingrese 20 enteros:");
        for (int i = 1; i < 21; i++) {
            int num = lector.nextInt();
            if (num > numIni) {
                mayores.add(num);
            }
        }

        // muestra foreach
        System.out.println("Los números mayores que " + numIni + " son:");
        for (int numMayor : mayores) {
            System.out.print(numMayor);
            System.out.println(",");
        }
        
        lector.close();
    }
}
*/