import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

// ALDS1_3_D
public class Main {
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		for (String s : str) {
			switch(s) {
			case "\\":
				break;
			case "/":
				break;
			case "_":
				break;
			default:
				break;
			}
		}
		System.out.println("総面積");
		System.out.println("水たまりの数 面積（全て）");
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}
