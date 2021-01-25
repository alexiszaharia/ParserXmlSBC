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
public class PlacaVideo {
    private String producatorPVideo;
    private String tipPVideo;
    private int memoriePVideo;
    private int frecventaPVideo;

    public String getProducatorPVideo() {
        return producatorPVideo;
    }

    public void setProducatorPVideo(String producatorPVideo) {
        this.producatorPVideo = producatorPVideo;
    }

    public String getTipPVideo() {
        return tipPVideo;
    }

    public void setTipPVideo(String tipPVideo) {
        this.tipPVideo = tipPVideo;
    }

    public int getMemoriePVideo() {
        return memoriePVideo;
    }

    public void setMemoriePVideo(int memoriePVideo) {
        this.memoriePVideo = memoriePVideo;
    }

    public int getFrecventaPVideo() {
        return frecventaPVideo;
    }

    public void setFrecventaPVideo(int frecventaPVideo) {
        this.frecventaPVideo = frecventaPVideo;
    }

    @Override
    public String toString() {
        return producatorPVideo + ", " + tipPVideo + ", " + memoriePVideo + ", " + frecventaPVideo;
    }
}
