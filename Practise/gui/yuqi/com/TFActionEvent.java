package gui.yuqi.com;

import java.awt.*;
import java.awt.event.*;

public class TFActionEvent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFFrame();
	}

}

class TFFrame extends Frame
{
	TFFrame()
	{
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new TFActionListener());
		pack();
		setVisible(true);
	}
}

class TFActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		TextField tf = (TextField)e.getSource();//ָ���ڴ�ͬһ��
		System.out.println(tf.getText());
		tf.setText(""); //"���"
	}
}
