import javax.swing.JComponent;

public class Digit extends JComponent{
    private int widthH; //width is defined as the short side of the rectangle
    private int lengthH;//length is the long side of the rectangle
    private int widthV;//H is for Horizontal, and V is for Vertical
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
        middle = new Rectangle(widthV, widthH*4, lengthH, widthH);
        add(middle);
        bottomLeft = new Rectangle(0, widthH*5, widthV, lengthV);
        add(bottomLeft);
        bottomRight = new Rectangle(widthV*4, widthH*5, widthV, lengthV);
        add(bottomRight);
        bottom = new Rectangle(widthV, widthH*8, lengthH, widthH);
        add(bottom);
    }
}
