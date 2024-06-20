/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomestico;

/**
 *
 * @author mosin
 */
public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "electrodomestico{" + "tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + " KW" + '}';
    }
    public double  getConsumo(int horas){
        return potencia * horas;
    
       }
    public double getCosteConsumo(int horas ,double costeHora){
            return costeHora *getConsumo(horas) ;
      }
    
}
