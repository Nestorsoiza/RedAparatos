package red.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SistemaSeguridadMenorPotenciaPrimero extends SistemaSeguridad {

	public SistemaSeguridadMenorPotenciaPrimero(Red red, Alarma alarma) {
		super(red, alarma);
	}

	@Override
	protected List<Aparato> getAparatos() {
		List<Aparato> aparatos = new ArrayList<>(getRed().getAparatos());
		Collections.sort(aparatos, Comparator.comparing(Aparato::getConsumoActual));
//		Collections.sort(aparatos, new Comparator<Aparato>() {
//
//			@Override
//			public int compare(Aparato o1, Aparato o2) {
//				return o1.getConsumoActual() - o2.getConsumoActual();
//			}
//
//		});
		return aparatos;
	}

}
