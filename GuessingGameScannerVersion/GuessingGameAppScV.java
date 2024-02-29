package GuessingGameScannerVersion;

import java.util.Scanner;

public class GuessingGameAppScV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables
        int num;
        int start;
        String msg;

        // objects
        GuessingGameScV GG;
        GG = new GuessingGameScV();

        // Ask if start the game related
        System.out.println("Do you want to play? Enter 1 for start");
        start = sc.nextInt();

        // set
        GG.setStart(start);

        // compute
        GG.computeStart();

        // Game running
        System.out.println("Guess what number I got? From 1 to 10");
        num = sc.nextInt();
        // set
        GG.setStart(start);
        GG.setNum(num);

        // compute
        GG.computeGuessG();
        // get
        msg = GG.getMsg();
        // output
        System.out.println(msg);
        // }
        sc.close();
    }
}
