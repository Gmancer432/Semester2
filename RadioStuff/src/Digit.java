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
        middle = new Rectangle(widthV, widthH*4, lengthH, widthH);
        add(middle);
        bottomLeft = new Rectangle(0, widthH*5, widthV, lengthV);
        add(bottomLeft);
        bottomRight = new Rectangle(widthV*4, widthH*5, widthV, lengthV);
        add(bottomRight);
        bottom = new Rectangle(widthV, widthH*8, lengthH, widthH);
        add(bottom);
    }

    protected void showAll()
    {
        top.setVisible(true);
        topLeft.setVisible(true);
        topRight.setVisible(true);
        middle.setVisible(true);
        bottomLeft.setVisible(true);
        bottomRight.setVisible(true);
        bottom.setVisible(false);
        repaint();
    }

    protected void hideAll()
    {
        top.setVisible(false);
        topLeft.setVisible(false);
        topRight.setVisible(false);
        middle.setVisible(false);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(false);
        bottom.setVisible(false);
        repaint();
    }
}
