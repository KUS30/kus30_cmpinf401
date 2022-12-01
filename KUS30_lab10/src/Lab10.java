public class Lab10 {
	public static int sumOfDigits(int x) {
		if(x == 0)
			return 0;
		return (x % 10) + sumOfDigits(x/10);
	}
	public static void printArrayElements(int a[], int index) {
		if(index == a.length - 1) {
			System.out.print(a[index]);
			return;
		}
		System.out.print(a[index] + " ");
		printArrayElements(a, index + 1);
	}
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if(out.length() / 3 == k)
			System.out.println("{" + out.substring(0, out.length() - 2) + "}");
		for(int i = startIndex; i < (startIndex + k); i++) {
			if(i > a.length - 1)
				break;
			printCombos(a, (out + a[i] + ", "), i + 1, k);
		}
	}
	public static void main(String[] args) {
		System.out.println(sumOfDigits(3413));
		int[] a = new int[] {2, 3, 7, 8, 9};
		printArrayElements(a, 0);
		System.out.println();
		printCombos(a, "", 0, 3);
	}
}
