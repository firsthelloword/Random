
public class RandomFloat {
	
	public static void main(String[] args) {
		
		System.out.println(getRandomIn(3, 10));
	}
	
	public static float getRandomIn(int a, int b) {
		return (float)(Math.random()* (b - a) + a);
	}
}
