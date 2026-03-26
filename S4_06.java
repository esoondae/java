package jump2java;

public class S4_06 {
	public static void main(String[] args) {
		
		int money = 10000;
		int coffee = 2;
		
		while(money>3000) {
			System.out.println("커피 드립니다.");
			coffee--;
			money -= 3000;
			if(coffee == 0) {
				break;
			}
		}
		System.out.println("남은 잔돈은 "+ money + "원 입니다.");
	}
}
