package GuessingGame;

public class GuessingGame {

    // vars
    private int num;
    private int pc_num;
    private String msg;

    // constructor
    public GuessingGame() {
        num = 0;
        pc_num = (int) (Math.random() * 10) + 1;

        // This line is to test is working proper as we can see the pc_num before
        // ask to input user guess
        // System.out.println("pc" + pc_num);

        msg = "";
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPcNum(int pc_num) {
        this.pc_num = pc_num;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    // compute
    public void computeGuessG() {
        if (num == pc_num) {
            msg = "You guessed!";
        } else {
            msg = "Sorry! Try again";
        }
    }

    // get
    public String getMsg() {
        return msg;
    }
}
