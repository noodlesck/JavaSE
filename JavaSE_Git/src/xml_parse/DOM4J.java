package xml_parse;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Lynn
 *
 */
public class DOM4J {
    public static void main(String[] args){
    	//long lasting = System.currentTimeMillis();
    	try{
    	File f = new File("data.xml");
    	SAXReader reader = new SAXReader();
    	Document doc = reader.read(f);
    	Element root = doc.getRootElement();
    	Element foo;
    	for(Iterator i = root.elementIterator("VALUE");i.hasNext();){
    		foo = (Element)i.next();
    		System.out.print("���ƺ��룺"+foo.elementText("NO"));
    		System.out.println("������ַ��"+foo.elementText("ADDR"));
    	}
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
}
