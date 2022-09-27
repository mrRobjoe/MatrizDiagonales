/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1arreglos;

/**
 *
 * @author Joharie Enríquez
 */
public class Tarea1Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializar variables
        int [][] matriz = new int [5][5]; 
        int cont = 1;
        int diagonal1 = 0;
        int diagonal2 = 0;
        
        //ciclo para llenar matriz y sumar diagonales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int sumaFyC= 0; //inicializar variable que sumará fila + columna.
                sumaFyC=i+j;
                matriz[i][j] = cont++;
                if (i == j) {//Si fila es == a columna sumar diagonal 1.
                    diagonal1 += matriz[i][j];
                } 
                if (sumaFyC==matriz.length-1) {//Si la suma de fila + columna es == al tamaño de la matriz-1, sumar diagonal 2.
                    diagonal2 += matriz[i][j];
                }
            }
        }
        
        //ciclos para imprimir la matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("     " + matriz[i][j]);
            }
            System.out.println("");          
        }
        
        //Imprimir resultados de sumas de diagonal 1 y diagonal 2.
        System.out.print("Suma de diagonal 1: " +diagonal1 + "\nSuma de diagonal 2: "+ diagonal2 +"\n");
    }
    
}
