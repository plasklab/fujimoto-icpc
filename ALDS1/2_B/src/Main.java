import java.util.Scanner;

// ALDS1_2_B
public class Main {
	void selectionSort(int[] array, int n) {
		int tmp, minj, count = 0;
		for (int i = 0; i < n; i++) {
			minj = i;
			for (int j = i; j < n; j++) {
				if (array[j] < array[minj]) minj = j;
			}
			if (minj != i) {
				tmp = array[i]; array[i] = array[minj]; array[minj] = tmp;
				count++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]);
			if (i < n - 1) System.out.print(" ");
		}
		System.out.println();
		System.out.println(count);
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		selectionSort(array, n);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}