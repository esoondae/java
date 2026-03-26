package jump2java;

import java.util.ArrayList;

public class S4_03 {
	public static void main(String[] args) {
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("cellphone");
		pocket.add("money");
		boolean hasCard = true;
		
		if(pocket.contains("money")) {
			System.out.println("택시를 타고 가라");
		} else if(hasCard == true) {
			System.out.println("버스 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}

}
