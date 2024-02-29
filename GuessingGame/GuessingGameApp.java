package GuessingGame;

import javax.swing.JOptionPane;

public class GuessingGameApp {
    public static void main(String[] args) {
        // variables
        int num;
        String msg;
        // objects
        GuessingGame GG;
        GG = new GuessingGame();
        JOptionPane.showMessageDialog(null, "Do you want to play?");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess what number I got? From 1 to 10"));
        // set
        GG.setNum(num);

        // compute
        GG.computeGuessG();
        // get
        msg = GG.getMsg();
        // output
        JOptionPane.showMessageDialog(null, msg);
    }

}
