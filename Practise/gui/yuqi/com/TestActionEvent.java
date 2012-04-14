package gui.yuqi.com;

/*	范例名称：Java事件处理举例
 * 	源文件名称：TestActionEvent.java
 *	要  点：
 *  	1. Java事件处理机制
 *		2. 事件源、事件监听器概念及作用
 *		3. 如何在一个现有组件上注册监听器
 */

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent {
    public static void main(String args[]) {
			Frame f = new Frame("Test");//创建窗口
			Button b = new Button("Press Me!");//增加按钮
			Monitor bh = new Monitor();//监听器
			b.addActionListener(bh);//按钮增加监听器
			f.add(b,BorderLayout.CENTER);
			f.pack();
			f.setVisible(true);
    }
}

class Monitor implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed");    
    }
}
