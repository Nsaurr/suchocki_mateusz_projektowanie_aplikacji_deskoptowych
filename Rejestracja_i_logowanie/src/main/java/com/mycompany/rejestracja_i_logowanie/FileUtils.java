/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rejestracja_i_logowanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dzemor
 */
class FileUtils {
    private String file_name = "sekretnehasla.csv";
    public void saveToFIle(String text){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
        }catch(IOException ex){
            System.out.println("Blad: "+ex.toString());
        }
    }
    public boolean readFromFile(String text1, char[] text2){
        boolean zwrot = false;
        try {
            File plik = new File("sekretnehasla.csv");
            Scanner sc = new Scanner(plik);
            int lineNum = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] splitted = line.split(":");
                List<String> lista = Arrays.asList(splitted);
                lineNum++;
                if(lista.contains(text1) && lista.contains(text2)) { 
                    zwrot = true;
                }
            }
            }catch(FileNotFoundException ex) { 
                System.out.print("Blad: "+ex.toString());
            }
        return zwrot;
    }
}
