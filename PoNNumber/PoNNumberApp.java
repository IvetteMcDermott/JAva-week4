package PoNNumber;

import javax.swing.JOptionPane;

public class PoNNumberApp {

    public static void main(String[] args) {
        // variables
        int num;
        String msg;
        // objects
        PoNNumber PoN;
        PoN = new PoNNumber();
        // inputs
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number"));
        // set
        PoN.setNum(num);

        // compute
        PoN.computePoN();
        // get
        msg = PoN.getMsg();
        // output
        JOptionPane.showMessageDialog(null, msg);
    }
}