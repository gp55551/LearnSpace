
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.util.Arrays;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import net.lingala.zip4j.core.ZipFile;

public class XMLValidationToolbox {

	public static String globalVar = null;
	public static final String USER_HOME = "user.home";
	public static final String DOWNLOADS = "\\Downloads\\";
	public static final String FILE_EXISTS = "File exists";
	public static final String ZIP_EXISTS = "Zip Folder Exists";

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub

		extractFilesZipFile();
		fetchparticualrDataWithAttribute("tasks:taskcard",
				"code;description;docStatus");
	}

	
	/*
	 * this method will extract and try to fetch the xml file required for
	 * validation
	 */
	public static void extractFilesZipFile() {

		try {
			String downloadsFilePath = System.getProperty(USER_HOME) + DOWNLOADS ;

			File fileFirst;
			File folder = new File(downloadsFilePath);
			FileFilter fileFilter = new WildcardFileFilter("*.zip");
			File[] files = folder.listFiles(fileFilter);
			System.out.println("Just taking the latest zip file...");
			if (files.length > 0) {
				Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
				fileFirst = files[0];
				ZipFile zFile = new ZipFile(fileFirst);
				zFile.extractAll(downloadsFilePath);
				System.out.println("Extraction Successful...");

			}
				
			
		} catch (Exception e) {

			// String screenpath = take_Screenshot();
			// fail("Fail to extract the files from zip", screenpath);
			// Logging.LOGGER.severe(EXCEPTION_CAUGHT + e.getMessage());
			// return Constants.KEYWORD_FAIL + " - Could not extract files from
			// zip";
		}
		// pass("Files are extracted from zip successfully");
		// return Constants.KEYWORD_PASS;
	}
	

	/*
	 * this method will verify the attributes of a node present in the xml file.
	 * 
	 * input : xml path, Node name, Attribute name
	 * output : attribute values
	 */
	public static String fetchparticualrDataWithAttribute(String parentNode, String attributeName)
			throws ParserConfigurationException, SAXException, IOException, InvalidFormatException {

		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			System.out.println("Fetching the XML file...");
			String downloadsFilePath = System.getProperty(USER_HOME) + DOWNLOADS ;
			File fileFirst = null;
			File folder = new File(downloadsFilePath);
			FileFilter fileFilter = new WildcardFileFilter("*.xml");
			File[] files = folder.listFiles(fileFilter);
			if (files.length > 0) {
				/** The newest file comes first **/
				Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
				fileFirst = files[0];

				Document document = builder.parse(fileFirst);
				System.out.println("XML file found...");
				Element rootElement = document.getDocumentElement();
				System.out.println(rootElement.getNodeName());
				System.out.println("=========================================");

				NodeList nList = document.getElementsByTagName(parentNode);
				String arr[] = attributeName.split(";");
				int i1;
				for (int temp = 0; temp < nList.getLength(); temp++) {
					Node node = nList.item(temp);
					NamedNodeMap nodeMap1 = node.getAttributes();
					for (int i = 0; i < nodeMap1.getLength(); i++) {
						Node tempNode = nodeMap1.item(i);
						for (i1 = 0; i1 < arr.length; i1++) {
							if (tempNode.getNodeName().equalsIgnoreCase(arr[i1])) {
								System.out.println("Node Name : " + node.getNodeName());
								System.out.println("Attribute Name : " + tempNode.getNodeName());
								System.out.println("Attribute value : " + tempNode.getNodeValue());
							}
						}

					}
				}

			}
		}

		catch (DOMException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("...  XML validation Successful  ...");
		return globalVar;

	}

}
