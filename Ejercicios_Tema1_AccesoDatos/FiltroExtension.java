package Ejercicios_Tema1_AccesoDatos;

import java.io.File;
import java.io.FilenameFilter;
import java.io.FilenameFilter;

		
		public class FiltroExtension implements FilenameFilter{
			String extension;
			
			FiltroExtension(String extension){
				this.extension=extension;
			}
			
				public boolean accept(File dir, String name) {
					return name.endsWith(extension);
			}
			
		}

	

