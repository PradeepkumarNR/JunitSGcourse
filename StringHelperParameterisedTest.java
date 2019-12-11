import static org.junit.Assert.*;

import java.security.Policy.Parameters;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)

public class StringHelperParameterisedTest {
	StringHelper helper = new StringHelper();

	private String input;
	private String expectedOutput;

	public StringHelperParameterisedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@org.junit.runners.Parameterized.Parameters
	public static Collection<String[]> testwithConditions() {

		String expectedOutputs[][] = { {"AACD","CD"}, {"ACD","CD"} };

		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void should_truncate_A_while_A_inFrist2Postion() {

		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));

	}

}
