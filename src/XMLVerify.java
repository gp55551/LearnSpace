
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;

public class XMLVerify {

	public static String globalVar = null;

	public static void main(String[] args)
			throws ParserConfigurationException, SAXException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub

		fetchparticualrDataWithAttribute("employees.xml", 3, "employeeProfile", "name", "id", "111");
		//saddValueToExcel(globalVar);
	}

	public static String fetchparticualrDataWithAttribute(String xmlPath, int scenarios, String parentNode,
			String childNode, String attributeName, String attributeValue)
			throws ParserConfigurationException, SAXException, IOException, InvalidFormatException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse(new File(xmlPath));

		document.getDocumentElement().normalize();

		Element rootElement = document.getDocumentElement();
		System.out.println(rootElement.getNodeName());
		System.out.println("=========================================");

		NodeList nList = document.getElementsByTagName(parentNode);

		switch (scenarios) {
		// fetch all details of a node
		case 1:
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				System.out.println("Node Name : " + node.getNodeName());
				System.out.println("Child Nodes : " + node.getTextContent());
			}
			break;

		// fetch a particular child node value by giving the node name
		case 2:
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				Element eElement = (Element) node;
				System.out.println("Child Node name : "+childNode);
				System.out.println("Child Node value : "+eElement.getElementsByTagName(childNode).
						item(0).getTextContent());
			}
			break;

		// fetch attributes from a node
		case 3:
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node node = nList.item(temp);
				NamedNodeMap nodeMap1 = node.getAttributes();
				for (int i = 0; i < nodeMap1.getLength(); i++) {
					Node tempNode = nodeMap1.item(i);
					System.out.println("Attribute Name : " + tempNode.getNodeName());
					System.out.println("Attribute Value : " + tempNode.getNodeValue());
				}
			}
			break;
		}

		return globalVar;
	}

	public static void addValueToExcel(String value) throws InvalidFormatException, IOException {
		String path = System.getProperty("user.dir") + "\\Validation_Report.xlsx";

		FileInputStream inputStream = new FileInputStream(new File(path));
		org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheetAt(0);

		Object[][] value1 = { { value } };

		int rowNum = 1;
		System.out.println("Fetching excel");

		for (Object[] datatype : value1) {
			Row row = sheet.getRow(rowNum++);
			int colNum = 2;
			for (Object field : datatype) {
				Cell cell = row.createCell(colNum++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}

		try {
			FileOutputStream outputStream = new FileOutputStream(path);
			workbook.write(outputStream);
			outputStream.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Operation Complete");

	}

}
