package transaction;

import java.util.HashMap;
import java.util.Map;

public class Chumon {
	
	// <商品ID, 数量>
	private final Map<Integer, Integer> naiyou = new HashMap<Integer, Integer>();

	/**
	 * 注文する商品を追加します。
	 * 
	 * @param shohinId 商品ID
	 * @param suryou 数量
	 */
	public void addShohin(final Integer shohinId, final Integer suryou) {
		
		naiyou.put(shohinId, suryou);
		
	}
	
	public int kensu() {
		
		return naiyou.size();
		
	}
	
	public int suryou(final Integer shohinId, final Integer suryou) {
		
		final Integer targetSuryou = naiyou.get(shohinId);
		if (targetSuryou != null) {
			
			return targetSuryou;
			
		}
		
		return 0;
		
	}
	
	@Override
	public String toString() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append("\nnaiyou -> ");
		str.append(naiyou);
		
		return str.toString();
		
	}
	
}
