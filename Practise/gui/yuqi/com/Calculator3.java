package gui.yuqi.com;
import java.awt.*;
import java.awt.event.*;
public class Calculator3 {
	//计算器的例子,内部类
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YuqiFrame3 yf = new YuqiFrame3 ();
		yf.lauch();
	}

}
 
class YuqiFrame3 extends Frame {
	TextField num1 ,  num2 ,  num3 ;
	public void  lauch() {
		num1 = new TextField(10) ;
		num2 = new TextField(10) ;
		num3  = new TextField(10) ;
		Label lb = new Label ("+") ;
		Button bt  = new Button("=") ;
		bt.addActionListener(new YqMonitor()) ;
		setLayout (new FlowLayout ()) ;
		add(num1) ;
		add(lb) ;
		add(num2) ;
		add(bt) ;
		add(num3) ;
		pack();
		setVisible(true) ;
	}
	
	class YqMonitor implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int n1  = Integer.parseInt(num1.getText()) ;
			int n2  = Integer.parseInt(num2.getText()) ;
			num3.setText( ""+(n1+n2));
		}

	}

}
