package io.steria.pox3.modelisation.computer;

public class Computer {
	private String model;
	private Ram memoireVive;
	private DisqueDur[] disqueDur;

	public Computer(String model, int capaciteMemoireVive, int [] capacitesDisquesDurs) {
		this.model = model;
		this.memoireVive = new Ram (capaciteMemoireVive);
		this.disqueDur = new DisqueDur[capacitesDisquesDurs.length];
		for (int i = 0; i < capacitesDisquesDurs.length; i++) {
			disqueDur  [i] = new DisqueDur(capacitesDisquesDurs[i]);
		}
	}

	public void start() {
		System.out.println("L'ordinateur démarre");
		if (memoireVive== null){
			System.out.println("Arg no memory");
			return;
		}
		this.memoireVive.init();

		System.out.println("Demarrage des disques durs");

		for (int i = 0; i < disqueDur.length; i++) {
			disqueDur[i].start();
		}
		if (disqueDur.length<0){
			disqueDur[0].read();			
			System.out.println("Ordinateur en service");
		}else{
			System.out.println("Please insert a boot disk and press a key to continue");
		}
	}

	public void switchOff() {
		System.out.println("Extinction disques durs");
		for (int i = disqueDur.length-1; i >= 0 ; i--) {
			disqueDur[i].switchOff();
		}
		System.out.println("Les disques durs sont eteints");
		this.memoireVive.switchOff();
		System.out.println("Ordinateur eteint");

	}

}
