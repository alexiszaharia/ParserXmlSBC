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
public class Procesor {
    private String producatorProcesor;
    private String tipProcesor;
    private String performantaProcesor;

    public String getProducatorProcesor() {
        return producatorProcesor;
    }

    public void setProducatorProcesor(String producatorProcesor) {
        this.producatorProcesor = producatorProcesor;
    }

    public String getTipProcesor() {
        return tipProcesor;
    }

    public void setTipProcesor(String tipProcesor) {
        this.tipProcesor = tipProcesor;
    }

    public String getPerformantaProcesor() {
        return performantaProcesor;
    }

    public void setPerformantaProcesor(String performantaProcesor) {
        this.performantaProcesor = performantaProcesor;
    }

    @Override
    public String toString() {
        return "Procesor{" + "producatorProcesor=" + producatorProcesor + ", tipProcesor=" + tipProcesor + ", performantaProcesor=" + performantaProcesor + '}';
    }
}
