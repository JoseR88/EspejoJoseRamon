package Test;

import static org.junit.Assert.*;

import Fecha.Fecha;

public class Test {
	Fecha f;
	@org.junit.Test
	public void test() {
		f=new Fecha(25,2,2000);
		assertEquals(true,f.valida());
		f=new Fecha(29,2,2000);
		assertEquals(true,f.valida());
		f=new Fecha(1,2,2000);
		assertEquals(true,f.valida());
		f=new Fecha(31,1,2000);
		assertEquals(true,f.valida());
		f=new Fecha(30,3,2000);
		assertEquals(true,f.valida());
		f=new Fecha(29,2,2001);
		assertEquals(false,f.valida());
		f=new Fecha(0,2,2001);
		assertEquals(false,f.valida());
		f=new Fecha(5,13,2001);
		assertEquals(false,f.valida());
		f=new Fecha(5,0,2001);
		assertEquals(false,f.valida());
		f=new Fecha(5,1,-1);
		assertEquals(false,f.valida());
		
		
	}

}
