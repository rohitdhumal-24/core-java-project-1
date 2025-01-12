package Project;

import java.sql.SQLOutput;
import java.util.Scanner;

//-----------------------------------------------------> Presentation Layer <---------------------------------------------------------
public class PanAadharMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AadharService aadharService = new AadharService();
        PanService panService = new PanService();

        //Taking Input
        System.out.println("Enter the Aadhar Number : ");
        String Num = sc.nextLine();

        //getting the Aadhar from Service
        Aadhar aadhar = aadharService.getAadharByNumber(Num); // Give Aadhar num find from Aaadhar Service
        Pan pan = panService.getPanByNumber(Num);  // Give Aadhar num find from PAN Service ---> Because both Services has Aadhar num.
        if(aadhar != null && pan != null){
            System.out.println("Aadhar details : "+aadhar);
            System.out.println("Paan details : "+pan);
        }
        else{
            System.out.println("No Match found !!");
        }
    }
}
