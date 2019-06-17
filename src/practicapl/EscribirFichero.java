package practicapl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EscribirFichero {
	
	private ArrayList<String> constantes = new ArrayList<>();
	private ArrayList<String> funciones = new ArrayList<>();
	
	public EscribirFichero(ArrayList<String> constantes,ArrayList<String> funciones) {
		this.constantes = constantes;
		this.funciones = funciones;
		FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("salida.c");
            pw = new PrintWriter(fichero);
            for(int i=0; i<constantes.size();i++){
 				pw.println(constantes.get(i));
 			} 
 			pw.println();
			for(int i=0; i<funciones.size();i++){
				pw.println(funciones.get(i)); 
				pw.println();
			}
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}

}
