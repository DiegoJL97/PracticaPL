/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapl;
import java_cup.runtime.*;
import java.io.*;
import java.util.Scanner;

public class PracticaPL {

    public static String nombre="";
    /**
     * @param argv the command line arguments
     */
    
    public static void main(String argv[]) throws java.io.IOException{
    	

                AnalizadorLexico lexico = null;
                try {
                	Scanner scan = new Scanner(System.in);
                	System.out.println("Introduzca el nombre del archivo que quiere probar: ");
                	String file = scan.nextLine();
                    lexico = new AnalizadorLexico(new java.io.FileReader(file));   
                    parser sintactico = new parser(lexico);
                    sintactico.parse();
                }
                catch (java.io.FileNotFoundException e) {
                    System.out.println("Archivo no encontrado.");
                }
                catch (java.io.IOException e) {
                    System.out.println("Error durante la lectura del archivo.");
                    e.printStackTrace();
                }
                catch (Exception e) {
                    System.out.println("Excepcion:");
                    e.printStackTrace();
                }

    }
} 