package master;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SokoTest {
	
	@Test
	void testAddShohin() {
		
		int id = 1;
		int price = 100;
		
		final Soko soko = new Soko();
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		
	}

	@Test
	void testZaiko() {
		
		int id = 1;
		int price = 100;
		
		final Soko soko = new Soko();
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		
		assertEquals(30, soko.zaiko(3));
		
	}

	@Test
	void testAcquireShohin() {
		
		int id = 1;
		int price = 100;
		
		final Soko soko = new Soko();
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		soko.addShohin(new Shohin(id, "Shohin-" + id, price), id++ * 10);
		
		assertEquals(3, soko.acquireShohin(3).getId());
		assertEquals(2, soko.acquireShohin(2).getId());
		assertEquals(1, soko.acquireShohin(1).getId());
		
	}

}
