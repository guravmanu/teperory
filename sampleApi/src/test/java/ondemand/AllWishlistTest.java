package ondemand;

import junit.framework.TestCase;

public class AllWishlistTest extends TestCase {

	public void testGetWishList() {
		AllWishlist a=new AllWishlist();
		boolean expected=false;
		boolean actual=a.getWishList();
		assertEquals(expected,actual);
	}

}
