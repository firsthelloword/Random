public class RandomBigChar {

	public static void main(String[] args) {
		System.out.println(getRandomIn('A', 'E'));
	}

	public static char getRandomIn(char a, char b) {
		return (char) (Math.random() * (b - a) + a);
	}

}
