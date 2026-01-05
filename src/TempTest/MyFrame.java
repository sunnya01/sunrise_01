package TempTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class MyJDialog extends  JDialog{
    public MyJDialog(MyFrame frame){
        super(frame,"第一个JDialog窗体",true);
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,100,100);
    }
}
public class MyFrame extends JFrame {
    public static void main(String[] args) {
        new MyFrame();
    }
    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JLabel lable01 = new JLabel("aaaa");
        //将标签的文字置于标签中间位置
        lable01.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(lable01);
        JButton button01 = new JButton("弹出对话框");

        button01.setBounds(10,10,100,21);



        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(button01);

        container.setVisible(true);
    }
}
