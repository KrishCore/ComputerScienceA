import java.awt.*;
import javax.swing.*;

public class AnimalFrame extends JFrame
{
    public AnimalFrame(String title)
    {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        AnimalPanel p = new AnimalPanel();
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
