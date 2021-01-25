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
public class MemorieRam {
    private int memoriePRam;
    private String versiunePRam;
    private int frecventaPRam;

    public int getMemoriePRam() {
        return memoriePRam;
    }

    public void setMemoriePRam(int memoriePRam) {
        this.memoriePRam = memoriePRam;
    }

    public String getVersiunePRam() {
        return versiunePRam;
    }

    public void setVersiunePRam(String versiunePRam) {
        this.versiunePRam = versiunePRam;
    }

    public int getFrecventaPRam() {
        return frecventaPRam;
    }

    public void setFrecventaPRam(int frecventaPRam) {
        this.frecventaPRam = frecventaPRam;
    }

    @Override
    public String toString() {
        return memoriePRam + ", " + versiunePRam + ", " + frecventaPRam;
    }
}
