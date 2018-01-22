import javax.swing.JComponent;

public class Digit extends JComponent{
    private int widthH;
    private int lengthH;
    private int widthV;
    private int lengthV;

    private Rectangle top;
    private Rectangle topLeft;
    private Rectangle topRight;
    private Rectangle middle;
    private Rectangle bottomLeft;
    private Rectangle bottomRight;
    private Rectangle bottom;

    public Digit(int x, int y, int w, int h)
    {
        super();
        setBounds(x, y, w, h);

        widthV = w/5;
        lengthH = widthV * 3;
        widthH = h/9;
        lengthV = widthH * 3;

        top = new Rectangle(widthV, 0, lengthH, widthH);
        add(top);
        topLeft = new Rectangle(0, widthH, widthV, lengthV);
        add(topLeft);
        topRight = new Rectangle(widthV*4, widthH, widthV, lengthV);
        add(topRight);
        middle = new Rectangle(25, 100, 75, 25);
        add(middle);
        bottomLeft = new Rectangle(0, 125, 25, 75);
        add(bottomLeft);
        bottomRight = new Rectangle(100, 125, 25, 75);
        add(bottomRight);
        bottom = new Rectangle(25, 200, 75, 25);
        add(bottom);
    }
}
