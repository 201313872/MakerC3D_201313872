package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static int lab = 0;
    private static String c3d = "";
    private static String etT="";
    private static String etF="";
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        lab = 0;
        c3d = "";
        etT = "";
        etF = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static String generaLab(){
        return "l$"+lab++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }

    /**
     * @return the lab
     */
    public static int getLab() {
        return lab;
    }

    /**
     * @param aLab the lab to set
     */
    public static void setLab(int aLab) {
        lab = aLab;
    }

    /**
     * @return the etT
     */
    public static String getEtT() {
        return etT;
    }

    /**
     * @param aEtT the etT to set
     */
    public static void setEtT(String aEtT) {
        etT = aEtT;
    }

    /**
     * @return the etF
     */
    public static String getEtF() {
        return etF;
    }

    /**
     * @param aEtF the etF to set
     */
    public static void setEtF(String aEtF) {
        etF = aEtF;
    }
    
}
