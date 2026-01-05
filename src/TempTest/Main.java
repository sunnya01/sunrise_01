package TempTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {

    public static void main(String[] args) {

        Example app = new Example();


        app.createJFrame("你好!");

    }
}

class Example extends JFrame {

    JFrame windows;

    Container container01;

    void createJFrame(String title) {

        //1.创建窗体
        windows = new JFrame(title);

        //1.1 获取窗体内的容器
        container01 = windows.getContentPane();

        //1.2 新建一个容器的标题
        JLabel lable01 = new JLabel("这是一个JFrame窗体");

        lable01.setHorizontalAlignment(SwingConstants.LEFT);

        container01.add(lable01);

        container01.setBackground(Color.WHITE);

        windows.setVisible(true);

        windows.setSize(1000, 1000);

        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button01 = new JButton("弹出对话框");

        button01.setBounds(10,10,100,21);

        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                new MyDialog(Example.this).setVisible(true);
                MyDialog dialog01 = new MyDialog(Example.this.windows);
                dialog01.setVisible(true);
            }
        });

        container01.add(button01);

    }

    class MyDialog extends JDialog {
        MyDialog(JFrame windows) {
            super(windows, "第一个JDialog窗体", true);
            Container container02 = getContentPane();
            container02.add(new Label("这是一个对话框"));
            setBounds(120, 120, 100, 100);
        }
    }

}