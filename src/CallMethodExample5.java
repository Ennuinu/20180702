
public class CallMethodExample5 {

	public static void main(String[] args) {
		countdown(7,3);
	}

	public static void countdown(int start, int end) {
		System.out.println("1つ目の引数で受け取った値:" + start);
		System.out.println("2つ目の引数で受け取った値:" + end);
		System.out.println("カウントダウンします");
		for(int i = start; i >= end; i--) {
			System.out.println(i);
		}

	}

}
