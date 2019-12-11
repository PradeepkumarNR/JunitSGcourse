
import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void should_truncate_A_while_A_inFrist2Postion() {

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void should_truncate_A_while_A_inFristPostion() {

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));

	}

	@Test
	public void should_truncate_A_while_A_is_not_present() {

		assertEquals("CDE", helper.truncateAInFirst2Positions("CDE"));

	}
	
	@Test
	public void should_truncate_A_while_A_is_in_lastPosition() {

		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));

	}
	
	@Test
	public void should_compare_firstandLast_2_characters_while_theyAre_different() {
	
	assertFalse( helper.areFirstAndLastTwoCharactersTheSame("ABCD"));

	}
	
	@Test
	public void should_compre_firstandLast_2_char_while_theyare_same() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
