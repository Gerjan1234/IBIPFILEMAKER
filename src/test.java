

    import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

    public class test {
        private static final Dimension MAIN_SIZE = new Dimension(300,300);
        private static final String IMAGE_PATH = "/home/gerjan/Afbeeldingen/frozen19.jpg";
        private static final String IMAGE_PANEL = "Image Panel";
        private static final String BUTTON_PANEL = "Button Panel";

        private JPanel mainPanel, imagePanel, btnPanel;
        private CardLayout cardlayout = new CardLayout();
        private BorderLayout borderlayout = new BorderLayout();

        public test() {
            mainPanel = new JPanel();
            mainPanel.setLayout(borderlayout);
            mainPanel.setPreferredSize(MAIN_SIZE);
            createBtnPanel();
            createImagePanel();
            mainPanel.add(btnPanel, BorderLayout.SOUTH);
            mainPanel.add(imagePanel, BorderLayout.CENTER);
        }

        private void createBtnPanel() {
            JButton startBtn = new JButton("Start");
            startBtn.addActionListener(new StartBtnListener() );
            btnPanel = new JPanel();
            btnPanel.add(startBtn);
        }

        private void createImagePanel() {
            BufferedImage image = null;
            try {
                File input = new File(IMAGE_PATH);
                image = ImageIO.read(input);
            }catch(IOException ioe) {
                ioe.printStackTrace();
            }
            imagePanel = new JPanel();
            imagePanel.setLayout(cardlayout);
            if(image != null) {
                imagePanel.add(new JLabel(new ImageIcon(image)), IMAGE_PANEL);
            }
        }

        public JPanel getPanel() {
            return mainPanel;
        }

        private class StartBtnListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                cardlayout.show(imagePanel, IMAGE_PANEL);
            }
        }

        private static void createAndShowUI() {
            JFrame frame = new JFrame("Display Image");
            frame.getContentPane().add(new test().getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);  //center the windows
            frame.setVisible(true);
        }

        public static void main (String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable(){
                public void run() {
                    createAndShowUI();
                }
            });
        }


    }

