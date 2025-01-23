package SelfTest;

public class SelfTest017 {
	public static void main(String[] args) {
		int [][]arr = new int[4][5];
		int data = 1;
		for(int ch = 0; ch <4; ch++) {
			for (int i = 0; i < 5; i++) {
				arr[ch][i] = data++;
			}
		}
		for(int ch = 0; ch <4; ch++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[ch][i] + "  ");
			}
			System.out.println("");
		}
	}
}
