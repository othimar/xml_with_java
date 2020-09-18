import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;
import org.xml.sax.helpers.DefaultHandler;

public class Main{
    public static void main(String [] args){
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            ListHandler lHandler = new ListHandler();
            parser.parse("file_to_read.xml", lHandler);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}