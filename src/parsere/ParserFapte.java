/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsere;

import beans.Device;
import beans.Display;
import beans.MemorieRam;
import beans.MemorieRom;
import beans.PlacaDeBaza;
import beans.PlacaVideo;
import beans.Procesor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Alexis
 */
public class ParserFapte {

    public List<Device> parsareFapte(String caleXml) throws ParserConfigurationException, SAXException, IOException {
        List<Device> listaFapte = new ArrayList<>();

        File inputFile = new File(caleXml);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("device");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            
            Device device = new Device();
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
               
                device.setNumeDevice(getContinutElement(eElement, "nume_device"));
                device.setTipDevice(getContinutElement(eElement, "tip_device"));
                device.setPret(Integer.parseInt(getContinutElement(eElement, "pret")));
                device.setMagazin(getContinutElement(eElement, "magazin"));
                
                PlacaDeBaza placaDeBaza = new PlacaDeBaza();
                Element nodPlacaDeBaza = (Element) eElement.getElementsByTagName("placa_baza").item(0);
                placaDeBaza.setProducatorPBaza(getContinutElement(nodPlacaDeBaza, "producator_pbaza"));
                placaDeBaza.setModelPBaza(getContinutElement(nodPlacaDeBaza, "model_pbaza"));
                placaDeBaza.setChipset(getContinutElement(nodPlacaDeBaza, "chipset"));
                device.setPlacaDeBaza(placaDeBaza);
                
                Procesor procesor = new Procesor();
                Element nodProcesor = (Element) eElement.getElementsByTagName("procesor").item(0);
                procesor.setProducatorProcesor(getContinutElement(nodProcesor, "producator_procesor"));
                procesor.setTipProcesor(getContinutElement(nodProcesor, "tip_procesor"));
                procesor.setPerformantaProcesor(getContinutElement(nodProcesor, "performanta_procesor"));
                device.setProcesor(procesor);
                
                PlacaVideo placaVideo = new PlacaVideo();
                Element nodPlacaVideo = (Element) eElement.getElementsByTagName("placa_video").item(0);
                placaVideo.setProducatorPVideo(getContinutElement(nodPlacaVideo, "producator_pvideo"));
                placaVideo.setTipPVideo(getContinutElement(nodPlacaVideo, "tip_pvideo"));
                placaVideo.setMemoriePVideo(Integer.parseInt(getContinutElement(nodPlacaVideo, "memorie_pvideo")));
                placaVideo.setFrecventaPVideo(Integer.parseInt(getContinutElement(nodPlacaVideo, "frecventa_pvideo")));
                device.setPlacaVideo(placaVideo);
                
                MemorieRam memorieRam = new MemorieRam();
                Element nodMemorieRam = (Element) eElement.getElementsByTagName("memorie_RAM").item(0);
                memorieRam.setMemoriePRam(Integer.parseInt(getContinutElement(nodMemorieRam, "memorie_pram")));
                memorieRam.setVersiunePRam(getContinutElement(nodMemorieRam, "versiune_pram"));
                memorieRam.setFrecventaPRam(Integer.parseInt(getContinutElement(nodMemorieRam, "frecventa_pram")));
                device.setMemorieRam(memorieRam);
                
                MemorieRom memorieRom = new MemorieRom();
                Element nodMemorieRom = (Element) eElement.getElementsByTagName("memorie_ROM").item(0);
                memorieRom.setMemoriePRom(Integer.parseInt(getContinutElement(nodMemorieRom, "memorie_prom")));
                memorieRom.setTipRom(getContinutElement(nodMemorieRom, "tip_rom"));
                memorieRom.setInterfata(getContinutElement(nodMemorieRom, "interfata"));
                device.setMemorieRom(memorieRom);
                
                if (eElement.getElementsByTagName("display").getLength() != 0) {
                    Display display = new Display();
                    Element nodDisplay = (Element) eElement.getElementsByTagName("display").item(0);
                    display.setDiagonalaDisplay(Float.parseFloat(getContinutElement(nodDisplay, "diagonala_display")));
                    display.setFrecventaDisplay(Integer.parseInt(getContinutElement(nodDisplay, "frecventa_display")));
                    device.setDisplay(display);
                }
            }
            
            listaFapte.add(device);
         }

        return listaFapte;
    }
    
    public Object[] getAsVectObj(Device device) {
        Object[] vectorDevice = new Object[10];
        
        vectorDevice[0] = device.getNumeDevice();
        vectorDevice[1] = device.getTipDevice();
        vectorDevice[2] = device.getPret();
        vectorDevice[3] = device.getMagazin();
        vectorDevice[4] = device.getPlacaDeBaza().toString();
        vectorDevice[5] = device.getProcesor().toString();
        vectorDevice[6] = device.getPlacaVideo().toString();
        vectorDevice[7] = device.getMemorieRam().toString();
        vectorDevice[8] = device.getMemorieRom().toString();
        vectorDevice[9] = (device.getDisplay() != null) ? device.getDisplay().toString() : "-";
        
        return vectorDevice;
    }
    
    private String getContinutElement(Element element, String numeElement) {
        return element.getElementsByTagName(numeElement).item(0).getTextContent().trim();
    }
}
