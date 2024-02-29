package OddsOrEvenScannerVersion;

import java.util.Scanner;

public class OddsOrEvenAppScV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // variables
        int num;
        String msg;
        // objects
        OddsOrEvenScV OoEScV;
        OoEScV = new OddsOrEvenScV();
        // inputs
        System.out.println("Enter a number to see if odd or even:");
        num = sc.nextInt();
        // set
        OoEScV.setNum(num);

        // compute
        OoEScV.computeOoE();
        // get
        msg = OoEScV.getMsg();
        // output

        System.out.println(msg);

        // from stackoverflow as was giving me error that sc resource wasnt close, leak
        // of rss
        sc.close();

    }
}
