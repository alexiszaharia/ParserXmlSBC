/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Alexis
 */
public enum Conditie {
    LESS_THEN("&lt;"), GREATER_THEN("&gt;");
    
    private String cond;
    
    private Conditie(String cond) {
        this.cond = cond;
    }

    public String getCond() {
        return cond;
    }
}
