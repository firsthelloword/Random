public class RandomChar {

	
	
	public static void main(String[] args) {
		System.out.println(getRandomIn('a', 'd'));
	}
	public static char getRandomIn(char a, char b) {
		return (char) (Math.random() * (b - a) + a);
	}
}

