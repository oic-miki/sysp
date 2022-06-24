import java.util.ArrayList;
import java.util.List;

import master.Shohin;

public class Hacchu {

	private List<Shohin> shohins = new ArrayList<Shohin>();
	
	public List<Shohin> shohins() {
		
		return shohins;
		
	}
	
	public List<Shohin> addShohin(final Shohin shohin) {
		
		shohins.add(shohin);
		
		return shohins;
		
	}
	
}
