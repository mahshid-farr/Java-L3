
import java.util.List;


public class Lab03 {


	private Lab03() {
		// empty by design
	}

	
	//description of the methods

    
     // minInteger() returns the minimum value that an int can represent
    public static int minInteger() {
    	int value = Integer.MIN_VALUE;
        return value;
    }
    
   
	// this method can return the minimum positive value greater than zero that a double can represent
	public static double maximumDouble() {
		double value = Double.MIN_VALUE;
		return value;
	}

//Part2
public static double rayleigh(double x, int sigma) {
		double y = (x / (sigma * sigma)) * Math.exp(-x * x / (2.0*(sigma * sigma)));
		return y;
	}

	
//part3

public static void sort(List<Integer> t) {
		if (t.size() != 3) {
			throw new IllegalArgumentException();
		}
		int a = t.get(0);
		int b = t.get(1);
		int c = t.get(2);
		if (a > b && a>c) {
			if (b>c) {
			t.set(0, a); t.set(1, b); t.set(2, c);}
			if (b<c) {
			t.set(0, a); t.set(1, c); t.set(2, b)	;
			}
		}
		
		if (b > a && b>c) {
			if (a>c) {
			t.set(0, b); t.set(1, a); t.set(2, c);}
			if (a<c) {
			t.set(0, b); t.set(1, c); t.set(2, a)	;
			}
		}
		
		if (c > a && c>b) {
			if (b>a) {
			t.set(0, c); t.set(1, b); t.set(2, a);}
			if (b<a) {
			t.set(0, c); t.set(1, a); t.set(2, b)	;
			}
		}
				
	}
	
	//Part4
	
	public static int frequency(List<String> t, String target) {
		
		int n = 0;
		for (String s : t) {
			if (s.equals(target)) {
				n++;
			}
		}
		return n;
	}
}