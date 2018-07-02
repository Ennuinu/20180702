
public class CallMethodExample1 {

	public static void main(String[] args) {
		countdown();
	}


	public static void countdown() {
		System.out.println("カウントダウンをします");
		for(int i=5; i >= 0; i--) {
			System.out.println(i);
		}

	}

}