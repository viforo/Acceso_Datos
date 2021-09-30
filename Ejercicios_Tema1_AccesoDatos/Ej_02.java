package Ejercicios_Tema1_AccesoDatos;

import java.io.File;

public class Ej_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File carpetaActual = new File(".");
		String[] listaArchivos = carpetaActual.list();
		
		System.out.println("Contenidos directorio: " + carpetaActual.getName());
		for(int i = 0; i < listaArchivos.length; i++) {
			System.out.println(listaArchivos[i]);
		}		
		
		File fichero = new File("Ejemplo.txt");
		System.out.println("Informaci�n del archivo");
		System.out.println("           ");
		System.out.println("Nombre: " + fichero.getName());
		System.out.println("Ruta:" + fichero.getPath());
		System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
		System.out.println("Se puede leer: " + fichero.canRead());
		System.out.println("Se puede escribir: " + fichero.canWrite());	
		System.out.println("Tama�o: " + fichero.length());
		
	}

}
