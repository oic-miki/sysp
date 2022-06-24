package master;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *  売上管理
 *  
 *  A 社での商品販売には、各店舗での商品販売である「店舗販売」と A 社の本社（以下、本社という）で
 *  取引先からの注文を受けて商品販売する「本社販売」の 2 種類がある。店舗販売では店舗のPOSレジで
 *  販売した POS レジ売上データを入力として売上情報の管理を行う。「本社販売」では取引先からの注文を
 *  受けて在庫確認し、有効在庫数（＝実在庫数－引当在庫数）を上限として受注する。
 *  受注した商品に対してすぐに店舗にある在庫商品の引当て（商品を確保すること）を行い、店舗から取引先に
 *  商品を発送する。また、店舗販売と本社販売の売上情報は一元管理し、検索・集計・分析を行う機能も実現する。
 *  
 */
class TorihikisakiTest {
	
	private static final long TEMPO_ID = 0L;

	@Test
	void testChumon() {
		
		// 取引先の作成
		final Torihikisaki torihikisaki = new Torihikisaki();
		// 本社の作成
		final Honsha honsha = new Honsha();
		// 店舗の作成
		final Tempo tempo = new Tempo(TEMPO_ID);
		// 倉庫の作成と店舗への追加
		tempo.addSoko(new Soko());
		// 商品の作成と倉庫への追加
		for (int value = 1000; value < 1100; value++) {
			
			tempo.shohinNyuka(new Shohin(
					// id
					value,
					// name
					"Shohin - " + value,
					// price
					value),
					// suryou
					value / 10);
					
		}
		
		// 取引先と本社を関連付け
		torihikisaki.addHonsha(honsha);
		
		// 1) 商品の注文
		assertEquals(5, torihikisaki.chumon().kensu());
		
	}

}
