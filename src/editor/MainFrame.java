/*
 * Created by JFormDesigner on Mon Oct 16 11:46:06 CEST 2023
 */

package editor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.formdev.flatlaf.FlatDarculaLaf;
import net.miginfocom.swing.*;
import utils.Colors;
import utils.Format;

import java.awt.event.WindowEvent;

/**
 * @author PC- Corentin
 */
public class MainFrame extends JFrame {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });

        String test = Colors.addColorsCodes("Bonjour tout         le monde\nn      aaza    zdza", "red", 4);
        System.out.println(Format.removeExtraSpaces(test));
    }
    public MainFrame() {
        initComponents();
    }

    private void thisWindowClosing(WindowEvent e) {
        int returnVal = JOptionPane.showConfirmDialog(this,
                "Do you want to exit PokéDS Text Formatter?",
                "Closing PokéDS Text Formatter", JOptionPane.YES_NO_OPTION);
        if (returnVal == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void thisWindowClosed(WindowEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        menuBar1 = new JMenuBar();
        menu2 = new JMenu();
        menuItem3 = new JMenuItem();
        tabbedPane1 = new JTabbedPane();
        gen4pan = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        inputText = new JEditorPane();
        panel2 = new JPanel();
        presetLabel = new JLabel();
        linesLabel = new JLabel();
        charLabel = new JLabel();
        presetInput = new JComboBox();
        linesInput = new JSpinner();
        charInput = new JSpinner();
        separator1 = new JSeparator();
        separator2 = new JSeparator();
        separator3 = new JSeparator();
        separator4 = new JSeparator();
        label5 = new JLabel();
        scrollPane2 = new JScrollPane();
        inputText2 = new JEditorPane();
        gen5pan = new JPanel();
        textField1 = new JTextField();

        //======== this ========
        setTitle("Pok\u00e9DS Text Formatter by Kuha");
        setMinimumSize(new Dimension(1280, 0));
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/appIcon.png")).getImage());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
            }
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]",
            // rows
            "[]"));

        //======== menuBar1 ========
        {

            //======== menu2 ========
            {
                menu2.setText("Help");

                //---- menuItem3 ----
                menuItem3.setText("About");
                menu2.add(menuItem3);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== tabbedPane1 ========
        {

            //======== gen4pan ========
            {
                gen4pan.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Your Text");
                label1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
                label1.setLabelFor(inputText);
                gen4pan.add(label1, "cell 0 0,aligny bottom,grow 100 0,height 20:20:20");

                //---- label2 ----
                label2.setText("Preview");
                label2.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
                gen4pan.add(label2, "cell 2 0");

                //======== scrollPane1 ========
                {
                    scrollPane1.setPreferredSize(new Dimension(580, 22));
                    scrollPane1.setViewportView(inputText);
                }
                gen4pan.add(scrollPane1, "cell 0 1,grow,width 400:400,height 200:200:200");

                //======== panel2 ========
                {
                    panel2.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "[fill]" +
                        "[fill]" +
                        "[fill]",
                        // rows
                        "[]" +
                        "[]"));

                    //---- presetLabel ----
                    presetLabel.setText("Preset");
                    presetLabel.setLabelFor(presetInput);
                    panel2.add(presetLabel, "cell 0 0");

                    //---- linesLabel ----
                    linesLabel.setText("Lines");
                    linesLabel.setLabelFor(linesInput);
                    panel2.add(linesLabel, "cell 1 0");

                    //---- charLabel ----
                    charLabel.setText("Characters");
                    charLabel.setLabelFor(charInput);
                    panel2.add(charLabel, "cell 2 0");
                    panel2.add(presetInput, "cell 0 1");
                    panel2.add(linesInput, "cell 1 1");
                    panel2.add(charInput, "cell 2 1");
                }
                gen4pan.add(panel2, "cell 0 2,grow");
                gen4pan.add(separator1, "cell 0 3");
                gen4pan.add(separator2, "cell 1 3");
                gen4pan.add(separator3, "cell 2 3");
                gen4pan.add(separator4, "cell 3 3");

                //---- label5 ----
                label5.setText("Output");
                label5.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
                gen4pan.add(label5, "cell 0 4");

                //======== scrollPane2 ========
                {
                    scrollPane2.setPreferredSize(new Dimension(580, 22));

                    //---- inputText2 ----
                    inputText2.setEditable(false);
                    scrollPane2.setViewportView(inputText2);
                }
                gen4pan.add(scrollPane2, "cell 0 5,grow,width 280:280,height 150:150:150");
            }
            tabbedPane1.addTab("Gen 4 (HGSS, DPPt)", gen4pan);

            //======== gen5pan ========
            {
                gen5pan.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));
                gen5pan.add(textField1, "cell 1 1 5 4,grow");
            }
            tabbedPane1.addTab("Gen 5 (BW, BW2) ", gen5pan);
        }
        contentPane.add(tabbedPane1, "pad 0,cell 0 0,align left top,grow 0 0,width pref:1280:max,height pref:720:max");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JMenuBar menuBar1;
    private JMenu menu2;
    private JMenuItem menuItem3;
    private JTabbedPane tabbedPane1;
    private JPanel gen4pan;
    private JLabel label1;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JEditorPane inputText;
    private JPanel panel2;
    private JLabel presetLabel;
    private JLabel linesLabel;
    private JLabel charLabel;
    private JComboBox presetInput;
    private JSpinner linesInput;
    private JSpinner charInput;
    private JSeparator separator1;
    private JSeparator separator2;
    private JSeparator separator3;
    private JSeparator separator4;
    private JLabel label5;
    private JScrollPane scrollPane2;
    private JEditorPane inputText2;
    private JPanel gen5pan;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
