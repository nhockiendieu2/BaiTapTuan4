/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptuan4;

import java.net.InetAddress;
import java.net.URL;

/**
 *
 * @author dacla
 */
public class VD41 {
    public static void main(String[] args) {
        try {
            // C1 tao doi tuong InetAđress bang ten may chu
            InetAddress dcByName = InetAddress.getByName("www.google.com");
            System.out.println("Dia chi IP: "+dcByName.getHostAddress());
            
            // C2 tao doi tuog Inetaddress bang dia chi ip
            InetAddress dcByID = InetAddress.getByName("172.217.31.4");
            System.out.println("Lay dia chi tu ip: "+dcByID.getHostAddress());
            
            // Phan 2
            InetAddress dcByName1 = InetAddress.getByName("www.vnexpress.net");
            System.out.println("Host Name: "+dcByName1.getHostName());
            System.out.println("Dia chi IP: "+ dcByName1.getHostAddress());
            
            // -------------
            
            InetAddress dcByName2 = InetAddress.getByName("www.vnexpress.net");
            // Kiem tra xem dia chi ip co phai v4 khong?
            boolean isIPv4 = dcByName2 instanceof java.net.Inet4Address;
            System.out.println("Co phai IPV4 Ko: "+isIPv4);
            // Kiem tra xem co phair ipv6 khong
            
            boolean isIPv6 = dcByName2 instanceof java.net.Inet6Address;
            System.out.println("Co phai ipv6 khong: "+isIPv6);
            
            // Create a URL object
            
            URL url = new URL("https://example.com/landing-page?utm_source=company-x&utm_medium=newsletter&utm_campaign=march_01&project-id=123");
            
            // Phan tich thong tin tu url
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Tham chieu: "+url.getRef());
            System.out.println("Truy Van: "+url.getQuery());
            
        } catch (Exception e) {
        }
    }
}
