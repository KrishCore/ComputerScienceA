import java.awt.*;
import javax.swing.*;

    public class AnimalPanel extends JPanel
{
    public AnimalPanel()
    {
        super();
        setSize(1000, 800);
    }
    public void paint(Graphics g)
    {
//         Background
        g.setColor(new Color(0, 150, 250));
        g.fillRect(0,0, getWidth(), getHeight());
        g.setColor(new Color(0, 50, 250));
        g.fillRect(0,2*getHeight()/3, getWidth(), getHeight());
//         Iceberg
        g.setColor(Color.WHITE);
        int[] x = {-50, -5, 66, 175, 200, 300, 300, 400};
        int[] y = {getHeight(),getHeight()-320, getHeight()-370, getHeight()-385, getHeight()-375, getHeight()-300, getHeight()-270, getHeight()};
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i];
            y[i] = y[i];
        }
        g.fillPolygon(x, y, 8);

//         Clouds & Sun
        g.fillOval(190, 155, 115, 90);
        g.fillOval(155, 125, 115, 90);
        g.fillOval(135, 160, 115, 90);

        g.fillOval(715, 255, 115, 90);
        g.fillOval(680, 225, 115, 90);
        g.fillOval(660, 260, 115, 90);

        g.setColor(new Color(255,195,0));
        g.fillOval(getWidth()-125, -125, 250, 250);

//         Penguin
        // Body
        g.setColor(Color.BLACK);
        g.fillOval(getWidth()-250, getHeight()-200, 135, 75);
        // Fins
        x = new int[] {768+15, 775+15, 785+15, 800+30, 840+20, 835+5, 800+15, 775+15};
        y = new int[] {537+45, 527+45, 525+45, 530+45, 560+50, 565+40, 555+45, 550+45};
        g.fillPolygon(x, y, 8);
        for (int i = 0; i < y.length; i++) {
            y[i] = -1* y[i] + 1275;
        }
        g.fillPolygon(x, y, 8);
        g.setColor(new Color(128,128,128));
        g.fillOval(789, 575, 38,18);
        g.fillOval(789, 681, 38,18);
        // Belly
        g.setColor(Color.WHITE);
        x = new int[] {12};
        y = new int[] {12};
        g.fillPolygon(x, y,1);
        g.fillOval(getWidth()-245, getHeight()-170, 125, 35);

//        g.setColor(new Color(128, 128, 128));
        // Head
        g.setColor(Color.BLACK);
        g.fillOval(865, 612, 50,50);
        g.setColor(Color.WHITE);
        g.fillOval(870, 617, 40,40);
        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(893, 625, 10,10);
        // Feet
        g.setColor(new Color(255, 145,0));
        x = new int[] {849+65, 849+95, 849+65};
        y = new int[] {631, 638, 645};
        g.fillPolygon(x, y, 3);
        x = new int[] {735, 770, 735, 745};
        y = new int[] {645, 655, 665, 655};
        g.fillPolygon(x, y, 4);
        // Beak
        x = new int[] {735, 770, 735, 745};
        y = new int[] {615, 625, 635, 625};
        g.fillPolygon(x, y, 4);

    }
}
