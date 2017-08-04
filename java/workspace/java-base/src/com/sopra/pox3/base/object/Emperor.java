package com.sopra.pox3.base.object;

import com.sopra.pox3.base.object.encapsulation.King;

public class Emperor extends King{

	public Emperor(String name) {
		super(name);
		
		People taleyran = new People("Taleyran", 54);
		this.command(taleyran);		
	}
	@Override
	protected void command(People p){
		System.out.println("My friend " + p.getName()+" please serve me  and do stuff");
	}
	
	
}
