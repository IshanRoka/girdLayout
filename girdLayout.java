import java.awt.GridLayout;
import javax.swing.*;

public class girdLayout {
    girdLayout() {
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        
        JFrame f = new JFrame("GridLayout Demo");
        f.setLayout(new GridLayout(3, 2));
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new girdLayout();
    }
}
