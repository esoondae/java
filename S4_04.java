package jump2java;

public class S4_04 {
	public static void main(String[] args) {
		
		int month = 8;
		String monthString = "";
		switch (month) {
			case 1 : monthString = "1월";
				break;
			case 2 : monthString = "2월";
				break;
			case 3 : monthString = "3월";
				break;
			case 4 : monthString = "4월";
				break;
			case 5 : monthString = "5월";
				break;
			case 6 : monthString = "6월";
				break;
			case 7 : monthString = "7월";
				break;
			case 8 : monthString = "8월";
				break;
			default : monthString = "나머지 월";
		}
		System.out.println(monthString);
	}
}
