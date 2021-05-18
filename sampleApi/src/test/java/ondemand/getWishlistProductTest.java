package ondemand;

import junit.framework.TestCase;

public class getWishlistProductTest extends TestCase {

	public void testGetWishList() {
		getWishlistProduct g=new getWishlistProduct();
		boolean expected=false;
		boolean actual=g.getWishList();
		assertEquals(expected,actual);
		
	}

}
