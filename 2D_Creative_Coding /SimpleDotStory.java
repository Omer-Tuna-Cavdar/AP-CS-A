import javax.swing.*;
import java.awt.*;

public class SimpleDotStory {
    private JFrame frame;
    private int frameCount = 0;

    public SimpleDotStory() {
        frame = new JFrame("Simple Dot Story");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DotPanel());
        frame.setVisible(true);
    }

    class DotPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);

            if (frameCount < 10) {
                g.fillOval(10 + frameCount * 10, 10 + frameCount * 10, 5, 5);
                frameCount++;
                try {
                    Thread.sleep(500);  // Pause for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
        }
    }

    public static void main(String[] args) {
        new SimpleDotStory();
    }
}
