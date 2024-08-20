/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author camper
 */
public enum Descuento {
    String Basico;
    private String Platino;
    private String Diamante;
    
    private double porcentaje;
    
    Descuento(doubleporcentaje){
    this.porcentaje = porcentaje;
}
    public double
            getValorDescontado(double monto){
                return monto*(1-porcentaje);
            }
}
