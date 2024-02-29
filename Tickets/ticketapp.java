package Tickets;

import javax.swing.JOptionPane;

public class ticketapp {
    public static void main(String[] args) {
        // variables
        int age;
        int numT;
        int total;
        String msg;
        // objects
        ticket tickets;
        tickets = new ticket();
        // inputs
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        numT = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tickets to purchase"));
        // set
        tickets.setAge(age);
        tickets.setNumT(numT);

        // compute
        tickets.computeTotal();
        // get
        total = tickets.getTotalI();
        msg = tickets.getTotalM();
        // output
        JOptionPane.showMessageDialog(null, "Total Price:  €" + total + "\n\n" + "Tickets Qty: " + numT + "\n" + msg);
    }
}