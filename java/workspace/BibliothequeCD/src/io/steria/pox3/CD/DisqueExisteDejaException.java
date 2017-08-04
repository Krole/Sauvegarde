package io.steria.pox3.CD;

public class DisqueExisteDejaException extends Exception {
	
	public DisqueExisteDejaException(Disque disqueEnErreur) {
		super ("Le disque "+ disqueEnErreur.getCodeBarre() +" existe déjà");
	}

}
