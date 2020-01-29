import Pojo.Pojo;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;


public class Gui {

    //static JFrame frame;
    public static JFrame frame = new JFrame("Flow Layout");
    public static ArrayList<String> LijstC = new ArrayList<>();
    public static ArrayList<Pojo> LijstB;

    /**
     * Methode gui
     * @author (Gerjan)
     * @version (29-01-2020)
     * aanmaken scherm met knoppen transacties
     */
    public void gui(ArrayList<Pojo> lijstB) {
        this.LijstB = lijstB;
        this.frame.setSize(800, 800);
        JButton button, button1, button2, button3, button4;
        button = new JButton("IE01");
        button1 = new JButton("IE02");
        button2 = new JButton("Ik11");
        button3 = new JButton("IL01");
        button4 = new JButton("IL02");
        button.setName("IE01");
        button1.setName("IE02");
        button2.setName("Ik11");
        button3.setName("IL01");
        button4.setName("IL02");
        button.setBounds(30,30,130,30);
        button1.setBounds(30,60,130,30);
        button2.setBounds(130,30,130,30);
        button3.setBounds(260,30,130,30);
        button4.setBounds(260,60,130,30);
        button.addActionListener(new TransactionButtonActionListener());
        button1.addActionListener(new TransactionButtonActionListener());
        button2.addActionListener(new TransactionButtonActionListener());
        button3.addActionListener(new TransactionButtonActionListener());
        button4.addActionListener(new TransactionButtonActionListener());
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     * Methode MyItemListener
     * @author (Gerjan)
     * @version (29-01-2020)
     * checkbox uitlezen en array vullen
     */
    private static class MyItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == 1) {
                System.out.println("indrgukt");
                JCheckBox check = (JCheckBox)e.getSource();
                String name = check.getName();
                System.out.println(name);
              LijstC.add(name);
            }
        }
    }

    /**
     * Methode MyItemListener
     * @author (Gerjan)
     * @version (29-01-2020)
     * uitlezen van de knoppen transacties
     */
    private static class TransactionButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("werkt deze nog");
            JButton buttonname = (JButton) e.getSource();
            String name = buttonname.getName();
            switch (name) {

                case "IE01":
                    notJetReady("IE01");
                    System.out.println(name);
                    break;
                case "IE02":
                    System.out.println(name);
                    notJetReady("IE01");
                    break;
                case "Ik11":
                    Gui gui = new Gui();
                    gui.makelist(LijstB);
                    System.out.println(name);
                    break;
                case "IL01":
                    System.out.println(name);
                    notJetReady("IL01");
                    break;
                case "IL02":
                    System.out.println(name);
                    notJetReady("IL02");
                    break;
                default:
                    System.out.println("geen keuze");
                    notJetReady("geen keuze");
            }
        }
    }

        /**
         * Methode UItvoerButtonActionListener
         * @author (Gerjan)
         * @version (29-01-2020)
         * acties bij knoppen maak file en file uitvoeren.
         */
    private static class UItvoerButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(" buttun gedrukt");
            JButton buttonname = (JButton) e.getSource();
            String name = buttonname.getName();

            if (name.equals("Maak invoer file")) {
                System.out.println(" stat");
                Writer x = new Writer();
                String zz = x.Writerinputfile(LijstC);
                JOptionPane cc = new JOptionPane();
                JOptionPane.showMessageDialog(cc, "file gecreeerd" + "\n" + zz);

            } else if (name.equals("import file")) {
                String files = " ";
                String Location = System.getProperty("user.dir");
                File jarDir = new File(Location);
              //  JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getParentDirectory(jarDir));
                JFileChooser jfc = new JFileChooser(Location);
                jfc.setAcceptAllFileFilterUsed(false);
                FileNameExtensionFilter filter = new FileNameExtensionFilter("xls, csv or txt files", "txt", "xls", "csv");
                jfc.addChoosableFileFilter(filter);
                int returnValue = jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    files = selectedFile.getAbsolutePath();
                }
            Creator crea = new Creator();
                System.out.println(files);
            crea.Creator(files);
            }

        }
    }

        /**
         * Methode makelist
         * @author (Gerjan)
         * @version (29-01-2020)
         * checkbox neerzetten + knoppen van uitvoeren
         */
    public void makelist(ArrayList<Pojo> g) {
    this.frame.setVisible(false);
        System.out.println(" in make list");
        int y = 120;
    //    JFrame frame2 = new JFrame();
        JCheckBox[] boxxs = new JCheckBox[g.size()];
        for (int i = 0; i < g.size(); i++) {
            boxxs[i] = new JCheckBox(g.get(i).Name +  " (" + g.get(i).Desc + ")");
            boxxs[i].setName(g.get(i).Name);
            this.frame.add(boxxs[i]);
            boxxs[i].addItemListener(new MyItemListener());
            boxxs[i].setBounds(30, y, 800, 20);
            y = y + 20;
        }
        boxxs[0].setSelected(true);
        boxxs[0].setEnabled(false);
        boxxs[1].setSelected(true);
        boxxs[1].setEnabled(false);
       // JButton buttoninvoer;
        JButton buttoninvoer = new JButton("Maak invoer file");
        JButton buttoninpunt = new JButton("import file");
        buttoninvoer.setBounds(30, y, 230, 30);
        buttoninpunt.setBounds(260, y,230, 30);
        buttoninvoer.setName("Maak invoer file");
        buttoninpunt.setName("import file");
        buttoninvoer.addActionListener(new UItvoerButtonActionListener());
        buttoninpunt.addActionListener(new UItvoerButtonActionListener());
        this.frame.add(buttoninvoer);
        this.frame.add(buttoninpunt);
    this.frame.setVisible(true);
    }


    /**
     * Methode succes
     * @author (Gerjan)
     * @version (29-01-2020)
     * pop bij succes schrijven
     */
public void succes(String file) {
    JOptionPane dd = new JOptionPane();
    JOptionPane.showMessageDialog(dd, "file gecreeerd" + "\n" + file);
}
    public static void notJetReady(String file) {
        JOptionPane dd = new JOptionPane();
        JOptionPane.showMessageDialog(dd, file + " optie nog niet gereed");
    }
}
