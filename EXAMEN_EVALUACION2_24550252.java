/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_evaluacion2_24550252;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class EXAMEN_EVALUACION2_24550252 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Piedra(1), papel(2) o tijera(3) :");
        int resusu;
        resusu = captu.nextInt();
       int piedra;
       piedra=1;
       piedra = captu.nextInt();
       int papel;
       papel=2;
       papel = captu.nextInt();
       int tijera;
       tijera=3;
      tijera = captu.nextInt();
      System.out.println("Elegiste: 1(piedra) 2(papel) 3(tijera):" + resusu);
       
       
       
       System.out.print("Turno del CPU");
        
        double rescpu;
        rescpu = Math.random();
        rescpu = captu.nextDouble();
        System.out.println("Eligio el CPU: " + rescpu);
        
      

    }
    
}
