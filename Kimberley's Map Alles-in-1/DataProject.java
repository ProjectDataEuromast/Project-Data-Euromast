package data.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataProject {
    public static void main(String[] args) {
    BufferedReader keyIn;
    keyIn = new BufferedReader(new InputStreamReader(System.in));
    String choose = "";
    while (true) {
        System.out.println("\n[1] Choose 25 tweets.");
        System.out.println("[2] Choose weather.");
        System.out.print("Choose : ");

        try {
            choose = keyIn.readLine();
        } catch (IOException e) {

            System.out.println("Error");
        }
        
        TwitterDB twitterDB = new TwitterDB();
        weatherAPICurrent w = new weatherAPICurrent();
        
        switch (choose) {
            case "1":
                twitterDB.tweetsRetrieve1();
                break;
            case "2":
                w.run();
                break;
            default:
                System.out.println("Error, please try again.");
                break;
        }
    }
    }
}
