package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Income;
import junit.framework.TestCase;

public class Income1 {
	
	

	
	@Test
	public void testGold() {
		Income i= new Income();
		i.goldPeMinut=9999;
		int g = i.Gold(50);
		
		int e = i.getGoldPeMinut()*50;
		System.out.println(g);
		System.out.println(e);
		assertEquals(e,g );
	}
	
	@Test
	public void testGoldKill(){
		Income inc =new Income();
		int gold = inc.getKillsGold();
		int expected = inc.GoldAfterKill(5);
		assertEquals(expected, 5*gold);
	}
	
	

}
