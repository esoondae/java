package jump2java;

public class S4_02 {
	public static void main(String[] args) {
		int money = 2000;
		boolean hasCard = true;
		
		if(money >= 3000 || hasCard == true) {
			System.out.println("택시를 타세요");
		} else {
			System.out.println("걸어가라");
		}
	}

}
