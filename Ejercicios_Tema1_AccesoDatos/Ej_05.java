package Ejercicios_Tema1_AccesoDatos;
import java.io.File;
public class Ej_05 {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
		 
		 	File dir = new File(args[0]);
	        String ext = args[1];
	        String[] listaArchivos = dir.list(new FiltroExtension(ext));
	        
	        for(int i=0;i<listaArchivos.length;i++) {
	            System.out.println(listaArchivos[i]);
	        }
	        
	    }

	}


