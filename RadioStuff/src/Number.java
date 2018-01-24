public class Number extends Digit{

    private int number;
    public Number(int x, int y, int w, int h, int n)
    {
        super(x,y,w,h);
        setNumber(n);
    }

    public void setNumber(int n)
    {
        number = n;
        switch(n)
        {
            case 0:
                showAll();
                middle.setVisible(false);
                break;
            case 1:
                hideAll();
                topRight.setVisible(true);
                bottomRight.setVisible(true);
                break;
            case 2:
                showAll();
                topLeft.setVisible(false);
                bottomRight.setVisible(false);
                break;
            case 3:
                showAll();
                topLeft.setVisible(false);
                bottomLeft.setVisible(false);
                break;
            case 4:
                showAll();
                top.setVisible(false);
                bottomLeft.setVisible(false);
                bottom.setVisible(false);
                break;
            case 5:
                showAll();
                topRight.setVisible(false);
                bottomLeft.setVisible(false);
                break;
            case 6:
                showAll();
                topRight.setVisible(false);
                break;
            case 7:
                hideAll();
                top.setVisible(true);
                topRight.setVisible(true);
                bottomRight.setVisible(true);
                break;
            case 8:
                showAll();
                break;
            case 9:
                showAll();
                bottomLeft.setVisible(false);
                break;
            default:
                System.out.println(n + " is an invalid number!");
                break;
        }
    }
}
