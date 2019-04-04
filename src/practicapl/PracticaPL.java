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
     * @throws InterruptedException 
     */
    
    public static void main(String argv[]) throws java.io.IOException, InterruptedException{
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Introduce el numero de casos de prueba: ");
    	int casosPrueba = Integer.parseInt(scan.nextLine());
	    AnalizadorLexico lexico = null;
	    
	    while(casosPrueba > 0){
	    	
	    	try {
		    	System.out.println("Introduzca el nombre del archivo que quiere probar: ");
		    	String file = scan.nextLine();
		        lexico = new AnalizadorLexico(new java.io.FileReader(file));   
		        parser sintactico = new parser(lexico);
		        sintactico.parse();
		        System.out.println("Fichero sintácticamente correcto");
		    }
		    catch (java.io.FileNotFoundException e) {
		        System.out.println("Archivo no encontrado.");
		    }
		    catch (java.io.IOException e) {
		        System.out.println("Error durante la lectura del archivo.");
		        e.printStackTrace();
		    }
		    catch (Exception e) {
		        e.printStackTrace();
		    }
	    	casosPrueba -= 1;
	    	Thread.sleep(200);
	    	
	    }
    }
} 