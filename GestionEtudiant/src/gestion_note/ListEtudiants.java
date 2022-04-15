package gestion_note;

import java.util.ArrayList;

public class ListEtudiants extends  ArrayList<Etudiant> {
	(public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	public ListEtudiants filtrer(Condition c) {
		ListEtudiants e=new ListEtudiants();
		for (int i=0;i<this.size();i++) {
			if (c.estVrai(this.get(i)) {
				e.add(this.get(i));
				
			}
			
		}
		return e;
		
	}
	

}
