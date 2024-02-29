package PoNNumber;

public class PoNNumber {

    // vars
    private int num;
    private String msg;

    // constructor
    public PoNNumber() {
        num = 0;
        msg = "";
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computePoN() {
        if (num >= 0) {
            msg = "The number " + num + " is positive ";
        } else {
            msg = "The number " + num + " is negative ";
        }
    }

    // get
    public String getMsg() {
        return msg;
    }
}
