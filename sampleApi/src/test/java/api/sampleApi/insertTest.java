package api.sampleApi;

import junit.framework.TestCase;

public class insertTest extends TestCase {

	public void testInsertinto() {
		insert i=new insert();
		boolean expected=false;
		boolean actual=i.insertinto();
		assertEquals(actual,expected);
		
		
	}

}
