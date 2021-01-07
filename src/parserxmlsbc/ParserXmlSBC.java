/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parserxmlsbc;

import beans.Device;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import parsere.ParserFapte;

/**
 *
 * @author Alexis
 */
public class ParserXmlSBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caleXml = "C:\\Users\\Alexis\\Documents\\Proiecte personale\\Parser XML Interogari\\tema2.xml";
        
        ParserFapte parserFapte = new ParserFapte();
        List<Device> listDevice;
        
        try {
            listDevice = parserFapte.parsareFapte(caleXml);
            listDevice.forEach((Device t) -> {
                System.out.println(t.toString());
            });
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.err.println("Nu s-a putut parsa XML-ul pentru fapte! " + ex.getMessage());
        }
    }
    
}
