/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg2.tp.pkg15.pkg06.pkg2020;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class Ex2TP15062020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double VL;
        
    Scanner enter= new Scanner (System.in);
    System.out.println ("Digite um valor: ");
    VL= enter.nextDouble();
    
    if (VL < 3)
         System.out.println ("O valor é menor que três");
    
    else
        System.out.println ("Valor Inválido");
        // TODO code application logic here
    }
    
}
