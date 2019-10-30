/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk membuat kalkulator sederhana
 * 
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Kalkulator kalku = new Kalkulator();
        
        kalku.setValue1(7);
        kalku.setValue2(5);
        
        System.out.println("VALUE 1 = "+kalku.getValue1());
        System.out.println("VALUE 2 = "+kalku.getValue2());
        kalku.setNameProject();
        kalku.seNoteProject(kalku.toString());
        System.out.println("Result Add is = "+kalku.add(kalku.getValue1(), kalku.getValue2()));
        System.out.println("Result Minus is = "+kalku.minus(kalku.getValue1(), kalku.getValue2()));
        System.out.println("Result Multiple is = "+kalku.multiplication(kalku.getValue1(), kalku.getValue2()));
        System.out.println("Result Division is = "+kalku.division(kalku.getValue1(), kalku.getValue2()));
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
