package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ftest extends JFrame {

    private static final long serialVersionUID = 1;
    private JPanel jContentPane = null;
    private JTextArea jTextArea = null;
    private JPanel controlPanel = null;
    private JButton openButton = null;
    private JButton closeButton = null;

    Ftest() {
        super();
        initialize();
    }

    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJTextArea(), BorderLayout.CENTER);
            jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    private JTextArea getJTextArea() {

        jTextArea = new JTextArea();

        return jTextArea;

    }

    private JPanel getControlPanel() {

        controlPanel = new JPanel();

        return controlPanel;

    }

    public void setLayout() {
        controlPanel.add(getOpenButton());
        controlPanel.add(getCloseButton());
    }

    private JButton getOpenButton() {
        if (openButton == null) {
            openButton = new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    try {
                        FileWriter out = new FileWriter(file);
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    private JButton getCloseButton() {
        if (closeButton == null) {
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");

                    try {
                        FileReader in = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = in.read(byt);
                        jTextArea.setText(new String(byt, 0, len));
                        in.close();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    public static void main(String[] args) {
        Ftest thisClass = new Ftest();
        thisClass.setLayout();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }

}
