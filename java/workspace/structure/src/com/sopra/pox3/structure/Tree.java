package com.sopra.pox3.structure;

import java.util.List;
import java.util.ArrayList;

public class Tree {
	
	Node root;

}

class Node{
	
	List<Branch> branches = new ArrayList<>(); 
	//ne pas mettre arraylist avant le = car on dit qu'on veut pouvoir ajouter supprimer des éléments en 
	//utilisant pour l'instant un arraylist
	String value;
}

abstract class Branch{ //abstract pour empêcher la creation de la branche sans fin
	Node start;
}

class BranchWithNode extends Branch{
	Node end;
}

class BranchWithLeaf extends Branch{
	Leaf end;	
}

class Leaf{
	String value;
}

