import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame win = new JFrame("Radio");
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Number[] nums = new Number[10];
        int w = 100;//width
        int h = 166;//height
        int s = 10;//space in between numbers
        int i = 0;
        for(; i<nums.length; i++) {
            nums[i] = new Number(s + i * (w + s), s, w, h, i);
            win.add(nums[i]);
        }

        win.setSize(s*2+i*(w+s), h+2*s+30);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
