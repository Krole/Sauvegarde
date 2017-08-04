package io.steria.pox3.modelisation.computer;

public class DisqueDur {
	private int ddCapacity;

	public DisqueDur(int ddCapacity) {
		this.ddCapacity = ddCapacity;
	}

	void start() {
		System.out.println("Demarrage disque dur " + ddCapacity + " Go");

	}

	void read() {
		System.out.println("Lecture disque dur " + ddCapacity + " Go");
	}

	void switchOff() {
		System.out.println("Extinction disque dur" + ddCapacity + " Go");

	}

}
