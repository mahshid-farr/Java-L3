
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

/**
 * @author Mahshid farrahinia
 *
 */

public class testLab03 {

	@Test
	   public void minIntegerTest(){
		
			 int actualMinimumInt = -2147483648;
			 assertEquals (Lab03.minInteger(), actualMinimumInt);
		 }

	
	@Test
	   public void maximumDoubleTest(){
		
			 double actualDouble =  4.9E-324;
			 assertThat (Lab03.maximumDouble(),equalTo(actualDouble));
			
		 }
	
	
	@Test
	   public void rayleighTest(){
		
		     double expectedRayleigh = 0.06426387206239567;
		     double actualRayleigh   = Lab03.rayleigh(5, 8);
		     assertThat(actualRayleigh,equalTo (expectedRayleigh));		
		 }
	
	@Test
	   public void sortTest(){
		
		     List<Integer> list = Arrays.asList(5, 3, 10);
		     Lab03.sort(list);
			 List<Integer> expectedList = Arrays.asList(10, 5, 3);
			 assertEquals(list, expectedList);		
		 }
	
	@Test
	   public void frequencyTest(){
		
		     String color = "red";
		     ArrayList<String> list = new ArrayList<>();
		     list.add("black"); 
		     list.add("red"); 
		     list.add("green");
		     list.add("red"); 
		     list.add("white");
		     list.add("blue");
		     
		     int actualFrequencey = Lab03.frequency(list, color);
		     //assertThat(actualFrequencey, greaterThanOrEqualTo(2));
		     assertEquals(actualFrequencey, 2);
		 }
}
