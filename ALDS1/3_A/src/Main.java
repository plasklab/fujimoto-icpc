import java.util.Scanner;
import java.util.Stack;

// ALDS1_3_A
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		String str = sc.nextLine();
		int x, y;
		for (String s : str.split(" ")) {
			if (s.equals("+") || s.equals("-") || s.equals("*")) {
				switch (s) {
				case "+":
					y = st.pop();
					x = st.pop();
					st.push(x + y);
					break;
				case "-":
					y = st.pop();
					x = st.pop();
					st.push(x - y);
					break;
				case "*":
					y = st.pop();
					x = st.pop();
					st.push(x * y);
					break;
				}
			} else {
				st.push(Integer.parseInt(s));
			}
		}
		System.out.println(st.pop());
		sc.close();
	}
	public static void main(String[] args) {
		new Main().run();
	}
}