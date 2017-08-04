package io.steria.pox.files;

import java.io.File;

public class Parcourir {
	
	public static void main(String[] args) {
		
		new Parcourir().parcourirRep("C:\\code\tools"); 
		

	}

	public void parcourirRep(String path) {

		File dir = new File(path);
		File[] filesList = dir.listFiles();

		if (dir.isDirectory()) {
			for (File file1 : filesList) {
				parcourirRep(file1.getAbsolutePath());
			}
		} else {
			System.out.println(path);
		}
	}

/*	public void lireFichier(String path) {

		File fileOpen = new File(path);
		FileInputStream fis;

		//fis = new FileInputStream(fileOpen);

	}*/

}
