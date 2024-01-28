/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author dacla
 */
public class VD42 {
    
    public static void main(String[] args) {
        try {
            // Tao doi tuong lay dia chi
            URL url = new URL("https://www.google.com");
            
            // mo ket noi
            URLConnection uRLConnection = url.openConnection();
            
            // doc du lieu tu ket noi
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(uRLConnection.getInputStream()));
            // Doc tung dong
            String line;
            while ((line = reader.readLine())!=null) {
                System.out.println(line);
                
            }
            // Dong ket noi
            reader.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
