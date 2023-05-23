import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame
{
    private static final String IMG_PATH = "src/Samples/sample1.png";
    public MainForm() {
        super("Главное меню");
        setSize(1080,720);
        setLocation(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();

        JLabel j1 = new JLabel ();
        ImageIcon ob = new ImageIcon (IMG_PATH);

        j1.setIcon (ob);
        jPanel.add (j1);
        jPanel.setVisible (true);
        add(jPanel);

        setVisible(true);
    }


}
