package api.sampleApi;

import junit.framework.TestCase;

public class deleteTest extends TestCase {

	public void testDeleteproduct() {
		 delete d=new  delete ();
		 boolean expected=false;
		 boolean actual=d.deleteproduct();
		 assertEquals(actual,expected);
	}

}
