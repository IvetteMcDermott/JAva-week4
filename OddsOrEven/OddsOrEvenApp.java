package OddsOrEven;

import javax.swing.JOptionPane;

public class OddsOrEvenApp {
    public static void main(String[] args) {
        // variables
        int num;
        String msg;
        // objects
        OddsOrEven OoE;
        OoE = new OddsOrEven();
        // inputs
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        // set
        OoE.setNum(num);

        // compute
        OoE.computeOoE();
        // get
        msg = OoE.getMsg();
        // output
        JOptionPane.showMessageDialog(null, msg);
    }
}
