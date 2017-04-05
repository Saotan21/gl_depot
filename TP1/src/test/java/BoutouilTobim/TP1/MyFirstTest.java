package BoutouilTobim.TP1;

import java.util.logging.Logger;
import org.junit.*;

public class MyFirstTest
{
	private static Logger log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	int a, b;
	int compare_a = 10;
	int compare_b = 11;
	
	public MyFirstTest()
	{
		a = 5;
		b = 5;
	}
	
	void Afficher()
	{
		System.out.println("MFT : a = "+a+" b = "+b);
	}
	
	/* Méthodes de Tests d'assertions */
	@Test
	public void first_Test()
	{
		log.info("My First Test");
		Assert.assertTrue(true);
	}
	
	@Test
	public void second_Test()
	{
		log.info("My Second Test");
		Assert.assertTrue(false);
	}
	
	@Test
	public void third_Test()
	{
		log.info("My Third Test");
		Assert.assertEquals(compare_a, compare_b);
	}
	
	@Test
	public void fourth_Test()
	{
		log.info("My Fourth Test");
		Assert.assertTrue(a > b);
	}
}
