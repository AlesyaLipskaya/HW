package w18;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\java\\idea\\HW\\src\\xmlParsing\\dom\\BookCatalog.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            Element rootElement = document.getDocumentElement();
            NodeList sonnetList = rootElement.getChildNodes();

            for (int i = 0; i < sonnetList.getLength(); i++) {
                Node sonnetNode = sonnetList.item(i);

                if (sonnetNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element sonnetElement = (Element) sonnetNode;

                    String type = sonnetElement.getAttribute("type");
                    System.out.println("Sonnet type: " + type);

                    NodeList authorList = sonnetElement.getElementsByTagName("author");
                    Element authorElement = (Element) authorList.item(0);

                    String lastName = authorElement.getElementsByTagName("lastName").item(0).getTextContent();
                    String firstName = authorElement.getElementsByTagName("firstName").item(0).getTextContent();
                    String nationality = authorElement.getElementsByTagName("nationality").item(0).getTextContent();
                    int yearOfBirth = Integer.parseInt(authorElement.getElementsByTagName("yearOfBirth").item(0).getTextContent());
                    int yearOfDeath = Integer.parseInt(authorElement.getElementsByTagName("yearOfDeath").item(0).getTextContent());

                    System.out.println("Author: " + firstName + " " + lastName);
                    System.out.println("Nationality: " + nationality);
                    System.out.println("Year of birth: " + yearOfBirth);
                    System.out.println("Year of death: " + yearOfDeath);

                    NodeList linesList = sonnetElement.getElementsByTagName("line");

                    for (int j = 0; j < linesList.getLength(); j++) {
                        Node lineNode = linesList.item(j);

                        if (lineNode.getNodeType() == Node.ELEMENT_NODE) {
                            Element lineElement = (Element) lineNode;
                            String line = lineElement.getTextContent();
                            System.out.println("Line " + (j + 1) + ": " + line);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
