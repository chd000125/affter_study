package SelfTest;

public class SelfTest016 {
public static void main(String[] args) {
	int[][] arr = new int[2][3];
	int data = 100;
	for (int f = 0; f < 2; f++) {
		for (int i = 0; i < 3; i++) {
			arr[f][i] = data++;
		}
		data = 200;
	}
	for (int f = 0; f < 2; f++) {
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[f][i] + "  ");
		}
		System.out.println("");
	}
	
}
}
