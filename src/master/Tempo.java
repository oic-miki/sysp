package master;

public class Tempo {

	private Long id;
	private Soko soko;
	
	public Tempo(final Long id) {
		
		this.id = id;
		
	}
	
	public Long getId() {
		
		return id;
		
	}

	public void addSoko(final Soko soko) {
		
		this.soko = soko;
		
	}
	
	public Shohin shohinNyuka(final Shohin shohin, int suryou) {
		
		soko.addShohin(shohin, suryou);
		
		return shohin;
		
	}
	
	public int zaiko(final Integer shohinId) {
		
		return soko.zaiko(shohinId);
		
	}
	
	public int getUriage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append("\nid = ");
		str.append(id);
		str.append("\nsoko = ");
		str.append(soko);
		
		return str.toString();
		
	}
	
}
