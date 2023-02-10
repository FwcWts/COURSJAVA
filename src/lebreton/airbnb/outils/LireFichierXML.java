package lebreton.airbnb.outils;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LireFichierXML {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Logements.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Racine du document : " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Appartement");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nElement : " + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Nom de l'appartement : " + eElement.getAttribute("name"));
                    System.out.println("Nom de l'hote : " + eElement.getElementsByTagName("nom").item(0).getTextContent());
                    System.out.println("Prenom de l'hote : " + eElement.getElementsByTagName("prenom").item(0).getTextContent());
                    System.out.println("Age de l'hote : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                    System.out.println("Tarif par nuit : " + eElement.getElementsByTagName("tarifParNuit").item(0).getTextContent());
                    System.out.println("Adresse : " + eElement.getElementsByTagName("adresse").item(0).getTextContent());
                    System.out.println("Superficie : " + eElement.getElementsByTagName("superficie").item(0).getTextContent());
                    System.out.println("Nombre de voyageurs maximum : " + eElement.getElementsByTagName("nbVoyageursMax").item(0).getTextContent());
                    System.out.println("Numero d'étage : " + eElement.getElementsByTagName("numeroEtage").item(0).getTextContent());
                    System.out.println("Superficie du balcon : " + eElement.getElementsByTagName("superficieBalcon").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            // quelles exceptions ?
            e.printStackTrace();
        }


        //Tout pareil pour les maisons


    }
}
