package data.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BufferedReader keyIn;
    keyIn = new BufferedReader(new InputStreamReader(System.in));
    String choose = "";
    while (true) {

        System.out.println("\n[1] Choose 25 tweets.");
        System.out.println("[2] Choose 50 tweets.");
        System.out.println("[3] Choose 100 tweets.");
        System.out.print("Choose : ");

        try {
            choose = keyIn.readLine();
        } catch (IOException e) {

            System.out.println("Error");
        }
        
        TwitterDB Test1 = new TwitterDB();
        
        switch (choose) {
            case "1":
                Test1.tweetsRetrieve1();
                break;
            case "2":
                Test1.tweetsRetrieve2();
                break;
            case "3":
                Test1.tweetsRetrieve3();
                break;
            default:
                System.out.println("Error, please try again.");
                break;
        }
    }
    }

}
