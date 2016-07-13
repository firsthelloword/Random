
public class RandomIn {
	
	public static void main(String[] args) {
		System.out.println(getRandomIn(2, 10));
	}
	
	
	public static int getRandomIn(int a, int b) {
		return (int)(Math.random()* (b - a) + a);
	}
}


