/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author camper
 */
public abstract class TarjetaJoven extends Tarjeta{
    
    public TarjetaJoven(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
    }
    
    @Override
    public double cuotaDeManejo(){
        return 50000-Descuento.Basico.getValorDescontado(valorApertura);
    }
}
