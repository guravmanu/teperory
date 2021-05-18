package ondemand;

import junit.framework.TestCase;

public class OtherWishLisrTest extends TestCase {

	public void testGetOtherWishlist() {
		 OtherWishLisr o=new  OtherWishLisr ();
		 boolean expected=false;
		 boolean actual=o.getOtherWishlist();
		 assertEquals(expected,actual);
	}

}
