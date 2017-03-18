package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String T;
    private String F;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }

    /**
     * @return the T
     */
    public String getT() {
        return T;
    }

    /**
     * @param T the T to set
     */
    public void setT(String T) {
        this.T = T;
    }

    /**
     * @return the F
     */
    public String getF() {
        return F;
    }

    /**
     * @param F the F to set
     */
    public void setF(String F) {
        this.F = F;
    }

    /**
     * @param cad the cad to set
     */
    public void setCad(String cad) {
        this.cad = cad;
    }
        
}
