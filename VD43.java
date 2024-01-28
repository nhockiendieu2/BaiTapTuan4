/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author dacla
 */
public class VD43 {
    public static void main(String[] args) {
        try {
            // Tao doi tuong tu dia chi urrl
            URL url = new URL("https://www.google.com");
            
            // Mo ket noi den voi url''
            URLConnection uRLConnection = url.openConnection();
            
            // Doc du lieu tu ket noi
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(uRLConnection.getInputStream()));
            // Tao doi tuong ghi file
            FileWriter fileWriter = new FileWriter("file.html");
            // Doc tung dong
            String line;
            while ((line = reader.readLine()) != null) {                
                fileWriter.write(line +"\n");
                
            }
            // Dong luong
            reader.close();
            fileWriter.close(); // Dong file
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
