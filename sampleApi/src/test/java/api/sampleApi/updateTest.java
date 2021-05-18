package api.sampleApi;

import junit.framework.TestCase;

public class updateTest extends TestCase {

	public void testUpdateproduct() {
		update u=new update();
		boolean expected=false;
		boolean actual=u.updateproduct();
		assertEquals(expected,actual);
	}

}
