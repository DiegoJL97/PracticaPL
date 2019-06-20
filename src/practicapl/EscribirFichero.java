package practicapl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class EscribirFichero {
	
	private static String file;
	
	public EscribirFichero() {}
	
	public static void escribir(ArrayList<String> constantes,ArrayList<String> funciones,String libreria) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try {
        	String ficheroSinExtension = quitarExtension();
            fichero = new FileWriter(ficheroSinExtension+".c");
            pw = new PrintWriter(fichero);
            if(libreria != null) {
            	pw.println(libreria);
            	pw.println();
            }
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

	private static String quitarExtension() {
		String r = "";
		int n = 0;
		while(n < file.length() && file.charAt(n) != '.') {
			r = r + file.charAt(n);
			n = n+1;
		}
		return r;
	}

	public void setFile(String file) {
		this.file = file;
	}
	
}
