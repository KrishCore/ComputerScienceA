import javax.swing.*;
import java.awt.*;

public class DrivingFrame extends JFrame
{
    public DrivingFrame(String title)
    {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        DrivingPanel p = new DrivingPanel();
        Insets insets = getInsets();
        int width = p.getWidth() + insets.left + insets.right;
        int height = p.getHeight() + insets.top + insets.bottom;

        setPreferredSize(new Dimension(width, height));
        setLayout(null);

        add(p);
        pack();
        setVisible(true);

    }
}
