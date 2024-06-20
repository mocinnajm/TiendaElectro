/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomestico;

/**
 *
 * @author mosin
 */
public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;
     
    public Lavadora (String marca,double potencia){
        super("Lavadora",marca,potencia);
        precio=0;
        aguaCaliente =false;
    
      }
        public Lavadora (String marca,double precio,double potencia,boolean aguaCaliente){
        
                 super ("Lavadora",marca,potencia);
                 this.precio=precio;
                 this.aguaCaliente=false;
                 
        }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

   

    @Override
    public String toString() {
        return "Lavadora{" + "marca="+getMarca() + ",potencia " +getPotencia() +
                " precio= " + precio + ", aguaCaliente= " + aguaCaliente + '}';
    }
        
    public double getConsumo(int horas){
        if(aguaCaliente){
        
          return horas*(getPotencia()+getPotencia()*0.20);
        
        }else{
            return horas*getPotencia();
        
          }
    
    
    
     }
       
        
    
    
    
}
