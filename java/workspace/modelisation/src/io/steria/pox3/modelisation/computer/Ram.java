package io.steria.pox3.modelisation.computer;

public class Ram {
	private int ramCapacity;

	public Ram(int RamCapacity) {
		this.ramCapacity = RamCapacity;
	}

	void init() {
		System.out.println("Initialisation mémoire " + ramCapacity + " Go");
	}

	void switchOff() {
		System.out.println("Extinction mémoire vive");

	}

}
