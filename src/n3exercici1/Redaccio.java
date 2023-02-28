package n3exercici1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Redaccio {

	private Set<Redactor> redactors = new HashSet<>();


	public Redaccio() {}

	public Set<Redactor> getRedactors() {
		return redactors;
	}

	public Redactor getRedactor(String dni) {
		for(Redactor redactor: redactors) {
			if(dni.equals(redactor.getDni())) {
				return redactor;
			}
		}
		return null;
	}

	public void setRedactors(Set<Redactor> redactors) {
		this.redactors = redactors;
	}

	public void addRedactor(Redactor redactor) {
		redactors.add(redactor);
	}

	public void removeRedactor(String dni) {
		Iterator<Redactor> it = redactors.iterator();
		while(it.hasNext()) {
			String id = it.next().getDni();
			if(id.equals(dni)) it.remove();
		}
	}

}
