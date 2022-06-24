package uriageKanri;
import java.util.HashMap;
import java.util.Map;

import master.Tempo;

public class UriageKanri {

	// Tempo ID, Tempo
	private final Map<Long, Tempo> tempos = new HashMap<Long, Tempo>();
	
	public UriageKanri() {
		
	}
	
	public Tempo addTempo(final Tempo tempo) {
		
		tempos.put(tempo.getId(), tempo);
		
		return tempo;
		
	}
	public int getUriage(final Long tempoId) {
		
		return tempos.get(tempoId).getUriage();
		
	}
	
	public int uriageShuukei() {
		
		int sum = 0;
		
		for (final Tempo tempo : tempos.values()) {
			
			sum += tempo.getUriage();
			
		}
		
		return sum;
		
	}
	
}
