package jump2java;

public class S4_08 {
	public static void main(String[] args) {
		int a = 20;
		int b = 50;
		int c = 100;
		int d = 65;
		int e = 75;
		int[] marks = {a, b, c, d, e};
		for(int i=0; i<5; i++) {
			if(marks[i]>=60) {
				System.out.println(i +1+"번째 합격");
			}
		}
	}

}
