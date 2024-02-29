package Tickets;

public class ticket {
    // vars
    private int age;
    private int numT;
    private int under;
    private int over;
    private int total;
    private String msg;

    // constructor
    public ticket() {
        age = 0;
        numT = 0;
        under = 10;
        over = 15;
        total = 0;
        msg = "";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumT(int numT) {
        this.numT = numT;
    }

    public void setUnder(int under) {
        this.under = under;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeTotal() {
        if (age >= 18) {
            total = numT * over;
            msg = "Over Age Price € " + over;
        } else {
            total = numT * under;
            msg = "Under Age Price € " + under;

        }
    }

    // get
    public int getTotalI() {
        return total;
    }

    public String getTotalM() {
        return msg;
    }
}
