/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import sun.misc.IOUtils;

/**
 *
 * @author Jeison
 */
public class Archive {
    
   
   
    
    
    public void readTextFile(){
        BufferedReader br = null;
       
        try {
            InputStream fileIs = Archive.class.getResourceAsStream("Person.txt");
            br = new BufferedReader(new InputStreamReader(fileIs));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
            }
            
        } catch (IOException e) {
        } 
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
            }
        }
    }
    
    
    public void writeArchive(String content, String nameArchive) throws IOException{
        File file;
        file = new File("Person.txt");
        try (FileWriter fw = new  FileWriter(nameArchive,true)){
            fw.write(content);
        }catch (Exception e){
            System.err.println(e);
        }
    } 
    
}
