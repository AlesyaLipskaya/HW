package hw18;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("input.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList firstNameList = doc.getElementsByTagName("firstName");
            Element firstNameElement = (Element) firstNameList.item(0);
            String firstName = firstNameElement.getTextContent();

            NodeList lastNameList = doc.getElementsByTagName("lastName");
            Element lastNameElement = (Element) lastNameList.item(0);
            String lastName = lastNameElement.getTextContent();

            NodeList titleList = doc.getElementsByTagName("title");
            Element titleElement = (Element) titleList.item(0);
            String title = titleElement.getTextContent();

            NodeList linesList = doc.getElementsByTagName("line");
            StringBuilder content = new StringBuilder();
            for (int i = 0; i < linesList.getLength(); i++) {
                Element lineElement = (Element) linesList.item(i);
                content.append(lineElement.getTextContent()).append("\n");
            }

            String fileName = firstName + "_" + lastName + "_" + title + ".txt";
            // Запись содержимого тегов line в другой документ
            // ...

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
