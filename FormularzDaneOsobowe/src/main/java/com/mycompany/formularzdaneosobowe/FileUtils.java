/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formularzdaneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dzemor
 */
class FileUtils {
    private String file_name = "DaneOsobowe.csv";
    public void saveToFIle(String text){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
        }catch(IOException ex){
            System.out.println("Blad: "+ex.toString());
        }
}}
