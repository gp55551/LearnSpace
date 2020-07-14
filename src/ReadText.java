
import org.xml.sax.SAXException;

import com.sun.media.sound.InvalidFormatException;

import javax.xml.parsers.*;
import java.io.*;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ReadText {

	public static String globalVar = null;

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		read_notepad("\\readTextValidation.txt", "ojectXpath", "Selenium");

	}

	public static void read_notepad(String path, String object, String data) {

		// we have to read text from file
		try {

			String userDirectory = System.getProperty("user.dir");
			FileReader fr1 = new FileReader(userDirectory + path);

			int i;
			while ((i = fr1.read()) != -1)
				System.out.print((char) i);

			/*
			 * if (text.contains(data)) { System.out.println(
			 * "Validation in Text file is successful"); } else {
			 * System.out.println("Validation in Text file is unsuccessful");
			 * 
			 * }
			 */

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
