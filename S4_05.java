package jump2java;

public class S4_05 {
	public static void main(String[] args) {
		int tree = 1;
		while(tree < 11) {
			System.out.println("나무를 "+ tree +"번 찍었습니다.");
			if(tree==10) {
				System.out.println("나무가 넘어갔습니다.");
			}
			tree++;
		}
	}
}
