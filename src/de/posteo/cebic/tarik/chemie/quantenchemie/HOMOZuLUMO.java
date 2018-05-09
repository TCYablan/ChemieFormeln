/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.posteo.cebic.tarik.chemie.quantenchemie;

/**
 *
 * @author tarikcebic
 */
public class HOMOZuLUMO 
{   
    //Konstanten definieren
    //final bedeutet nicht überschreibbar
    //double = Kommazahl
  
    public static final double h = Math.pow(6.626, -34);
    public static final double m = Math.pow(9.11, -31);
    public static final double L = Math.pow(18,-10);
    
    
    //Formel definieren
    public static double anregungsformel(int n,double a)
    {
        return (Math.pow(h, 2)/(8*m*Math.pow(a, 2)))*(Math.pow(n+1, 2)-(Math.pow(n, 2)));
    }
    
    
}
