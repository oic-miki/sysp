package master;

public class Shohin {
	
	private int id;
	private String name;
	private int price;
	private int suryou;

	public Shohin(final int id, final String name, final int price) {
		
		this.id = id;
		setName(name);
		setPrice(price);
		
	}
	
	public int getId() {
		
		return id;
		
	}

	public String getName() {
		
		return name;
		
	}

	public void setName(final String name) {
		
		this.name = name;
		
	}

	public int getPrice() {
		
		return price;
		
	}

	public void setPrice(final int price) {
		
		this.price = price;
		
	}

	public int getSuryou() {
		
		return suryou;
		
	}

	public void setSuryou(final int suryou) {
		
		this.suryou = suryou;
		
	}
	
	@Override
	public boolean equals(final Object obj) {
		
		if (obj instanceof Shohin) {
			
			return ((Shohin) obj).getId() == id;
			
		}
		
		return false;
		
	}
	
	@Override
	public String toString() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append("\nid = ");
		str.append(id);
		str.append("\nname = ");
		str.append(name);
		str.append("\nprice = ");
		str.append(price);
		str.append("\nsuryou = ");
		str.append(suryou);
		
		return str.toString();
		
	}

}
