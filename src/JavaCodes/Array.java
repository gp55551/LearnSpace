package JavaCodes;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrayList[] = { 12, 2, 4, 34, 54, 1, 0, 55, 3, -11 };
		for (int i = 0; i < arrayList.length; i++) {
			System.out.println(arrayList[i]);
		}

		System.out.println("=================================================");

		for (int j = 0; j < arrayList.length; j++) {
			for (int k = j + 1; k < arrayList.length; k++) {
				int temp = 0;
				if (arrayList[j] > arrayList[k]) {
					temp = arrayList[k];
					arrayList[k] = arrayList[j];
					arrayList[j] = temp;
				}
			}
		}

		for (int i = 0; i < arrayList.length; i++) {
			System.out.println(arrayList[i]);
		}

		System.out.println("largest number: " + arrayList[arrayList.length - 1]);
		System.out.println("2nd largest number: " + arrayList[arrayList.length - 2]);

	}

}
