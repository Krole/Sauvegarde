package com.sopra.pox3.base.object;

public class People {

	String name;
	int age;
	final static int maxAge = 122; //italique car est en statique. maxAge sera tjrs la classe People dans la permgen. Si on a john dans la heap, john.maxAge ira chercher dans la permgen.
	
	public People(String name, int age) {
		super();
		this.name = name; //si on enlève this, il va faire ref à celui qui est le + proche (donc dans les paramètres) alors qu'on fait ref à la globale
		this.age = age;
	}
	
	//int birthday (){		
	//	int increment = 1 ;
	//	return this.age + increment; //utilisation de variable présente dans le scope au dessus et scope présent
	//}
	
	int birthday(){		
		if (age < 120){
			int increment = 1 ;	
			if (age > 10){
				int increment2 = 1;
				return this.age + increment2;
			}else{
				return age + increment;
			}
			
		}
		
		return -1;
	}

	public String getName() {
		return name;
		
		
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
