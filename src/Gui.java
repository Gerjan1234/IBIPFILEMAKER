import Pojo.Pojo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Gui {

    //static JFrame frame;
    public JFrame frame = new JFrame("Flow Layout");
    public static ArrayList<String> LijstC = new ArrayList<>();



    public void gui() {
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

/*        final JCheckBox chkApple = new JCheckBox("Apple");
        chkApple.addItemListener(new MyItemListener());

        chkApple.setBounds(300,300,300,30);
       frame.add(chkApple);*/
        button.addActionListener(new MyButtonActionListener());
        button1.addActionListener(new MyButtonActionListener());
        button2.addActionListener(new MyButtonActionListener());
        button3.addActionListener(new MyButtonActionListener());
        button4.addActionListener(new MyButtonActionListener());
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setLayout(null);
       // frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    /*    JFrame frame = new JFrame("IbipFileCreator");
        uitvoerveld = new JTextArea("");
        invoerveld = new JTextField();
        uitvoerveld2 = new JTextField();
        invoerveld.setBounds(50, 50, 400, 30);
        uitvoerveld2.setBounds(50, 100, 400, 30);
        uitvoerveld.setBounds(50, 200, 200, 600);
        uitvoerveld.setLineWrap(true);
        uitvoerveld.setWrapStyleWord(true);
        frame.add(invoerveld);
        frame.add(uitvoerveld);
        frame.add(uitvoerveld2);
        frame.setSize(600, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextFieldListener tfListener = new TextFieldListener();
        invoerveld.addActionListener(tfListener);

    }
    private class TextFieldListener implements ActionListener
    {  public void actionPerformed(ActionEvent evt)
    {
        invoerveld.requestFocus();
        invoerveld.setText(invoerveld.getText());
        Scanner t = new Scanner(invoerveld.getText());

        department = getUserInput2(t);
        uitvoerveld.setText("");
        uitvoerveld2.setText("");
        invoerveld.setText("");

        try {
            //run();
        } catch (Exception e) {
        }

    }
    }

    private String getUserInput2(Scanner t) {
        return t.nextLine().trim();
    }

*/

    public static void main(String[] args) {
        Gui x = new Gui();
        x.gui();
    }

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

    private static class MyButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(" buttun gedrukt");
            JButton buttonname = (JButton)e.getSource();
            String name = buttonname.getName();

            if(name.equals("Maak invoer file")){
                System.out.println(" stat");
                Writer x = new Writer();
                x.Writerinputfile(LijstC);
            }else if(name.equals("import file")){
                Creator crea = new Creator();
                crea.Creator();
            }

        }
    }

    public void makelist(ArrayList<Pojo> g) {
        int y = 120;
    //    JFrame frame2 = new JFrame();
        JCheckBox[] boxxs = new JCheckBox[g.size()];
        for (int i = 0; i < g.size(); i++) {
            boxxs[i] = new JCheckBox(g.get(i).Name);
            boxxs[i].setName(g.get(i).Name);
            this.frame.add(boxxs[i]);
            boxxs[i].addItemListener(new MyItemListener());
            boxxs[i].setBounds(30, y, 130, 20);
            y = y + 20;
        }
       // JButton buttoninvoer;
        JButton buttoninvoer = new JButton("Maak invoer file");
        JButton buttoninpunt = new JButton("import file");
        buttoninvoer.setBounds(30, y, 230, 30);
        buttoninpunt.setBounds(260, y,230, 30);
        buttoninvoer.setName("Maak invoer file");
        buttoninpunt.setName("import file");
        buttoninvoer.addActionListener(new MyButtonActionListener());
        buttoninpunt.addActionListener(new MyButtonActionListener());
        frame.add(buttoninvoer);
        frame.add(buttoninpunt);
        frame.setVisible(true);
    }
}
