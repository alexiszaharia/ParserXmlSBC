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
public class PlacaDeBaza {
    private String producatorPBaza;
    private String modelPBaza;
    private String chipset;

    public String getProducatorPBaza() {
        return producatorPBaza;
    }

    public void setProducatorPBaza(String producatorPBaza) {
        this.producatorPBaza = producatorPBaza;
    }

    public String getModelPBaza() {
        return modelPBaza;
    }

    public void setModelPBaza(String modelPBaza) {
        this.modelPBaza = modelPBaza;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaDeBaza{" + "producatorPBaza=" + producatorPBaza + ", modelPBaza=" + modelPBaza + ", chipset=" + chipset + '}';
    }
}
