import javax.swing.*;
import java.awt.*;
public class L9Component extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        h9 h=new h9(100);
        h.draw(g2);
    }

    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(500,500);

        frame.setTitle("Check Board");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        L9Component c=new L9Component();
        frame.add(c);
        frame.setVisible(true);
    }
}