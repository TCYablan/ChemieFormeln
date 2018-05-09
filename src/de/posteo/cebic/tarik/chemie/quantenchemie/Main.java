/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.posteo.cebic.tarik.chemie.quantenchemie;

import java.util.Scanner;

/**
 *
 * @author tarikcebic
 */
public class Main 
{
    public static String exitCode = "q";
    
    public static void main(String... args)
    {
        Scanner scanner = new Scanner(System.in); 
        while (true)
        {
            System.out.println("Nah? Etwas Anregung gefällig?");
            String next = scanner.next();
            
            System.out.println("n=?(int)");
           
            next = scanner.next(); exitIfWanted(next);
            Integer n = Integer.valueOf(next);
            
            System.out.println("a=?(Int)");
            
            next = scanner.next(); exitIfWanted(next);
            Double a = Double.valueOf(next);
            
            System.out.println("E="+HOMOZuLUMO.anregungsformel(n, a));
        }
      
    }
    
    public static void exitIfWanted(String input)
    {
         if (input.equalsIgnoreCase(exitCode))
            {
                System.exit(0);
            }
    }
}
