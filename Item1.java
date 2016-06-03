package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Item;
import junit.framework.TestCase;

public class Item1 {

	
	
	
	
	Item i1 = new Item("Rabadon",3150);

	@Test
	public void testGresit() {
		try{
			Item i = new Item("0000",-3150);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	//right
	@Test public void testNumeCorect(){
		
		
		try{
			assertEquals("Rabadon",i1.getNumeItem());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//right
	@Test 
	public void testPretCorect(){
		try{
			assertEquals(3150,i1.getItemPret());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testNume(){
		try{
			
			Item j=new Item();
			j.setNumeItem("Rabadon");
			System.out.println(j.getNumeItem());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testPret(){
		try{
			Item j1 = new Item();
			j1.setItemPret(-3150);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	//null
	@Test
	public void Null(){
		try{
			Item y = null;
			assertNull(y);
			fail("ceva");
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	//nume schimbat
	@Test
	public void testNumeSchimbat(){
		try{
			Item u = new Item("Rilay",2800);
			u.setNumeItem("Rabadon");
			assertEquals("Rabadon", u.getNumeItem());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//fail la setter
	@Test 
	public void testPretGresit(){
		int pret = -100;
		try{
			Item v = new Item("Rabadon",pret);
			fail("Pretul nu poate fi negativ");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//pret limita
	@Test
	public void testPretLimita(){
		
		try{
			Item l = new Item("Randuin Omen",6000);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	

	
	

		
		
	}
