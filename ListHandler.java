import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;


public class ListHandler extends DefaultHandler{
    boolean infosB = false;
    @Override
    public void startElement(String Uri, String localName, String qName, Attributes attributes) throws SAXException{
        if(qName.equalsIgnoreCase("Person")){
            String nom = attributes.getValue("nom");
            String age = attributes.getValue("age");
            System.out.println(nom+":"+age+"ans");
        }else if(qName.equalsIgnoreCase("Infos")){
            infosB = true;
        }
    }

    @Override
    public void characters(char ch[], int start, int lenght)throws SAXException{
        if(infosB){
            System.out.println("Warning: "+ new String(ch, start, lenght));
            infosB = false;
        }
    }
}