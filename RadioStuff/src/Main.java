import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame win = new JFrame("Radio");
        win.setBounds(500, 100, 500, 500);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Number[] nums = new Number[10];
        int w = 100;
        int h = 166;
        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = new Number(i*(w+10), 50, w, h);
        }

        win.setVisible(true);
    }
}
