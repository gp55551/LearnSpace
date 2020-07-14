package JavaCodes;

public class ArrayStrings_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arrayStringList[] = { "Gaurav", "GP", "Gaurav", "eBC", "Abcdf", "Gaurav1" };
		for (int i = 0; i < arrayStringList.length; i++) {
			System.out.println(arrayStringList[i]);
		}

		System.out.println("=================================================");

		String duplicate = null;
		int count = 0;
		for (int i = 0; i < arrayStringList.length; i++) {

			for (int j = i + 1; j < arrayStringList.length; j++) {

				if (arrayStringList[i].equals(arrayStringList[j])) {
					duplicate = arrayStringList[i];
					count++;

				}

				else {
					continue;
				}

				System.out.println(duplicate);
				System.out.println(count);
			}
			count = 0;

		}

	}
}
