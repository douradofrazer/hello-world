/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;

/**
 *
 * @author Frazer
 */
public class CityGuide {
   
    public static void main (String args[]){
       
        int row,colum,y;
        
        row =1;
       do{
           colum=1;
           do
           {
               y =row*colum;
               System.out.print(" "+ y);
               colum+=1;
           }while(colum <=3);
           System.out.println("\n");
           row +=1;
       }while(row<=3);
    
}
    
}
