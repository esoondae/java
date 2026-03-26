package jump2java;

public class S4_06 {
	public static void main(String[] args) {
		int a = 0;
		while (a < 10) {
		    a++;
		    if (a % 2 == 1) {
		        continue;
		    }
		    System.out.println(a); 
		}

	}
}
