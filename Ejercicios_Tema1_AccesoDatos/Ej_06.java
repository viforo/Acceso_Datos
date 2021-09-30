package Ejercicios_Tema1_AccesoDatos;

import java.io.File;

public class Ej_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio = new File(args[0]);
		String extension = args[1];
		FiltroExtension filtro = new FiltroExtension(extension);
		String[] listaArchivos = directorio.list();
		
		if(args.length == 2) {
			listaArchivos = directorio.list(filtro);
			for(int i=0; i < listaArchivos.length; i++ ) {
			System.out.println(listaArchivos[i]);
			}
			
		}else {
			System.out.println("Indica la carpeta (anyadix un paràmetre)");
			
			for(String archivo : listaArchivos) {
				System.out.println(archivo);
				}
					
			}	
		}
			
			
	}

