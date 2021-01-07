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
public class MemorieRom {
    private String tipRom;
    private String interfata;
    private int memoriePRom;

    public String getTipRom() {
        return tipRom;
    }

    public void setTipRom(String tipRom) {
        this.tipRom = tipRom;
    }

    public String getInterfata() {
        return interfata;
    }

    public void setInterfata(String interfata) {
        this.interfata = interfata;
    }

    public int getMemoriePRom() {
        return memoriePRom;
    }

    public void setMemoriePRom(int memoriePRom) {
        this.memoriePRom = memoriePRom;
    }

    @Override
    public String toString() {
        return "MemorieRom{" + "tipRom=" + tipRom + ", interfata=" + interfata + ", memoriePRom=" + memoriePRom + '}';
    }
}
