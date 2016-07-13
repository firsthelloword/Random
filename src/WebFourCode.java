
import java.util.ArrayList;
import java.util.Collections;

/*
 * 2:生成4位网站验证码(要求用数组)     
 1 不能重复
 2 只能是数字和大小写字符, 但是不能包含1,0,o,O,l,L,Z,2,9,g

 */
public class WebFourCode {

	public static void main(String[] args) {

		String num = randomCode();
		System.out.println(num);
	}

	public static String randomCode() {
		String[] str = new String[] { "0", "1", "2", "3", "4", "5", "6", "7",
				"8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
				"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
				"W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z" };

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("1") || list.get(i).equals("0")
					|| list.get(i).equals("o") || list.get(i).equals("O")
					|| list.get(i).equals("l") || list.get(i).equals("L")
					|| list.get(i).equals("Z") || list.get(i).equals("2")
					|| list.get(i).equals("9") || list.get(i).equals("9")) {

				list.remove(i);
			}
		}
		Collections.shuffle(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		String s = sb.toString();
		String result = s.substring(5, 9);
		if (result.charAt(0) != result.charAt(1)
				&& result.charAt(0) != result.charAt(1)
				&& result.charAt(1) != result.charAt(2)) {
			return result;
		} else {
			System.out.println("相同了");
			return "";
		}

	}
}
