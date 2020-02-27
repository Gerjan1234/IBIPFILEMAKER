import Pojo.Pojo;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class test  {


    public static JFrame frame = new JFrame("SAP IBIP FILEMAKER");
    public static ArrayList<String> LijstC = new ArrayList<>();
    public static ArrayList<Pojo> LijstB;
    public static Panel outputText = new Panel();
    public static JTextArea textventster = new JTextArea(" ");
    //public static  Gui gui = new Gui();
    public static  test gui = new test();
    public static Creator crea = new Creator();
    public static  JPanel t1 = new JPanel();
    /**
     * Methode gui
     * @author (Gerjan)
     * @version (29-01-2020)
     * aanmaken scherm met knoppen transacties
     */
/*    public void gui(ArrayList<Pojo> lijstB) {
        this.LijstB = lijstB;*/
    public void test() {
    //  this.LijstB = lijstB;
        this.frame.setSize(1100, 1100);
        this.frame.setBackground(Color.getHSBColor(223, 235, 245));
    JButton button, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17;
    button = new JButton("IE01");
    button1 = new JButton("IE02");
    button2 = new JButton("Ik11");
    button3 = new JButton("IL01");
    button4 = new JButton("IL02");
    button5 = new JButton("Ik01");
    button6 = new JButton("Ik02");
        button7 = new JButton("IN04");
        button8 = new JButton("IP05");
        button9 = new JButton("IP07");
        button10 = new JButton("IN08");
        button11 = new JButton("IP01");
        button12 = new JButton("IP04");
        button13 = new JButton("IP10");
        button14 = new JButton("IA01");
        button15 = new JButton("IA11");
        button16 = new JButton("IA05");
        button17 = new JButton("MB11");

        outputText.setBounds(new Rectangle(30,100,1100,50));
//backgroudcollor set to rgb(223, 235, 245)
        outputText.setBackground(new Color(0,0,0));
        outputText.add(textventster);
        this.frame.add(outputText);
        button.setName("IE01");
        button1.setName("IE02");
        button2.setName("Ik11");
        button3.setName("IL01");
        button4.setName("IL02");
        button5.setName("IK01");
        button6.setName("IK02");
        button7.setName("IN04");
        button8.setName("IN05");
        button9.setName("IN07");
        button10.setName("IN08");
        button11.setName("IP01");
        button12.setName("IP04");
        button13.setName("IP10");
        button14.setName("IA01");
        button15.setName("IA11");
        button16.setName("IA05");
        button17.setName("MB11");
        button.setBounds(30,30,90,30);
        button1.setBounds(30,60,90,30);
        button2.setBounds(120,30,90,30);
        button3.setBounds(210,30,90,30);
        button4.setBounds(210,60,90,30);
        button5.setBounds(300,30,90,30);
        button6.setBounds(300,60,90,30);
        button7.setBounds(390,30,90,30);
        button8.setBounds(390,60,90,30);
        button9.setBounds(480,30,90,30);
        button10.setBounds(480,60,90,30);
        button11.setBounds(570,30,90,30);
        button12.setBounds(570,60,90,30);
        button13.setBounds(660,30,90,30);
        button14.setBounds(660,60,90,30);
        button15.setBounds(750,30,90,30);
        button16.setBounds(750,60,90,30);
        button17.setBounds(840,30,90,30);
        button.addActionListener(new TransactionButtonActionListener());
        button1.addActionListener(new TransactionButtonActionListener());
        button2.addActionListener(new TransactionButtonActionListener());
        button3.addActionListener(new TransactionButtonActionListener());
        button4.addActionListener(new TransactionButtonActionListener());
        button5.addActionListener(new TransactionButtonActionListener());
        button6.addActionListener(new TransactionButtonActionListener());
        button7.addActionListener(new TransactionButtonActionListener());
        button8.addActionListener(new TransactionButtonActionListener());
        button9.addActionListener(new TransactionButtonActionListener());
        button10.addActionListener(new TransactionButtonActionListener());
        button11.addActionListener(new TransactionButtonActionListener());
        button12.addActionListener(new TransactionButtonActionListener());
        button13.addActionListener(new TransactionButtonActionListener());
        button14.addActionListener(new TransactionButtonActionListener());
        button15.addActionListener(new TransactionButtonActionListener());
        button16.addActionListener(new TransactionButtonActionListener());
        button17.addActionListener(new TransactionButtonActionListener());
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
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
                LijstB = crea.getTabel("IBIPEQUI");
                gui.makelist(LijstB);
                gui.setterminal("IE01 gekozen");
                System.out.println(name);
                break;
            case "IE02":
                LijstB = crea.getTabel("IBIPEQUI");
                gui.makelist(LijstB);
                gui.setterminal("IK11 gekozen");
                System.out.println(name);
                break;
            case "Ik11":
                LijstB = crea.getTabel("IBIPMVAL");
                gui.makelist(LijstB);
                gui.setterminal("IK11 gekozen");
                System.out.println(name);
                break;
            case "IL01":
                System.out.println(name);
                LijstB = crea.getTabel("IBIPFLOC");
                gui.makelist(LijstB);
                gui.setterminal("IL01 gekozen");
                break;
            case "IL02":
                System.out.println(name);
                LijstB = crea.getTabel("IBIPFLOC");
                gui.makelist(LijstB);
                gui.setterminal("IL02 gekozen");
                break;
            case "IK01":
                LijstB = crea.getTabel("IBIPMEAS");
                gui.makelist(LijstB);
                gui.setterminal("IK01 gekozen");
                break;
            case "IK02":
                LijstB = crea.getTabel("IBIPMEAS");
                gui.makelist(LijstB);
                gui.setterminal("IK02 gekozen");
                break;
            case "IN04":
                LijstB = crea.getTabel("IBIPOLNK");
                gui.makelist(LijstB);
                gui.setterminal("IN04 gekozen");
                break;
            case "IN05":
                LijstB = crea.getTabel("IBIPOLNK");
                gui.makelist(LijstB);
                gui.setterminal("IN05 gekozen");
                break;
            case "IN07":
                LijstB = crea.getTabel("IBIPOLNK");
                gui.makelist(LijstB);
                gui.setterminal("IN07 gekozen");
                break;
            case "IN08":
                LijstB = crea.getTabel("IBIPOLNK");
                gui.makelist(LijstB);
                gui.setterminal("IN08 gekozen");
                break;
            case "IP01":
                LijstB = crea.getTabel("IBIPMPLA");
                gui.makelist(LijstB);
                gui.setterminal("IP01 gekozen");
                break;
            case "IP10":
                LijstB = crea.getTabel("IBIPMPST");
                gui.makelist(LijstB);
                gui.setterminal("IP10 gekozen");
                break;
            case "IP04":
                LijstB = crea.getTabel("IBIPMPOS");
                gui.makelist(LijstB);
                gui.setterminal("IP04 gekozen");
                break;
            case "IA01":
                LijstB = crea.getTabel("IBIPTLST");
                gui.makelist(LijstB);
                gui.setterminal("IA01 gekozen");
                break;
            case "IA11":
                LijstB = crea.getTabel("IBIPTLST");
                gui.makelist(LijstB);
                gui.setterminal("IA11 gekozen");
                break;
            case "IA05":
                LijstB = crea.getTabel("IBIPTLST");
                gui.makelist(LijstB);
                gui.setterminal("IA05 gekozen");
                break;
            case "MB11":
                LijstB = crea.getTabel("IBIPGISS");
                gui.makelist(LijstB);
                gui.setterminal("MB11 gekozen");
                System.out.println("ajsdfksdfklsdf");
                break;
            default:
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
        //backgroudcollor set to rgb(223, 235, 245)
        System.out.println(" komt ie heir");
        frame.setVisible(false);


       t1.removeAll();
        t1.revalidate();
        GridLayout experimentLayout = new GridLayout(0,1);
        t1.setLayout(experimentLayout);


        //xx.setBounds(0,160,800,800);
       t1.setBounds(0,160,800,800);
        System.out.println(" in make list");
        int y = 160;
        JCheckBox[] boxxs = new JCheckBox[g.size()];
        for (int i = 0; i < g.size(); i++) {
            boxxs[i] = new JCheckBox(g.get(i).Name +  " (" + g.get(i).Desc + ")");
            boxxs[i].setName(g.get(i).Name);
           t1.add(boxxs[i]);
            boxxs[i].addItemListener(new test.MyItemListener());
            boxxs[i].setBounds(30, y, 800, 20);
            y = y + 20;
        }
        boxxs[0].setSelected(true);
        boxxs[0].setEnabled(false);
        boxxs[1].setSelected(true);
        boxxs[1].setEnabled(false);
        JButton buttoninvoer = new JButton("Maak invoer file");
        JButton buttoninpunt = new JButton("import file");
        buttoninvoer.setBounds(30, y, 230, 30);
        buttoninpunt.setBounds(260, y,230, 30);
        buttoninvoer.setName("Maak invoer file");
        buttoninpunt.setName("import file");
        buttoninvoer.addActionListener(new test.UItvoerButtonActionListener());
        t1.add(buttoninvoer);
        t1.add(buttoninpunt);
       // t1.add(exit);
        //xx.add(t1);
frame.add(t1);
        frame.setVisible(true);
      //  xx.setBounds(30,160,500,500);
        //xx.setVisible(true);
        //xx.setSize(800,640);

        //frame.add(xx);
       // xx.moveToFront();


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

    /**
     * Methode notJetReady
     * @author (Gerjan)
     * @version (29-01-2020)
     * pop bij knop werkt nog niet
     */
    public static void notJetReady(String file) {
        JOptionPane dd = new JOptionPane();
        JOptionPane.showMessageDialog(dd, file + " optie nog niet gereed");
    }
    /**
     * Methode setterminal
     * @author (Gerjan)
     * @version (01-02-2020)
     * terminal output
     */
    public  void setterminal(String text) {

        textventster.append(" " + text + "\n");

    }

    public static void main(String[] args) {
        test xx = new test();
        xx.test();
    }

    }

