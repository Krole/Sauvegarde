package io.steria.pox3.CD;


public class Chanson {
	private String name;
	private int length;
	
	
	public Chanson(String name, int duration) {
		this.name = name;
		this.length = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLength() {
		return length;
	}
	
	public void afficher(){
		System.out.println(name + " (" + length + "s.)");
	}
	

	@Override
	public String toString() {
		return "Chanson [name=" + name + ", length=" + length + "]";
	}

	

}
