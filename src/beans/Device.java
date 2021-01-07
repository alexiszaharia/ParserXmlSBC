/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Alexis
 */
public class Device {
    private String numeDevice;
    private String tipDevice;
    private int pret;
    private String magazin;
    private PlacaDeBaza placaDeBaza;
    private Procesor procesor;
    private PlacaVideo placaVideo;
    private MemorieRam memorieRam;
    private MemorieRom memorieRom;
    private Display display;

    public String getNumeDevice() {
        return numeDevice;
    }

    public void setNumeDevice(String numeDevice) {
        this.numeDevice = numeDevice;
    }

    public String getTipDevice() {
        return tipDevice;
    }

    public void setTipDevice(String tipDevice) {
        this.tipDevice = tipDevice;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getMagazin() {
        return magazin;
    }

    public void setMagazin(String magazin) {
        this.magazin = magazin;
    }

    public PlacaDeBaza getPlacaDeBaza() {
        return placaDeBaza;
    }

    public void setPlacaDeBaza(PlacaDeBaza placaDeBaza) {
        this.placaDeBaza = placaDeBaza;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public PlacaVideo getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }

    public MemorieRam getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(MemorieRam memorieRam) {
        this.memorieRam = memorieRam;
    }

    public MemorieRom getMemorieRom() {
        return memorieRom;
    }

    public void setMemorieRom(MemorieRom memorieRom) {
        this.memorieRom = memorieRom;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Device{" + "numeDevice=" + numeDevice + ", tipDevice=" + tipDevice + ", pret=" + pret + ", magazin=" + magazin + ", placaDeBaza=" + placaDeBaza + ", procesor=" + procesor + ", placaVideo=" + placaVideo + ", memorieRam=" + memorieRam + ", memorieRom=" + memorieRom + ", display=" + display + '}';
    }
}
