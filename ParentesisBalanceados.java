package parentesisbalanceados;

import java.util.Scanner;
import java.util.Stack;

public class ParentesisBalanceados {
    // Esta funcion verifica si los parentesis estan balanceados
    public static boolean verificarBalance(String cadena) {
        Stack<Character> pila = new Stack<>();// Esta pila elimina parentesis de apertura
        for (char c : cadena.toCharArray()) {
            if (c == '(') {// Si el caracter es un paréntesis de apertura
                pila.push(c);// Empujarlo a la pila
            } else if (c == ')') {// Si el caracter es un paréntesis de cierre
                if (pila.isEmpty()) {
                    return false; //devuelve falso
                }
                pila.pop();
            }
        }

        return pila.isEmpty(); //Para que esto se cumpla la pila debe estar vacia
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        //bucle menu
        do {
            System.out.print("Ingrese una cadena con paréntesis o escriba salir para finalizar el programa: ");
            String cadena = scanner.nextLine();
            if (cadena.equalsIgnoreCase("salir")) {
                break; // Finalizar el bucle si el usuario ingresa 'salir'
            }
            // Mostrar el resultado con el parentesis verificado
            if (verificarBalance(cadena)) {
                System.out.println("Los paréntesis están balanceados.");
            } else {
                System.out.println("Los paréntesis no están balanceados.");
            }

        } while (true);

        System.out.println("Gracias por utilizar el programa :D");
        scanner.close();// Cerrar el scanner 
    }
}
