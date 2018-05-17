/**
 * 
 */
package java_sax_parser;

import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * @author Aloy A Sen
 *
 */
public class Employee {
	public Employee(String name, int id, int age, String type) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
 
	  //first we need to parse an xml file to get its contents
		try {
			parseXmlFile();
		} catch (org.xml.sax.SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void parseXmlFile() throws org.xml.sax.SAXException, IOException{
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Vector myEmpls =new Vector();
		DocumentBuilder db = null;
		try {

			//Using factory get an instance of document builder
			db = dbf.newDocumentBuilder();
			
			//parse using builder to get DOM representation of the XML file
			


		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}
		//get the root element
				Element docEle = db.parse("./content.xml").getDocumentElement();
				
				//get a nodelist of elements
				NodeList nl = docEle.getElementsByTagName("Employee");
				if(nl != null && nl.getLength() > 0) {
					for(int i = 0 ; i < nl.getLength();i++) {

						//get the employee element
						Element el = (Element)nl.item(i);

						//get the Employee object
						Employee e = getEmployee(el);

						//add it to list
						myEmpls.add(e);
					}
				}
				
				//printing the employee details
				System.out.println("No of Employees '" + myEmpls.size() + "'.");

				Iterator it = myEmpls.iterator();
				while(it.hasNext()) {
					System.out.println(it.next().toString());
				}
	}
	public static Employee getEmployee(Element empEl) {

		//for each <employee> element get text or int values of
		//name ,id, age and name
		String name = getTextValue(empEl,"Name");
		int id = getIntValue(empEl,"Id");
		int age = getIntValue(empEl,"Age");

		String type = empEl.getAttribute("type");

		//Create a new Employee with the value read from the xml nodes
		Employee e = new Employee(name,id,age,type);

		return e;
	}
	private static String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}


	/**
	 * Calls getTextValue and returns a int value
	 */
	private static int getIntValue(Element ele, String tagName) {
		//in production application you would catch the exception
		return Integer.parseInt(getTextValue(ele,tagName));
	}
	

		
}
				

				
		
			
	
		
				
	
