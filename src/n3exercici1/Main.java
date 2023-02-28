package n3exercici1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import n3exercici1.noticies.Basquet;
import n3exercici1.noticies.F1;
import n3exercici1.noticies.Futbol;
import n3exercici1.noticies.Noticia;
import n3exercici1.noticies.Tenis;

public class Main {
	public static void main(String[] args) {
		int opcio;
		String nom;
		String dni;
		String titular;
		//Introduir noticia a un redactor
		String text;
		Noticia noticia;
		
		Scanner scanner = new Scanner(System.in);
		Redaccio redaccio = new Redaccio();

		Set<Redactor> redactors = redaccio.getRedactors();

		// Menú
		do {
			System.out.println("Trieu una de les següents opcions:");
			System.out.println("    1. Introduir redactor");
            System.out.println("    2. Eliminar redactor");
            System.out.println("    3. Introduir noticia a un redactor");
            System.out.println("    4. Eliminar noticia");
            System.out.println("    5. Mostrar totes les notícies per redactor");
            System.out.println("    6. Calcular puntuació de la noticia");
            System.out.println("    7. Calcular preu notícia");
            System.out.println("    0. Sortir");
            System.out.print((">> "));
            opcio = scanner.nextInt();

			switch (opcio) {
				case 0:
					// Sortir
					return;
				case 1:
					// Afegeix un nou redactor a la redacció
					System.out.print(" Nom: ");
					nom = scanner.nextLine();
					System.out.print(" DNI: ");
					dni = scanner.nextLine();
					redaccio.addRedactor(new Redactor(nom, dni));
					break;
				case 2:
					// Cerca redactor per DNI i l'esborra
					System.out.print(" Elimina per DNI: ");
					dni = scanner.nextLine();
					redaccio.removeRedactor(dni);
					break;
				case 3:
					//Introduir noticia a un redactor
					//String text;
					//Noticia noticia;

					// Cerca redactor per DNI
					System.out.print(" Redactor(DNI): ");
					dni = scanner.nextLine();
					Redactor redactor = redaccio.getRedactor(dni);
					// Afegeix una nova noticia al redactor demanat
					System.out.print(" Esport (futbol, bàsquet, tenis, F1, motociclisme): ");
					String esport = scanner.nextLine();


					if(esport.equals("futbol")) {
						System.out.print("Competició: ");
						String competicio = scanner.nextLine();

						System.out.print("Club: ");
						String club = scanner.nextLine();

						System.out.print("Jugador: ");
						String jugador = scanner.nextLine();

						System.out.print("Titular: ");
						titular = scanner.nextLine();

						noticia = new Futbol(titular, competicio, club, jugador);
						System.out.println("Text: ");
						text = scanner.nextLine();
						redactor.addNoticia(noticia);
						noticia.setText(text);
					} else if(esport.equals("bàsquet")) {
						System.out.print("Competició: ");
						String competicio = scanner.nextLine();

						System.out.print("Club: ");
						String club = scanner.nextLine();

						System.out.print("Titular: ");
						titular = scanner.nextLine();

						noticia = new Basquet(titular, competicio, club);
						System.out.println("Text: ");
						text = scanner.nextLine();
						redactor.addNoticia(noticia);
						noticia.setText(text);
					} else if(esport.equals("tenis")) {
						System.out.print("Competició: ");
						String competicio = scanner.nextLine();

						System.out.print("Tenista: ");
						String tenista = scanner.nextLine();

						String[] tenistes = new String[2];
						tenistes[0] = tenista;

						System.out.print("Titular: ");
						titular = scanner.nextLine();

						noticia = new Tenis(titular, competicio, tenistes);
						System.out.println("Text: ");
						text = scanner.nextLine();
						redactor.addNoticia(noticia);
						noticia.setText(text);
					} else if(esport.equals("F1")) {
						System.out.print("Escuderia: ");
						String escuderia = scanner.nextLine();

						System.out.print("Titular: ");
						titular = scanner.nextLine();

						noticia = new F1(titular, escuderia);
						System.out.println("Text: ");
						text = scanner.nextLine();
						redactor.addNoticia(noticia);
						noticia.setText(text);
					} else if(esport.equals("motociclisme")) {
						System.out.print("Equip: ");
						String escuderia = scanner.nextLine();

						System.out.print("Titular: ");
						titular = scanner.nextLine();

						noticia = new F1(titular, escuderia);
						System.out.println("Text: ");
						text = scanner.nextLine();
						redactor.addNoticia(noticia);
						noticia.setText(text);
					} else {
						System.out.println("La noticia a de pertanyer a una de les classificacions");
					}

					break;
				case 4:
					// Eliminar noticia a un redactor
					System.out.print("DNI del redactor: ");
					dni = scanner.nextLine();

					System.out.print("Titular de la noticia: ");
					titular = scanner.nextLine();

					redactor = redaccio.getRedactor(dni);
					Iterator<Noticia> it = redactor.getNoticies().iterator();

					while(it.hasNext()) {
						if(it.next().getTitular().equals(titular)) {
							it.remove();
						}
					}
					
					break;
				case 5:
					// Mostrar totes les noticies per redactor
					System.out.print("Redactor(DNI): ");
					dni = scanner.nextLine();
					redactor = redaccio.getRedactor(dni);

					for(Noticia n: redactor.getNoticies()) {
						System.out.println("- " + n.getTitular());
						System.out.println("    " + n.getText());
					}
					System.out.println("Presiona ENTER per continuar...");
					scanner.nextLine();
					break;
				case 6:
					// Calcular puntuació de la noticia
					System.out.println("Redactor(DNI): ");
					dni = scanner.nextLine();

					System.out.print("Titular de la noticia: ");
					titular = scanner.nextLine();

					redactor = redaccio.getRedactor(dni);
					it = redactor.getNoticies().iterator();

					while(it.hasNext()) {
						noticia = it.next();
						if(noticia.getTitular().equals(titular)) {
							noticia.calcularPuntuacioNoticia();
							System.out.println("Puntuació: " + noticia.getPuntuacio());
						}
					}
					System.out.println("Presiona ENTER per continuar...");
					scanner.nextLine();
					break;
				case 7:
					// Calcular preu de la noticia
					System.out.println("Redactor(DNI): ");
					dni = scanner.nextLine();

					System.out.print("Titular de la noticia: ");
					titular = scanner.nextLine();

					redactor = redaccio.getRedactor(dni);
					it = redactor.getNoticies().iterator();

					while(it.hasNext()) {
						noticia = it.next();
						if(noticia.getTitular().equals(titular)) {
							noticia.calcularPreuNoticia();
							System.out.println("Preu: " + noticia.getPreu());
						}
					}
					System.out.println("Presiona ENTER per continuar...");
					scanner.nextLine();
					break;
				default:
					// Continua a menú
			}
			
		} while(true);
	}
	

}
