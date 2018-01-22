import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame win = new JFrame("Radio");
        win.setBounds(500, 100, 500, 500);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win.add(new Digit(win.getWidth()/2, 10, 50, 80));

        win.setVisible(true);
    }
}
