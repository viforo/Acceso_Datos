package Ejercicios_Tema1_AccesoDatos;

import java.io.File;

public class Ej_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File carpetaActual = new File(".");
		
		if (carpetaActual.exists()) {
		
			System.out.println("El directorio existe");
		
		}else {
			System.out.println("El directorio no existe");
		}

	}

}
