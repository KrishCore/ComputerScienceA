import javax.swing.*;
import java.awt.*;

public class DrivingPanel extends JPanel
{
    public DrivingPanel()
    {
        super();
        setSize(1000, 800);
    }
    public void paint(Graphics g)
    {
//        Background

        for (int i = 0; i < 101; i++) {
            g.setColor(new Color(255, (int) (71-.71*i), (int) (255-.17*i)));
            g.drawLine(0,i,getWidth(), i);
        }
        for (int i = 0; i < 101; i++) {
            g.setColor(new Color(255, 0, 238-i));
            g.drawLine(0,i+100,getWidth(), i+100);
        }
        for (int i = 0; i < 101; i++) {
            g.setColor(new Color(255, i, (int) (138 + .62*i)));
            g.drawLine(0, i + 200, getWidth(), i + 200);
        }
        g.setColor(new Color(255, 100, 200));
        g.fillRect(0,300,getWidth(),100);

        g.setColor(Color.BLACK);
        for (int i = 1; i < 20; i++) {
            g.drawLine(0, 100*i, getWidth(), 100*i);
            g.drawLine(100*i, 0, 100*i, getHeight());
        }

//        Sun
        g.setColor(new Color(255, 255, 0, 255));
        g.fillOval(360, 160, 280,280);
        g.setColor(new Color(255, 255, 0, 153));
        g.fillOval(350, 150, 300, 300);
        g.setColor(new Color(255, 255, 0, 128));
        g.fillOval(335, 135, 330, 330);
        g.setColor(new Color(255, 255, 0, 102));
        g.fillOval(320, 120, 360, 360);

//        Scenery
        // Cliff
        g.setColor(new Color(48, 31, 12));
        g.fillRect(0, 625, getWidth(), getHeight());

        // Grass 2
        g.setColor(new Color(50,155,0));
        g.fillArc(-100,525,1200, 200, 45, -315);

        // Asphalt
        g.setColor(new Color(45, 45, 45));
        g.fillArc(-100,425,1200, 250, 45, -315);

        // Divider lines - Google drive couldn't connect
//        g.setColor(new Color(255,185,5));
//        g.fillArc(-100,405,1200, 250, 45, -315);


        // Grass 1
        g.setColor(new Color(30, 105, 50));
        g.fillArc(-100,350,1200, 200, 45, -315);

        g.setColor(new Color(75, 45, 10));
        g.fillArc(-100,255,1200, 250, 180, 180);

//        Mountains
        g.setColor(new Color(40, 20, 0));
        int[] x = new int[] {100, 100, 275, 350, 600, 800, 950, 950};
        int[] y = new int[] {400, 300, 175, 400, 400, 175, 300, 400};
        g.fillPolygon(x,y,8);
        g.setColor(new Color(75, 45, 10));
        x = new int[] {-100, 150, 300, 400, 550, 600, 650, 700, 800, 950, 1100};
        y = new int[] {450, 100, 300, 175, 375, 250, 275, 125, 300, 150, 450};
        g.fillPolygon(x, y, 11);

//        Stop sign
        g.setColor(new Color(95, 95, 95));
        g.fillRect(155, 400, 6, 115);
        g.setColor(new Color(165, 30, 30));
        // create angled octagon
        x = new int[] {164, 154, 149, 149, 154, 164, 169, 169};
        y = new int[] {430, 430, 420, 410, 400, 400, 410, 420};
        g.fillPolygon(x,y,8);

        // Dashed lines
        x = new int[] {};
        y = new int[] {};

//        Car
        // make a blue car
        g.setColor(new Color(65, 70, 225));
        x = new int[] {500, 502, 573, 575, 575, 573, 452, 450, 450, 452, 498, 500};
        y = new int[] {528, 525, 525, 527, 573, 575, 575, 573, 552, 550, 550, 548};
        g.fillPolygon(x,y,x.length);
        g.setColor(new Color(0, 165, 255));
        g.fillRect(505,530, 30, 20);
        g.fillRect(540,530, 30, 20);

        // Wheels
        g.setColor(Color.BLACK);
        g.fillOval(460,565,30,30);
        g.fillOval(535,565,30,30);
        g.setColor(new Color(100, 95, 95));
        g.fillOval(465, 570, 20, 20);
        g.fillOval(540, 570, 20, 20);

//        g.setColor(Color.BLACK);
//        for (int i = 1; i < 20; i++) {
//            g.drawLine(0, 100*i, getWidth(), 100*i);
//            g.drawLine(100*i, 0, 100*i, getHeight());
//        }
    }
}
