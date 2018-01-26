import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JFrame win = new JFrame("Radio");
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(1500, 1000);
        win.setLocationRelativeTo(null);

        Number[] nums = new Number[10];
        int w = 100;//width
        int h = 166;//height
        int i = 0;
        int x;
        int y;
        Random gen = new Random();
        for(; i<nums.length; i++) {
            x = gen.nextInt(win.getWidth()-w);
            y = gen.nextInt(win.getHeight()-h);
            nums[i] = new Number(x, y, w, h, i);
            nums[i].setColor(ranColor());
            win.add(nums[i]);
        }

        win.setVisible(true);

        nums[1].equals(null);
    }

    public static Color ranColor()
    {
        Random gen = new Random();
        return new Color(gen.nextInt(256), gen.nextInt(256), gen.nextInt(256));
    }
}
