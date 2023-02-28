package n3exercici1;

import java.util.HashSet;
import java.util.Set;

import n3exercici1.noticies.Noticia;

public class Redactor {
	private String nom;
	private final String DNI;
	private static double sou = 1500.0;

	private Set<Noticia> noticies = new HashSet<>();


	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.DNI = dni;
	}

	public void addNoticia(Noticia noticia) {
		noticies.add(noticia);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static double getSou() {
		return sou;
	}

	public static void setSou(double sou) {
		Redactor.sou = sou;
	}

	public String getDni() {
		return DNI;
	}

	public Set<Noticia> getNoticies() {
		return noticies;
	}

	public void setNoticies(Set<Noticia> noticies) {
		this.noticies = noticies;
	}


}
