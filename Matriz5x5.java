/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz5x5;

/**
 *
 * @author juanf
 */import java.util.Scanner;
public class Matriz5x5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de la matriz 5x5 de enteros
        try ( // Objeto Scanner para leer entrada por consola
                Scanner sc = new Scanner(System.in)) {
            // Declaración de la matriz 5x5 de enteros
            int[][] matriz = new int[5][5];
            // Sección de ingreso de datos
            System.out.println("=== INGRESO DE VALORES PARA MATRIZ 5x5 ===");
            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    System.out.print("Ingrese valor para posición [" + fila + "][" + columna + "]: ");
                    matriz[fila][columna] = sc.nextInt();
                }
            }   // Sección de visualización de la matriz
            System.out.println("\n=== MATRIZ 5x5 INGRESADA ===");
            for (int fila = 0; fila < 5; fila++) {
                for (int columna = 0; columna < 5; columna++) {
                    // Formateo para que la tabla se vea ordenada (incluso con números de varios dígitos)
                    System.out.printf("%4d", matriz[fila][columna]);
                }
                // Salto de línea después de cada fila
                System.out.println();
            }
            // Cerrar el Scanner para liberar recursos
        }
    }
}
    
    

