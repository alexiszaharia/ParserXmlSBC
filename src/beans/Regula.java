/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class Regula {

    //Deviceuri cu ssd si placa video de gaming, care se gaseste la altex
    public List<Device> regula1(List<Device> listDevice) {
        List<Device> listaRezultat = new ArrayList<>();

        for (Device device : listDevice) {
            if (device.getMemorieRom().getTipRom().equals("ssd") 
                    && device.getPlacaVideo().getTipPVideo().equals("gaming") 
                    && device.getMagazin().equals("altex")) {
                listaRezultat.add(device);
            }
        }

        return listaRezultat;
    }
    
    //Deviceuri care au mai putin de 1 TB memorie de stocare si au 32gb memorie RAM si sunt vandute de evomag
    public List<Device> regula2(List<Device> listDevice) {
        List<Device> listaRezultat = new ArrayList<>();

        for (Device device : listDevice) {
            if (device.getMemorieRom().getMemoriePRom() < 1024
                    && device.getMemorieRam().getMemoriePRam() == 32
                    && device.getMagazin().equals("evomag")) {
                listaRezultat.add(device);
            }
        }

        return listaRezultat;
    }
    
    //Deviceuri care au un pret cuprins intre 2000 si 3000 de lei si au un procesor si o placa video performanta
    public List<Device> regula3(List<Device> listDevice) {
        List<Device> listaRezultat = new ArrayList<>();

        for (Device device : listDevice) {
            if (device.getPret() < 3000 && device.getPret() > 2000
                    && (device.getProcesor().getTipProcesor().equals("h") 
                        || device.getProcesor().getTipProcesor().equals("hs"))
                    && device.getPlacaVideo().getTipPVideo().equals("gaming")) {
                listaRezultat.add(device);
            }
        }

        return listaRezultat;
    }
    
    //Laptopuri care au display de 15.6", dar nu au procesor de la firma amd
    public List<Device> regula4(List<Device> listDevice) {
        List<Device> listaRezultat = new ArrayList<>();

        for (Device device : listDevice) {
            if (device.getDisplay() != null 
                    && device.getDisplay().getDiagonalaDisplay() == 15.6
                    && !device.getProcesor().getProducatorProcesor().equals("amd")) {
                listaRezultat.add(device);
            }
        }

        return listaRezultat;
    }
    
    //Deviceuri office (procesor cu indicativ u si placa video multimedia) sub 3000 de lei
    public List<Device> regula5(List<Device> listDevice) {
        List<Device> listaRezultat = new ArrayList<>();

        for (Device device : listDevice) {
            if (device.getProcesor().getTipProcesor().equals("u")
                    && device.getPlacaVideo().getTipPVideo().equals("multimedia")
                    && device.getPret() < 3000) {
                listaRezultat.add(device);
            }
        }

        return listaRezultat;
    }
    
    //Laptopuri cu memorie de acces in timpul rularii aplicatiilor mai mare de 20 GB
    public List<Device> regula6(List<Device> listDevice) {
        List<Device> listaRezultat = new ArrayList<>();

        for (Device device : listDevice) {
            if (device.getPlacaVideo().getMemoriePVideo() + device.getMemorieRam().getMemoriePRam() > 20) {
                listaRezultat.add(device);
            }
        }

        return listaRezultat;
    }
}
