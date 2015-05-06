/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin29;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author DAVID
 */
public class Fichero {
    Scanner scanner;
    String nomFich;
    String separador=",";
    String linea;
    

    public Fichero() {
        this.nomFich = "barquitos.txt";
    }
    
    public void fichBarcos(ArrayList<Barcos> listaB){
        try{
            Scanner sc = new Scanner(new File(nomFich)).useDelimiter(separador);
            while(sc.hasNextLine()){
                linea= sc.nextLine();
                String[] li=linea.split(",");
                for(int i=0;i<li.length;i+=4){
                    listaB.add(new Bcarga(li[1],Integer.parseInt(li[2]),Integer.parseInt(li[3]),Integer.parseInt(li[4])));
                }
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("merda");            
        }finally{
            scanner.close();
        }
    }
}
