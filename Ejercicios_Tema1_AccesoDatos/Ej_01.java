package Ejercicios_Tema1_AccesoDatos;
import java.io.File;

public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				File carpetaActual = new File(".");
				String[] listaArchivos = carpetaActual.list();
				
				System.out.println("Contenidos directorio: " + carpetaActual.getName());
				for(int i = 0; i < listaArchivos.length; i++) {
					System.out.println(listaArchivos[i]);
				}		

	}

}
