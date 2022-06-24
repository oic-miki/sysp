package master;

import transaction.Chumon;

public class Honsha {

	private Chumon chumon;
	
	public Chumon addChumon(final Chumon chumon) {
		
		this.chumon = chumon;
		
		return chumon;
		
	}
	
	@Override
	public String toString() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append("\nchumon = ");
		str.append(chumon);
		
		return str.toString();
		
	}
	
}
