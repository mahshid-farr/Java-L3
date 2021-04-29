
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.*;


/**
 * @author Mahshid farrahinia
 *
 */
public class testClass {
	
	 @Before
	  public void setUp() throws Exception {
	  }
	 
	 @Test
      public void lengthTest(){
		 String sampleWord = "JUnitTesting";
		 int actualLength = sampleWord.length();
		 int excpetionLength = 12;
		 assertEquals (excpetionLength, actualLength);
	 }
	 
	 @Test
     public void charAtTest(){
		 String sampleSentence = "We are testing charAt";
		 char actualCharacterLocation0 = sampleSentence.charAt(0);
		 char excpetionLocation0 = 'W';
		 assertThat(actualCharacterLocation0, is (excpetionLocation0));
	 }
	 
	 @Test
     public void substringTest(){
		 String sampleWord = "Hamcrest";
		 String substring = sampleWord.substring(4, 8);
		 assertTrue(sampleWord.contains(substring));
	 }
	 
	 @Test
     public void indexofTest(){
		 String sampleText = "Testing index of method";
		 int indexOf = sampleText.indexOf("index");
		 assertThat(indexOf, greaterThan(0));
		
	 }


	 
}
