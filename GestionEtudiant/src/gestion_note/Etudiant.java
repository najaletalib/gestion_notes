package gestion_note;

import aiac.gi18.java.complexe.Complexe;

public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private double note;
	private String nom;
	public Etudiant (int id ,String nom){
		this.id=id;
		this.nom=nom;
		double note=10;
		
	}
	public double getnote() {
		return note;

		}
	public void setnote(double note) {
		return this.note=15;
	}
		
	}
	public String toString() {
		return "vnom est:"+this.nom+"vnote est :"+this.note;
	}
	public boolean equals(Object obj) {
		 if (! (obj instanceof Etudiant) {
			 return false;
		 }
		 return ((Etudiant)obj).id==this.id;
		
	}
	@Override
	public int compareTo (Etudiant o2) {
		if (o2.getnote()>this.note)
			return 1;
		
			
		
		return 0;
	}

}