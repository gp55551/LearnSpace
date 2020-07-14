package JavaCodes;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arrayStringList[] = { "Gaurav1", "Abc", "ABC", "ABc", "Abcde", "Abcdf", "Gaurav" };
		for (int i = 0; i < arrayStringList.length; i++) {
			System.out.println(arrayStringList[i]);
		}

		System.out.println("=================================================");

		for (int j = 0; j < arrayStringList.length; j++) {
			for (int k = j + 1; k < arrayStringList.length; k++) {
				String temp = null;
				if (arrayStringList[j].compareTo(arrayStringList[k]) > 1) {
					temp = arrayStringList[k];
					arrayStringList[k] = arrayStringList[j];
					arrayStringList[j] = temp;
				}
			}
		}

		for (int i = 0; i < arrayStringList.length; i++) {
			System.out.println(arrayStringList[i]);
		}

	}

}
