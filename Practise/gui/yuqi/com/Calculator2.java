package gui.yuqi.com;
import java.awt.*;
import java.awt.event.*;
public class Calculator2 {
	//计算器的例子,09_持有对方引用 . avi  监管者
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YuqiFrame2 yf = new YuqiFrame2 ();
		yf.lauch();

	}

}
class YuqiFrame2 extends Frame {
	TextField num1 ,  num2 ,  num3 ;
	public void  lauch() {
		num1 = new TextField(10) ;
		num2 = new TextField(10) ;
		num3  = new TextField(10) ;
		Label lb = new Label ("+") ;
		Button bt  = new Button("=") ;
		bt.addActionListener(new YqMonitor(this)) ;
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
		/*	TextField num1 ,  num2 ,  num3 ; 

		public YqMonitor(TextField num1, TextField num2, TextField num3) {
			super();
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}*/
		YuqiFrame2 f = null ;
		public YqMonitor(YuqiFrame2 f) {
			super();
			this.f = f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int n1  = Integer.parseInt(f.num1.getText()) ;
			int n2  = Integer.parseInt(f.num2.getText()) ;
			f.num3.setText( ""+(n1+n2));
		}

	}

}
