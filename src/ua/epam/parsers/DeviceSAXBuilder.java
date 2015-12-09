package ua.epam.parsers;

import java.io.IOException;
import java.util.Set;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class DeviceSAXBuilder {
	private Set<Device> devices;
	private XMLReader reader;
	
	public DeviceSAXBuilder(){
		
	}
	
	
	public static void main(String[] args){
		SAXParserFactory parseF = SAXParserFactory.newInstance();
		DeviceHandler handler = new DeviceHandler();
		try {
			SAXParser saxparser = parseF.newSAXParser();
			try {
				saxparser.parse("DeviceSchema.xml", handler);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
	
}
