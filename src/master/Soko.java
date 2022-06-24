package master;
import java.util.HashMap;
import java.util.Map;

public class Soko {
	
	/**
	 * <商品, 数量>
	 */
	private Map<Shohin, Integer> shohinZaikoMap = new HashMap<Shohin, Integer>();
	
	/**
	 * 商品を追加します。
	 * 
	 * @param shohin 商品
	 * @param suryou 数量
	 * @return 商品
	 */
	public Shohin addShohin(final Shohin shohin, int suryou) {
		
		final Shohin targetShohin = acquireShohin(shohin.getId());
		if (targetShohin != null) {
			
			shohinZaikoMap.put(shohin, zaiko(shohin.getId()) + suryou);
			
		} else {
			
			shohinZaikoMap.put(shohin, suryou);
			
		}
		
		return shohin;
		
	}
	
	public int zaiko(final Integer shohinId) {
		
		return shohinZaikoMap.get(acquireShohin(shohinId));
		
	}
	
	public Shohin acquireShohin(final Integer shohinId) {
		
		for (final Shohin targetShohin : shohinZaikoMap.keySet()) {
			
			if (targetShohin.getId() == shohinId) {
				
				return targetShohin;
				
			}
			
		}
		
		// TODO
		// 例外処理の実装
		return null;
		
	}

	@Override
	public String toString() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append("\nshohinZaikoMap -> ");
		str.append(shohinZaikoMap);
		
		return str.toString();
		
	}
	
}
