/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;
import Electrodomestico.Electrodomestico;
import Electrodomestico.Lavadora;
import com.sun.security.auth.NTDomainPrincipal;

/**
 *
 * @author mosin
 */
public class Tienda {

    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico("Horno","fagor",0.75);
        e1.setMarca("lg");
        e1.setPotencia(0.89);
        System.out.println(e1);
        double consum = e1.getConsumo(10);
        System.out.println("ha consumedo " + consum);
        double precio= 0.25;
        double costeConsum=e1.getCosteConsumo(10, precio);
        System.out.println("el coste de consumo es : " + costeConsum);
        
        Lavadora Lava1 = new Lavadora("okay",200,0.3,false);
        System.out.println(Lava1);
        Lava1.setAguaCaliente(true);
        System.out.println("el consumo de la lavadora en 10 horas " + Lava1.getConsumo(10));
        System.out.println("el coste de cunsumo es :" +Lava1.getCosteConsumo(10, 3));
    
    
    
    
    }
}
