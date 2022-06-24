package uriageKanri;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import master.Shohin;
import master.Tempo;

class UriageKanriTest {

	@Test
	void testUriage() {
		
		final UriageKanri uriageKanri = new UriageKanri();
		
		final Tempo tempo1 = uriageKanri.addTempo(new Tempo(1L));
		final Shohin shohin =
		tempo1.shohinNyuka(new Shohin(1, "洗濯機", 100000), 200);
		tempo1.shohinNyuka(new Shohin(1, "洗濯機", 100000), 30);
		
		// 在庫数の確認
		assertEquals(2, tempo1.zaiko(1));
		
//		final Hacchu hacchu = new Hacchu();
//		hacchu.addShohin(shohin);
//		tempo1.nohin(hacchu);
		
		/*
		 * 発注：
		 * 　発注ができた場合 true
		 * 　発注ができなかった場合 false
		 */
//		boolean hacchu(
//				// 商品ID
//				195,
//				// 発注数量
//				7,
//				// 納品先ID
//				98457);
//		
		// 売り上げの確認
		assertEquals(100000, tempo1.getUriage());
		
	}

	@Test
	void testUriageShuukei() {
		
		final UriageKanri uriageKanri = new UriageKanri();
//		uriageKanri.setUriage(12);
		
		assertEquals(12, uriageKanri.uriageShuukei());
		
	}

}
