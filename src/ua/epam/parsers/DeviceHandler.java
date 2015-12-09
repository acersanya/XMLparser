package ua.epam.parsers;

import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DeviceHandler extends DefaultHandler {

	private Set<Device> devicesSet;
	private Device device = null;
	private Type currentType = null;
	private String currentElement = "";

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start parsing ...");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("end parsing ...");
	}

	@Override
	public void startElement(String namespace, String localName, String qName, Attributes attr) {
		currentElement = qName;
		if(currentElement.equals("Device")){
			device = new Device();
		//	device.se
		}
	}

	@Override
	public void endElement(String namespace, String localName, String qName) {
		
	}
	
	@Override
	public void characters(char []ch, int start, int end){
		String srt = new String(ch, start, end);
		System.out.println(srt);
	}

}
