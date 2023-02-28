package n1exercici1;

public class Main {
	public static void main(String[] args) {

		/* L'accés a un membre estàtic provoca la càrrega del bloc estàtic d'inicialització
		 * en primera instància.
		 */
		System.out.println(Instrument.missatge);

		/* Una instància de classe també provoca la càrrega del bloc d'inicialització 
		 * si no ha estat carregat abans.
		 * */
		Vent trompeta = new Vent("Trompeta", 50.0);
		Corda guitarra = new Corda("Guitarra", 150.0);
		Percussio tambor = new Percussio("Tambor", 90.0);

		/* El mètode tocar es beneficia del polimorfisme per canviar el seu comportament 
		 * segons la classe que cridi el mètode.
		 * */
		trompeta.tocar();
		guitarra.tocar();
		tambor.tocar();

	}
}
