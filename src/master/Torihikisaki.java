package master;

import transaction.Chumon;

public class Torihikisaki {

	private Honsha honsha;
	
	/**
	 * 本社と関連付けします。
	 * 
	 * @param honsha 本社のオブジェクト
	 */
	public void addHonsha(final Honsha honsha) {
		
		this.honsha = honsha;
		
	}
	
	public Chumon chumon() {
		
		// 注文の作成
		final Chumon chumon = new Chumon();
		// 商品ID
		int shohinId = 1000;
		// 注文数量
		int chumonSuryou = 1;
		
		// 商品の追加
		chumon.addShohin(shohinId++, chumonSuryou++);
		chumon.addShohin(shohinId++, chumonSuryou++);
		chumon.addShohin(shohinId++, chumonSuryou++);
		chumon.addShohin(shohinId++, chumonSuryou++);
		chumon.addShohin(shohinId++, chumonSuryou++);
		
		return honsha.addChumon(chumon);
		
	}

	@Override
	public String toString() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append("\nhonsha = ");
		str.append(honsha);
		
		return str.toString();
		
	}
	
}
