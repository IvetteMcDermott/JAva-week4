package OddsOrEven;

public class OddsOrEven {
    // vars
    private int num;
    private String msg;

    // constructor
    public OddsOrEven() {
        num = 0;
        msg = "";
    }

    // set
    public void setNum(int num) {
        this.num = num;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeOoE() {
        if (num % 2 != 0) {
            msg = "The number " + num + " is odd ";
        } else {
            msg = "The number " + num + " is even ";
        }
    }

    // get
    public String getMsg() {
        return msg;
    }

}
